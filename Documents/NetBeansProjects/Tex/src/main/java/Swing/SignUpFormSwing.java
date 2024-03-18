/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Swing;

/**
 *
 * @author TUF
 */
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SignUpFormSwing {
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPasswordField rePasswordField;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                SignUpFormSwing window = new SignUpFormSwing();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    public SignUpFormSwing() {
        initialize();
    }
    private void initialize(){
        frame = new JFrame("Sign Up Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);
        
        JPanel contentPanel = new JPanel();
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        frame.add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
        
        JPanel usernamePanel = new JPanel();
        contentPanel.add(usernamePanel);
        usernamePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JLabel usernameLabel = new JLabel("Username:");
        usernamePanel.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setColumns(10);
        usernamePanel.add(usernameField);

        JPanel passwordPanel = new JPanel();
        contentPanel.add(passwordPanel);
        passwordPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel passwordLabel = new JLabel("Password:");
        passwordPanel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setColumns(10);
        passwordPanel.add(passwordField);

        JPanel rePasswordPanel = new JPanel();
        contentPanel.add(rePasswordPanel);
        rePasswordPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel rePasswordLabel = new JLabel("Re-enter Password:");
        rePasswordPanel.add(rePasswordLabel);
        
        rePasswordField = new JPasswordField();
        rePasswordField.setColumns(10);
        rePasswordPanel.add(rePasswordField);

        JPanel buttonPanel = new JPanel();
        frame.add(buttonPanel, BorderLayout.SOUTH);

        JButton signUpButton = new JButton("Sign Up");
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                String rePassword = new String(rePasswordField.getPassword());

                // Add validation logic here:
                if (validateSignUp(username, password, rePassword)) {
                    // Sign-up logic (can be placeholder for now)
                    JOptionPane.showMessageDialog(frame, "Sign Up Successful!");
                }
            }
        });
        buttonPanel.add(signUpButton);
}
    // Function to validate user input
    private boolean validateSignUp(String username, String password, String rePassword) {
        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please enter a username.");
            return false;
        }

        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please enter a password.");
            return false;
        }

        if (!password.equals(rePassword)) {
            JOptionPane.showMessageDialog(frame, "Passwords do not match. Please re-enter.");
            return false;
        }

        // Add any additional validation rules here (e.g., password strength)
        // ...

        return true;  // All validations passed
    }
}