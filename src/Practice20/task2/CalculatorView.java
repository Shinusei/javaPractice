package Practice20.task2;

import javax.swing.*;
import java.awt.*;

// Представление (View)
class CalculatorView {
    private JFrame frame;
    private JTextField display;
    private JButton[] numberButtons = new JButton[10];
    private JButton[] operationButtons = {new JButton("+"), new JButton("-"), new JButton("*"), new JButton("/")};
    private JButton clearButton;
    private JButton calculateButton;
    private CalculatorController controller;

    public CalculatorView() {
        createView();
    }

    public void createView() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);

        display = new JTextField();
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));

        GridLayout gridLayout = new GridLayout(4, 3);
        JPanel panel = new JPanel(gridLayout);

        for (int i = 7; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            panel.add(numberButtons[i]);
        }
        operationButtons[0].setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(operationButtons[0]);
        for (int i = 4; i < 7; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            panel.add(numberButtons[i]);
        }
        operationButtons[1].setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(operationButtons[1]);
        for (int i = 1; i < 4; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            panel.add(numberButtons[i]);
        }
        operationButtons[2].setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(operationButtons[2]);
            numberButtons[0] = new JButton(String.valueOf(0));
            panel.add(numberButtons[0]);
        operationButtons[3].setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(operationButtons[3]);

        clearButton = new JButton("C");
        clearButton.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(clearButton);

        calculateButton = new JButton("=");
        calculateButton.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(calculateButton);

        frame.add(display, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public void setController(CalculatorController controller) {
        this.controller = controller;

        for (int i = 0; i < 10; i++) {
            int finalI = i;
            numberButtons[i].addActionListener(e -> controller.numberPressed(finalI));
        }

        for (int i = 0; i < 4; i++) {
            int finalI = i;
            operationButtons[i].addActionListener(e -> controller.operationPressed(operationButtons[finalI].getText()));
        }

        clearButton.addActionListener(e -> controller.clear());
        calculateButton.addActionListener(e -> controller.calculateResult());
    }

    public void setDisplay(double value) {
        display.setText(String.valueOf(value));
    }
}
