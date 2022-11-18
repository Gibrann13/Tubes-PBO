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
public class Menu_gantiJadwal implements ActionListener{
    JFrame frameGantiJadwal;
    JPanel panelAwal, panelForm1;
    JLabel title, title2;
    JButton home, next, back, jam[], seatBut[], pesanan[];
    JScrollPane scrollPaneForm1;
    
    int banyakSeatDipilih;
    
    public Menu_gantiJadwal() {
        frameGantiJadwal = new JFrame("MENU GANTI JADWAL");
        frameGantiJadwal.pack();
        frameGantiJadwal.setSize(1000, 700);
        frameGantiJadwal.setLocationRelativeTo(null);
        frameGantiJadwal.getContentPane().setBackground(new Color(51, 153, 255));
        frameGantiJadwal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panelAwal = new JPanel();
        panelAwal.setLayout(null);
        panelAwal.setBackground(new Color(150,153, 255));
        panelAwal.setBounds(0, 20, 480, 600);
        
        title = new JLabel("HALO, SILAHKAN PILIH");
        title.setBounds(30, 20, 400, 50);
        title.setFont(new Font("Helvetica Neue", Font.BOLD, 30));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        
        title2 = new JLabel("PESANAN UNTUK DIUBAH");
        title2.setBounds(30, 50, 400, 50);
        title2.setFont(new Font("Helvetica Neue", Font.BOLD, 30));
        title2.setHorizontalAlignment(SwingConstants.CENTER);
        
        pesanan = new JButton[2]; //pesanan ini untuk masukin transaksi yang sudah dilakukan untuk diganti jadwalnya
        int xbut = 100;
        for (int i = 0; i < pesanan.length; i++) {
            pesanan[i] = new JButton("BANDUNG-JAKARTA " + i+1 + " NOV");
            pesanan[i].setBounds(100, xbut, 300, 50);
            pesanan[i].setFont(new Font("Helvetica Neue", Font.BOLD, 18));
            pesanan[i].setBackground(Color.lightGray);
            pesanan[i].addActionListener(this);
            xbut += 70;
        }
        
        
        home = new JButton("BACK TO HOME");
        home.setBounds(100, 450, 300, 50);
        home.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        home.addActionListener(this);
        
        panelAwal.add(home);
        panelAwal.add(title);
        panelAwal.add(title2);
        for (int i = 0; i < pesanan.length; i++) {
            panelAwal.add(pesanan[i]);
        }
        
        form1();
        frameGantiJadwal.add(panelAwal);
        frameGantiJadwal.setLayout(null);
        frameGantiJadwal.setVisible(true);
    }

    public void form1(){
        panelForm1 = new JPanel();
        panelForm1.setLayout(null);
        panelForm1.setBackground(Color.white);
        panelForm1.setBounds(480, 20, 500, 600);

        int xBut = 50;
        int yBut = 100;
        jam = new JButton[5];
        for (int i = 0; i < jam.length; i++) {
            jam[i] = new JButton(i+12 + ".00");
            if (i == 0) {
                jam[i].setBounds(xBut, yBut, 175, 50);
            }else if (i % 2 == 0) {
                yBut += 70;
                jam[i].setBounds(xBut, yBut, 175, 50);
            }else{
                jam[i].setBounds(xBut + 225, yBut, 175, 50);
            }
            jam[i].setBackground(Color.lightGray);
            jam[i].setFont(new Font("Helvetica Neue", Font.BOLD, 20));
            jam[i].addActionListener(this);
            
        }
        
        ImageIcon image1;
        JLabel img = new JLabel();
        image1 = new ImageIcon(getClass().getResource("smallvan.png"));
        img.setIcon(image1);
        yBut += 150;
        img.setBounds(50, yBut, 400, 500);
        img.setHorizontalAlignment(SwingConstants.CENTER);
        
        seatBut = new JButton[6];
        yBut += 500;
        xBut = (500 - 60*(seatBut.length))/2;
        for (int i = 0; i < seatBut.length; i++) {
            
            seatBut[i] = new JButton(i + "");
            seatBut[i].setBounds(xBut, yBut, 50, 50);
            xBut += 60;
            seatBut[i].setBackground(Color.lightGray);
            seatBut[i].setFont(new Font("Helvetica Neue", Font.BOLD, 20));
            seatBut[i].addActionListener(this);
        }
        
        next = new JButton("SELESAI");
        next.setBounds(100, yBut + 100, 300, 50);
        next.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        next.addActionListener(this);
        
        for (int i = 0; i < jam.length; i++) {
            panelForm1.add(jam[i]);
        }
        panelForm1.add(img);
        for (int i = 0; i < seatBut.length; i++) {
            panelForm1.add(seatBut[i]);
        }
        panelForm1.add(next);
        
        scrollPaneForm1 = new JScrollPane(panelForm1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPaneForm1.setBounds(480, 20, 500, 600);
        panelForm1.setPreferredSize(new Dimension(0, 1500));
        
        panelForm1.setEnabled(false);
        frameGantiJadwal.add(scrollPaneForm1);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == home) {
            frameGantiJadwal.dispose();
            new Menu_member();
        }
        
        if (ae.getSource() == next) {
            JOptionPane.showMessageDialog (null, "Pesanan anda akan segera di update!", "GANTI JADWAL", JOptionPane.INFORMATION_MESSAGE);
            frameGantiJadwal.dispose();
            new Menu_member();
        }
        
        for (int i = 0; i < 2; i++) {
                if (ae.getSource() == pesanan[i]) {
                    //buat ganti warna baackground yg dipilih dan ga dipilih
                    pesanan[i].setBackground(Color.yellow);
                    for (int j = 0; j < 2; j++) {
                        if (pesanan[j] != pesanan[i]) {
                            pesanan[j].setBackground(Color.lightGray);
                        }
                    }
                }
            }
        
        if (panelForm1.isVisible()) {
            //INI FORNYA BUAT CEK ARRAY JAM KE BRPA YG DICLICK
            for (int i = 0; i < 5; i++) {
                if (ae.getSource() == jam[i]) {
                    //buat ganti warna baackground yg dipilih dan ga dipilih
                    jam[i].setBackground(Color.yellow);
                    for (int j = 0; j < 5; j++) {
                        if (jam[j] != jam[i]) {
                            jam[j].setBackground(Color.lightGray);
                        }
                    }
                }
            }

            //INI FORNYA BUAT CEK ARRAY SEAT KE BRPA YG DICLICK
            for (int i = 0; i < 6; i++) {
                if (ae.getSource() == seatBut[i]) {
                    //buat ganti warna baackground yg diclick
                    if (seatBut[i].getBackground() == Color.YELLOW) {
                        seatBut[i].setBackground(Color.lightGray);
                        banyakSeatDipilih--;
                    }else{
                        seatBut[i].setBackground(Color.YELLOW);
                        banyakSeatDipilih++;
                    }
                    
                    // INI DIISI BANYAK TIKET YANG DIBELI
                    if (banyakSeatDipilih == 3) {
                        for (int j = 0; j < seatBut.length; j++) {
                            if (seatBut[j].getBackground() != Color.YELLOW) {
                                seatBut[j].setEnabled(false);
                            }
                        }
                    }else{
                        for (int j = 0; j < seatBut.length; j++) {
                            seatBut[j].setEnabled(true);
                        }
                    }
                }
            }
        }
        
        
        
    }
    
    public static void main(String[] args) {
        new Menu_gantiJadwal();
    }
}
