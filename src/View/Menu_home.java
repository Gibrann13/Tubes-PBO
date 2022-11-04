/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Gibran<>
 */
public class Menu_home {

    public View() {

        JFrame frameAwal = new JFrame("Form Data");
        frameAwal.setSize(600, 600);
        frameAwal.setLocationRelativeTo(null);

        JLabel labelSelamatDatang = new JLabel();
        labelSelamatDatang.setText("Selamat datang,di");
        labelSelamatDatang.setBounds(200, 180, 400, 50);
        labelSelamatDatang.setOpaque(true);
        labelSelamatDatang.setFont(new Font("Helvetica Neue", Font.BOLD, 23));

        JLabel labelSelamatDatang2 = new JLabel();
        labelSelamatDatang2.setText("Travel Apanih");
        labelSelamatDatang2.setBounds(220, 220, 400, 50);
        labelSelamatDatang2.setOpaque(true);
        labelSelamatDatang2.setFont(new Font("Helvetica Neue", Font.BOLD, 23));

        JButton buttonLogIn;
        buttonLogIn = new JButton("Log In");
        buttonLogIn.setBounds(220, 270, 150, 20);
        buttonLogIn.setEnabled(true);

        JButton buttonRegister;
        buttonRegister = new JButton("Register");
        buttonRegister.setBounds(220, 305, 150, 20);
        buttonRegister.setEnabled(true);

//        frameAwal.setLayout( new GridBagLayout() );
//        frameAwal.add(buttonLogIn, new GridBagConstraints());
//        frameAwal.add(buttonRegister, new GridBagConstraints());
//        frameAwal.add(labelSelamatDatang, new GridBagConstraints());
        frameAwal.add(buttonLogIn);
        frameAwal.add(buttonRegister);
        frameAwal.add(labelSelamatDatang);
        frameAwal.add(labelSelamatDatang2);

        frameAwal.setLayout(null);
        frameAwal.setVisible(true);
        
        //Frame Register
        JFrame frameRegister = new JFrame("Form Register");
        frameRegister.setSize(600, 600);
        frameRegister.setLocationRelativeTo(null);

        JButton buttonKembaliReg;
        buttonKembaliReg = new JButton("Kembali register");
        buttonKembaliReg.setBounds(220, 305, 150, 20);
        buttonKembaliReg.setEnabled(true);
        
        frameRegister.add(buttonKembaliReg);
        
        frameRegister.setLayout(null);
//        frameRegister.setVisible(true);
        
        
        //Frame Login
        JFrame frameLogIn = new JFrame("Form Log In");
        frameLogIn.setSize(600, 600);
        frameLogIn.setLocationRelativeTo(null);

        JButton buttonKembaliLogin;
        buttonKembaliLogin = new JButton("Kembali login");
        buttonKembaliLogin.setBounds(220, 335, 150, 20);
        buttonKembaliLogin.setEnabled(true);
        
        JButton buttonSubmitLogin;
        buttonSubmitLogin = new JButton("Submit");
        buttonSubmitLogin.setBounds(220, 305, 150, 20);
        buttonSubmitLogin.setEnabled(true);

        JTextField nickname;
        
        JLabel labelNama = new JLabel();
        labelNama.setText("Nickname :");
        labelNama.setBounds(190, 220, 100, 30);
        labelNama.setOpaque(true);
        nickname = new JTextField("");        
        nickname.setBounds(289, 220, 100, 30);   
        
        JPasswordField password = new JPasswordField();   
        JLabel Labelpass=new JLabel("Password:");    
        Labelpass.setBounds(210,250, 100,30);    
        password.setBounds(275,250,100,30);
        
        frameLogIn.add(buttonKembaliLogin);
        frameLogIn.add(Labelpass);
        frameLogIn.add(password);
        frameLogIn.add(labelNama);
        frameLogIn.add(nickname);
        frameLogIn.add(buttonSubmitLogin);

        frameLogIn.setLayout(null);
//        frameRegister.setVisible(true);
        
        
        buttonRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frameAwal.setVisible(false);
                frameRegister.setVisible(true);
                

            }
            });
        
        buttonLogIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frameAwal.setVisible(false);
                frameLogIn.setVisible(true);
                

            }
            });

        
        buttonKembaliReg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frameAwal.setVisible(true);
                frameRegister.setVisible(false);
                

            }
            });

        buttonKembaliLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frameAwal.setVisible(true);
                frameLogIn.setVisible(false);
                

            }
            });

    
    
    }

    public static void main(String[] args) {
        new View();
    }
}
