import javax.swing.*;
import java.awt.*;

public class _9 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(500, 500);

        JPanel panel = new JPanel();

        JMenuBar menubar = new JMenuBar();
        JMenu file = new JMenu("Help");
        JMenu help = new JMenu("File");

        menubar.add(file);
        menubar.add(help);

        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");

        file.add(open);
        file.add(save);

        JTextArea txt = new JTextArea();

        JTextField text = new JTextField(15);
        JButton reset = new JButton("reset");
        JButton submit = new JButton("submit");
        JLabel label = new JLabel("Please Enter Text");

        panel.add(label);
        panel.add(text);
        panel.add(submit);
        panel.add(reset);

        jf.getContentPane().add(menubar, BorderLayout.NORTH);
        jf.getContentPane().add(panel, BorderLayout.SOUTH);
        jf.getContentPane().add(txt, BorderLayout.CENTER);

        jf.setVisible(true);


    }
}