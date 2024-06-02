package filesProject;

import java.util.Stack;

public class ExpressionEvaluator {

    // Helper method to evaluate simple expressions without parentheses
    private static double evaluateSimpleExpression(String expression) {
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operations = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch) || ch == '.') {
                StringBuilder sb = new StringBuilder();
                while (i < expression.length()
                        && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    sb.append(expression.charAt(i));
                    i++;
                }
                i--;
                numbers.push(Double.parseDouble(sb.toString()));
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operations.isEmpty() && hasPrecedence(ch, operations.peek())) {
                    numbers.push(applyOperation(operations.pop(), numbers.pop(), numbers.pop()));
                }
                operations.push(ch);
            }
        }

        while (!operations.isEmpty()) {
            numbers.push(applyOperation(operations.pop(), numbers.pop(), numbers.pop()));
        }

        return numbers.pop();
    }

    // Method to check operator precedence
    private static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
            return false;
        }
        return true;
    }

    // Method to apply an operation and return the result
    private static double applyOperation(char op, double b, double a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new UnsupportedOperationException("Cannot divide by zero");
                }
                return a / b;
        }
        return 0;
    }

    // Method to evaluate an expression with parentheses
    public static double evaluateExpression(String expression) {
        Stack<Integer> parentheses = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                parentheses.push(i);
            } else if (expression.charAt(i) == ')') {
                int start = parentheses.pop();
                String subExpression = expression.substring(start + 1, i);
                double result = evaluateSimpleExpression(subExpression);
                expression = expression.substring(0, start) + result + expression.substring(i + 1);
                i = start;
            }
        }
        return evaluateSimpleExpression(expression);
    }

    public static void main(String[] args) {
        // Test expression
        String expression = "1+2+3*(4+5+6)";
        double result = evaluateExpression(expression);
        System.out.println("Result: " + result); // Expected: 1+2+3*(15) = 1+2+45 = 48
    }
}
