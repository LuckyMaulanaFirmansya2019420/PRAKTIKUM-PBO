import javax.swing.*;

public class MainForm extends JFrame {
    public MainForm() {
        setTitle("Main Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel welcomeLabel = new JLabel("Welcome to the main form!");
        add(welcomeLabel);
    }
}
