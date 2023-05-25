import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingCalculator extends JFrame {
    private JTextField textField;
    private JButton[] buttons;
    private String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
    };

    public SwingCalculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(280, 40));
        textField.setEditable(false);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        buttons = new JButton[buttonLabels.length];
        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttonPanel.add(buttons[i]);
            buttons[i].addActionListener(new ButtonClickListener());
        }

        setLayout(new FlowLayout());
        add(textField);
        add(buttonPanel);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            String text = textField.getText();

            switch (command) {
                case "=":
                    try {
                        double result = evaluateExpression(text);
                        textField.setText(String.valueOf(result));
                    } catch (ArithmeticException ex) {
                        textField.setText("Error");
                    }
                    break;
                default:
                    textField.setText(text + command);
                    break;
            }
        }
    }

    private double evaluateExpression(String expression) {
        double result = 0;
        try {
            result = (double) new javax.script.ScriptEngineManager().getEngineByName("JavaScript").eval(expression);
        } catch (Exception e) {
            throw new ArithmeticException();
        }
        return result;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingCalculator().setVisible(true);
            }
        });
    }
}
