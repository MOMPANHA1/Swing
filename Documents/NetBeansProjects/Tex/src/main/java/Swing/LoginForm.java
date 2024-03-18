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
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LoginForm {
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    
    public static void main(String[] args) {
        // TODO code application logic here
        EventQueue.invokeLater(() -> {
            try {
                LoginForm window = new LoginForm();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    public LoginForm() {
        initialize();
    }
    private void initialize(){
        frame = new JFrame("Login Form");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout());
        
        JLabel usernameLabel = new JLabel("Username:");
        frame.getContentPane().add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setColumns(10);
        frame.getContentPane().add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        frame.getContentPane().add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setColumns(10);
        frame.getContentPane().add(passwordField);
        
        JButton loginButton = new JButton("Log In");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                System.out.println("Username: " + username);
                System.out.println("Password: " + password);
            }
        });
        frame.getContentPane().add(loginButton);
    }
}
