package Calculator;

import javax.swing.*;
import java.awt.*;

public class CalculatorView {
    private JFrame frame;
    private JTextField display;
    private JPanel panel;
    private JButton[] numberButtons;
    private JButton[] operatorButtons;
    private JButton equalsButton, clearButton;

    public CalculatorView() {
        frame = new JFrame("Calculator");
        display = new JTextField();
        panel = new JPanel();

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
        }

        String[] operators = { "+", "-", "*", "/" };
        operatorButtons = new JButton[operators.length];
        for (int i = 0; i < operators.length; i++) {
            operatorButtons[i] = new JButton(operators[i]);
        }

        equalsButton = new JButton("=");
        clearButton = new JButton("C");

        initialize();
    }

    private void initialize() {
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        display.setFont(new Font("Arial", Font.PLAIN, 24));
        display.setEditable(false);
        frame.add(display, BorderLayout.NORTH);

        panel.setLayout(new GridLayout(4, 4, 10, 10));
        for (JButton button : numberButtons) {
            panel.add(button);
        }
        for (JButton button : operatorButtons) {
            panel.add(button);
        }
        panel.add(equalsButton);
        panel.add(clearButton);

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }

    public JTextField getDisplay() {
        return display;
    }

    public JButton[] getNumberButtons() {
        return numberButtons;
    }

    public JButton[] getOperatorButtons() {
        return operatorButtons;
    }

    public JButton getEqualsButton() {
        return equalsButton;
    }

    public JButton getClearButton() {
        return clearButton;
    }

}
