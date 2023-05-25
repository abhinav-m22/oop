import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addition extends JFrame {
    public JTextField displayField;
    public double num1, num2;
    public String operator;

    public Addition(){
        setTitle("Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        displayField = new JTextField(15);
        displayField.setEditable(false);
        displayField.setHorizontalAlignment(JTextField.RIGHT);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for(String label: buttonLabels){
            JButton button = new JButton(label);
            button.addActionListener(new ButtonListener());
            buttonPanel.add(button);
        }
        setLayout(new BorderLayout(10, 10));
        add(displayField, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }
}

class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        String buttonText = ((JButton) e.getSource()).getText();
        if (buttonText.matches("[0-9.]")) {
            displayField.setText(displayField.getText() + buttonText);
            
    }
}
