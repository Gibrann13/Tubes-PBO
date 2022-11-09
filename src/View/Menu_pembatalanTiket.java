/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author jonjovio
 */
public class Menu_pembatalanTiket implements ActionListener{
    JFrame framePembatalanTiket;
    JButton home, next, pesanan[];
    
    public Menu_pembatalanTiket(){
        framePembatalanTiket = new JFrame("MENU GANTI JADWAL");
        framePembatalanTiket.pack();
        framePembatalanTiket.setSize(1000, 700);
        framePembatalanTiket.setLocationRelativeTo(null);
        framePembatalanTiket.getContentPane().setBackground(new Color(51, 153, 255));
        framePembatalanTiket.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel title = new JLabel("SILAHKAN PILIH");
        title.setBounds(200, 20, 600, 50);
        title.setFont(new Font("Helvetica Neue", Font.BOLD, 30));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel title2 = new JLabel("PESANAN UNTUK DIBATALKAN");
        title2.setBounds(200, 50, 600, 50);
        title2.setFont(new Font("Helvetica Neue", Font.BOLD, 30));
        title2.setHorizontalAlignment(SwingConstants.CENTER);
        
        pesanan = new JButton[3]; //pesanan ini untuk masukin transaksi yang sudah dilakukan untuk dibatalin
        int xbut = 130;
        int ybut = 150;
        for (int i = 0; i < pesanan.length; i++) {
            int temp = xbut;
            pesanan[i] = new JButton("BANDUNG-JAKARTA " + i+1 + " NOV");
            pesanan[i].setBounds(ybut, xbut, 300, 60);
            pesanan[i].setFont(new Font("Helvetica Neue", Font.BOLD, 18));
            pesanan[i].setBackground(Color.lightGray);
            pesanan[i].addActionListener(this);
            
            if (i % 2 == 0) {
                xbut = temp;
                ybut = 550;
            }else {
                ybut = 150;
                xbut += 80;
            }
        }
        
        next = new JButton("SELESAI");
        next.setBounds(525, 500, 250, 60);
        next.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        next.addActionListener(this);
        next.setEnabled(false);
        
        home = new JButton("BACK TO HOME");
        home.setBounds(225, 500, 250, 60);
        home.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        home.addActionListener(this);
        
        framePembatalanTiket.add(home);
        framePembatalanTiket.add(next);
        framePembatalanTiket.add(title);
        framePembatalanTiket.add(title2);
        for (int i = 0; i < pesanan.length; i++) {
            framePembatalanTiket.add(pesanan[i]);
        }
        
        framePembatalanTiket.setLayout(null);
        framePembatalanTiket.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getSource() == home) {
            framePembatalanTiket.dispose();
            new Menu_member();
        }
        
        if (ae.getSource() == next) {
            JOptionPane.showMessageDialog (null, "Pesanan anda akan segera di batalkan!", "PEMBATALAN TIKET", JOptionPane.INFORMATION_MESSAGE);
            framePembatalanTiket.dispose();
            new Menu_member();
        }
        
        for (int i = 0; i < 3; i++) {
            if (ae.getSource() == pesanan[i]) {
                //buat ganti warna baackground yg dipilih dan ga dipilih
                pesanan[i].setBackground(Color.yellow);
                for (int j = 0; j < 3; j++) {
                    if (pesanan[j] != pesanan[i]) {
                        pesanan[j].setBackground(Color.lightGray);
                    }
                }
                next.setEnabled(true);
            }
        }
        
    }
    
    public static void main(String[] args) {
        new Menu_pembatalanTiket();
    }
    
}
