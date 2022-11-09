/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author jonjovio
 */
public class Menu_riwayatTransaksi implements ActionListener{
    JFrame frameRiwayatTransaksi;
    JButton home;
    
    public Menu_riwayatTransaksi(){
        JLabel rute[], tanggal[], jam[], banyakTiket[], caraPembayaran[], totalBayar[], title[];
        
        frameRiwayatTransaksi = new JFrame("MENU RIWAYAT TRANSAKSI");
        frameRiwayatTransaksi.pack();
        frameRiwayatTransaksi.setSize(1000, 700);
        frameRiwayatTransaksi.setLocationRelativeTo(null);
        frameRiwayatTransaksi.getContentPane().setBackground(new Color(51, 153, 255));
        frameRiwayatTransaksi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        title = new JLabel[4];
        rute = new JLabel[4];
        tanggal = new JLabel[4];
        jam = new JLabel[4];
        banyakTiket = new JLabel[4];
        caraPembayaran = new JLabel[4];
        totalBayar = new JLabel[4];
        
        
        int xbut = 20;
        int ybut = 150;
        for (int i = 0; i < 4; i++) {
            int temp = xbut;
            
            title[i] = new JLabel("TRANSAKSI " + (i+1));
            title[i].setBounds(ybut, xbut, 300, 50);
            title[i].setFont(new Font("Helvetica Neue", Font.BOLD, 30));
            xbut += 30;
            
            rute[i] = new JLabel("Rute: Bandung-Jakarta " + i+1);
            rute[i].setBounds(ybut, xbut, 300, 50);
            rute[i].setFont(new Font("Helvetica Neue", Font.ROMAN_BASELINE, 18));
            xbut += 30;
            
            tanggal[i] = new JLabel("Tanggal: " + i+1 + " NOV");
            tanggal[i].setBounds(ybut, xbut, 300, 50);
            tanggal[i].setFont(new Font("Helvetica Neue", Font.ROMAN_BASELINE, 18));
            xbut += 30;
            
            jam[i] = new JLabel("Jam: " + i+1 + ":00");
            jam[i].setBounds(ybut, xbut, 300, 50);
            jam[i].setFont(new Font("Helvetica Neue", Font.ROMAN_BASELINE, 18));
            xbut += 30;
            
            banyakTiket[i] = new JLabel("Tiket: " + (i+1));
            banyakTiket[i].setBounds(ybut, xbut, 300, 50);
            banyakTiket[i].setFont(new Font("Helvetica Neue", Font.ROMAN_BASELINE, 18));
            xbut += 30;
            
            caraPembayaran[i] = new JLabel("Cara Pembayaran: Gopay");
            caraPembayaran[i].setBounds(ybut, xbut, 300, 50);
            caraPembayaran[i].setFont(new Font("Helvetica Neue", Font.ROMAN_BASELINE, 18));
            xbut += 30;
            
            totalBayar[i] = new JLabel("Total Bayar: " + (i+1) * 150000);
            totalBayar[i].setBounds(ybut, xbut, 300, 50);
            totalBayar[i].setFont(new Font("Helvetica Neue", Font.ROMAN_BASELINE, 18));
            
            if (i % 2 == 0) {
                xbut = temp;
                ybut = 600;
            }else {
                ybut = 150;
                xbut += 80;
            }
        }
        
        home = new JButton("BACK TO HOME");
        home.setBounds(340, xbut, 300, 50);
        home.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        home.addActionListener(this);
        
        for (int i = 0; i < 4; i++) {
            frameRiwayatTransaksi.add(title[i]);
            frameRiwayatTransaksi.add(rute[i]);
            frameRiwayatTransaksi.add(tanggal[i]);
            frameRiwayatTransaksi.add(jam[i]);
            frameRiwayatTransaksi.add(banyakTiket[i]);
            frameRiwayatTransaksi.add(caraPembayaran[i]);
            frameRiwayatTransaksi.add(totalBayar[i]);
        }
        frameRiwayatTransaksi.add(home);
        frameRiwayatTransaksi.setLayout(null);
        frameRiwayatTransaksi.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == home) {
            frameRiwayatTransaksi.dispose();
            new Menu_member();
        }
    }
    
    public static void main(String[] args) {
        new Menu_riwayatTransaksi();
    }
    
}
