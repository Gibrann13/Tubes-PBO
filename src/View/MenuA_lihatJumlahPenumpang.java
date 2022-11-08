/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Gibran<>
 */
public class MenuA_lihatJumlahPenumpang implements ActionListener{
    JFrame frameLiatPenumpang;
    JPanel panelAwal,panelForm1;
    JButton backKeMenu,ButtonSubmit;
        JComboBox lokasi, rute;

    MenuA_lihatJumlahPenumpang(){
        frameLiatPenumpang = new JFrame("MENU ADMIN LIHAT JUMLAH PENUMPANG");
        frameLiatPenumpang.pack();
        frameLiatPenumpang.setSize(1000, 700);
        frameLiatPenumpang.setLocationRelativeTo(null);
        frameLiatPenumpang.getContentPane().setBackground(new Color(51, 153, 255));
        frameLiatPenumpang.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelAwal = new JPanel();
        panelAwal.setLayout(null);
        panelAwal.setBackground(new Color(150, 153, 255));
        panelAwal.setBounds(0, 20, 480, 600);

        JLabel title = new JLabel("MENU LIHAT PENUMPANG");
        title.setBounds(30, 180, 400, 50);
        title.setFont(new Font("Helvetica Neue", Font.BOLD, 30));
        title.setHorizontalAlignment(SwingConstants.CENTER);

        panelAwal.add(title);

        form1();
        frameLiatPenumpang.add(panelAwal);
        frameLiatPenumpang.setLayout(null);
        frameLiatPenumpang.setVisible(true);

    }
    public void form1() { //MENU AWAL

        panelForm1 = new JPanel();
        panelForm1.setLayout(null);
        panelForm1.setBackground(Color.white);
        panelForm1.setBounds(480, 20, 500, 600);

        backKeMenu = new JButton("BACK");
        backKeMenu.setBounds(80, 450, 150, 50);
        backKeMenu.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        backKeMenu.addActionListener(this);

        ButtonSubmit = new JButton("Submit");
        ButtonSubmit.setBounds(260, 450, 150, 50);
        ButtonSubmit.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        ButtonSubmit.addActionListener(this);

        JLabel labelTanggal = new JLabel("Tanggal Keberangkatan");
        labelTanggal.setBounds(50, 100, 200, 30);
        labelTanggal.setFont(new Font("Helvetica Neue", Font.ITALIC, 18));
        
        //TANGGAL PAKE DATE
        
        
        JLabel labelLokasi = new JLabel("Lokasi Keberangkatan");
        labelLokasi.setBounds(50, 170, 200, 30);
        labelLokasi.setFont(new Font("Helvetica Neue", Font.ITALIC, 18));
        String lok[]={"Lokasi","Bandung","Jakarta","Malang","Surabaya"};
        lokasi = new JComboBox(lok);
        lokasi.setBounds(50, 200, 200, 30);
        lokasi.addActionListener(this);
        
        JLabel labelRute = new JLabel("Rute");
        labelRute.setBounds(50, 240, 200, 30);
        labelRute.setFont(new Font("Helvetica Neue", Font.ITALIC, 18));
        String rut[]={"Rute","Bandung","Jakarta","Malang","Surabaya"};
        rute = new JComboBox(rut);
        rute.setBounds(50, 270, 200, 30);
        rute.addActionListener(this);
       
        JLabel labelJenisMobil = new JLabel("Jenis Mobil");
        labelJenisMobil.setBounds(50, 310, 200, 30);
        labelJenisMobil.setFont(new Font("Helvetica Neue", Font.ITALIC, 18));
        //JENIS MOBIL ???

        panelForm1.add(labelLokasi);
        panelForm1.add(labelRute);
        panelForm1.add(labelTanggal);
        panelForm1.add(labelJenisMobil);
        panelForm1.add(lokasi);
        panelForm1.add(rute);
        panelForm1.add(backKeMenu);
        panelForm1.add(ButtonSubmit);

        frameLiatPenumpang.add(panelForm1);
    }
 @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == backKeMenu) {
            if (frameLiatPenumpang.isVisible()) {
                frameLiatPenumpang.setVisible(false);
                new MenuH_admin();
            }
        }
    }
    public static void main(String[] args) {
        new MenuA_lihatJumlahPenumpang();
    }
}
