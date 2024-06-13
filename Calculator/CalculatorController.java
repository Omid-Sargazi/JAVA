package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;
    private double operand1;
    private double operand2;
    private String operator;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
        this.operand1 = 0;
        this.operand2 = 0;
        this.operator = "";

        addListeners();
    }

    private void addListeners() {
        for (JButton button : view.getNumberButtons()) {
            button.addActionListener(new NumberButtonListener());
        }

        for (JButton button : view.getOperatorButtons()) {
            button.addActionListener(new OperatorButtonListener());
        }

        view.getEqualsButton().addActionListener(new EqualsButtonListener());
        view.getClearButton().addActionListener(new ClearButtonListener());
    }

    private class NumberButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String value = ((JButton) e.getSource()).getText();
            view.getDisplay().setText(view.getDisplay().getText() + value);
        }
    }

    private class OperatorButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            operand1 = Double.parseDouble(view.getDisplay().getText());
            operator = ((JButton) e.getSource()).getText();
            view.getDisplay().setText("");
        }
    }

    private class EqualsButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            operand2 = Double.parseDouble(view.getDisplay().getText());
            double result = model.calculate(operand1, operand2, operator);
            view.getDisplay().setText(String.valueOf(result));
        }
    }

    private class ClearButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.getDisplay().setText("");
            operand1 = 0;
            operand2 = 0;
            operator = "";
        }
    }

}
