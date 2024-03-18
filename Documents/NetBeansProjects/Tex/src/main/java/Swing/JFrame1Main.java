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

public class JFrame1Main {

    public JFrame1Main() {
        frame= new JFrame();
        frame.setSize(600,600);//size 
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        btnOk=new JButton("OK");//create ok
        btnOk.setBounds(250, 300,150,50); // location
        frame.add(btnOk);//add it inside
        
        // start event
        btnOk.addActionListener((evt) -> {
            btnOkActionperformed(evt);
        });
        
       
    }
    
    
    public static void main(String[] args) {
//        try {
//            UIManager.setInstalledLookAndFeels(new NimbuslookAndFeel);
//        } catch (Exception e) {
//        }
        new JFrame1Main();
    }
    
    private JFrame frame;
    private JButton btnOk;
    private void btnOkActionperformed(ActionEvent evt){
        JOptionPane.showMessageDialog(frame, "boring ha ");
        
    }
    
}
