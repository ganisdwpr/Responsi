/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
class Login_Admin extends JFrame {
    
    String pass = "admin";
    final JTextField fusername = new JTextField(10);
    final JPasswordField fpassword = new JPasswordField(10);
    JLabel lusername = new JLabel(" Username ");
    JLabel lpassword = new JLabel(" Password ");
    JButton btnSave = new JButton("Login");
    JButton btnCancel = new JButton("Cancel");
    
    public void Login_Admin(){
        setTitle("Login Admin");
        setSize(330,175);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); 
        
        add(lusername);
        lusername.setBounds(10,15,120,20);
        add(fusername);
        fusername.setBounds(140,15,150,20);
        add(lpassword);
        lpassword.setBounds(10,40,120,20);
        add(fpassword);
        fpassword.setBounds(140,40,150,20);
        add(btnSave);
        btnSave.setBounds(165,80,100,20);
        add(btnCancel);
        btnCancel.setBounds(50,80,100,20);
        
    btnSave.addActionListener((ActionEvent e) -> {
    if(fusername.getText().equalsIgnoreCase("admin") && pass.equalsIgnoreCase(fpassword.getText()))
    {   JOptionPane.showMessageDialog(null, "Berhasil Login");
        MVC_Admin mvcp = new MVC_Admin();

        dispose();
    } else {
        JOptionPane.showMessageDialog(null, "username atau password salah");
    }
    
    });
        setVisible(true);
    }
}