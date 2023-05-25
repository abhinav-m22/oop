import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame{
    private JTextField displayField;
    private double num1, num2;
    private String operator;

    public CalculatorGUI(){
        setTitle("Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        displayField = new JTextField(15);
        displayField.setEditable(false);
        displayField.setHorizontalAlignment(JTextField.RIGHT);

        JPanel buttonPanel = new JPanel(new GridLayout(4,4,5,5));

        String buttonLabels[] = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for(String label : buttonLabels){
            JButton button = new JButton(label);
            button.addActionListener(new ButtonListener());
            buttonPanel.add(button);
        }

        setLayout(new BorderLayout(10, 10));
        add(displayField, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String buttonText = ((JButton) e.getSource()).getText();

            if (buttonText.matches("[0-9.]")) {
                displayField.setText(displayField.getText() + buttonText);
            } else if (buttonText.matches("[/*\\-+]")) {
                num1 = Double.parseDouble(displayField.getText());
                operator = buttonText;
                displayField.setText("");
            } else if (buttonText.equals("=")) {
                num2 = Double.parseDouble(displayField.getText());
                double result = calculateResult();
                displayField.setText(String.valueOf(result));
            }
        }
    }

    private double calculateResult(){
        double result = 0.0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(this, "Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new CalculatorGUI().setVisible(true);
            }
        });
    }
}


