import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("unused")
public class LoginApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

        JLabel messageLabel = new JLabel("");
        messageLabel.setBounds(100, 80, 200, 25);
        panel.add(messageLabel);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = userText.getText();
                String password = new String(passwordText.getPassword());

                if (user.equals("user") && password.equals("password")) {
                    // Login successful
                    JFrame mainForm = new JFrame();
                    mainForm.setVisible(true);
                    ((JFrame) SwingUtilities.getWindowAncestor(panel)).dispose();
                } else {
                    // Login failed
                    messageLabel.setText("Username / Password salah");
                }
            }
        });
    }
}
