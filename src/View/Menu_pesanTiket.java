/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import org.jdatepicker.impl.*;

/**
 *
 * @author jonjovio
 */
public class Menu_pesanTiket implements ActionListener{
    JFrame framePesanTiket;
    JPanel panelAwal, panelForm1, panelForm2, panelTransaksi;
    JLabel title2;
    JComboBox lokasi, rute, jumlahPenumpang;
    JDatePickerImpl datePicker;
    JButton next, back, jam[];
    JScrollPane scrollPane;
    
    Menu_pesanTiket(){
        framePesanTiket = new JFrame("MENU PESAN TIKET");
        framePesanTiket.pack();
        framePesanTiket.setSize(1000, 700);
        framePesanTiket.setLocationRelativeTo(null);
        framePesanTiket.getContentPane().setBackground(new Color(51, 153, 255));
        framePesanTiket.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panelAwal = new JPanel();
        panelAwal.setLayout(null);
        panelAwal.setBackground(new Color(150,153, 255));
        panelAwal.setBounds(0, 20, 480, 600);
        
        JLabel title = new JLabel("HALO, SILAHKAN PILIH");
        title.setBounds(30, 180, 400, 50);
        title.setFont(new Font("Helvetica Neue", Font.BOLD, 30));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        
        title2 = new JLabel("TANGGAL & RUTE");
        title2.setBounds(30, 210, 400, 50);
        title2.setFont(new Font("Helvetica Neue", Font.BOLD, 30));
        title2.setHorizontalAlignment(SwingConstants.CENTER);
        
        panelAwal.add(title);
        panelAwal.add(title2);
        
        form1();
        framePesanTiket.add(panelAwal);
        framePesanTiket.setLayout(null);
        framePesanTiket.setVisible(true);
    }

    public void form1() {
        panelForm1 = new JPanel();
        panelForm1.setLayout(null);
        panelForm1.setBackground(Color.white);
        panelForm1.setBounds(480, 20, 500, 600);
        
        JLabel labelTanggal = new JLabel("Tanggal Keberangkatan");
        labelTanggal.setBounds(50, 100, 200, 30);
        labelTanggal.setFont(new Font("Helvetica Neue", Font.ITALIC, 18));
        
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        datePicker.setBounds(50, 130, 200, 30);
        datePicker.addActionListener(this);
        
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
        rute.setEnabled(false);
        
        JLabel labelPenumpang = new JLabel("Total Penumpang");
        labelPenumpang.setBounds(50, 310, 200, 30);
        labelPenumpang.setFont(new Font("Helvetica Neue", Font.ITALIC, 18));
        String pen[]={"Total Penumpang","1","2","3","4","5"};
        jumlahPenumpang = new JComboBox(pen);
        jumlahPenumpang.setBounds(50, 340, 200, 30);
        jumlahPenumpang.addActionListener(this);
        jumlahPenumpang.setEnabled(false);
        
        next = new JButton("NEXT");
        next.setBounds(100, 450, 300, 50);
        next.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        next.addActionListener(this);
        
        panelForm1.add(labelTanggal);
        panelForm1.add(datePicker);
        panelForm1.add(labelLokasi);
        panelForm1.add(lokasi);
        panelForm1.add(labelRute);
        panelForm1.add(rute);
        panelForm1.add(labelPenumpang);
        panelForm1.add(jumlahPenumpang);
        panelForm1.add(next);
        
        framePesanTiket.add(panelForm1);
    }
    
    public void form2(){
        panelForm2 = new JPanel();
        panelForm2.setLayout(null);
        panelForm2.setBackground(Color.white);
        panelForm2.setBounds(480, 20, 500, 600);
        
        back = new JButton("BACK");
        back.setBounds(80, 450, 150, 50);
        back.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        back.addActionListener(this);
        next.setBounds(270, 450, 150, 50);
        

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
        
        for (int i = 0; i < jam.length; i++) {
            panelForm2.add(jam[i]);
        }
        panelForm2.add(next);
        panelForm2.add(back);
        
        scrollPane = new JScrollPane(panelForm2, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(480, 20, 500, 600);
        panelForm2.setPreferredSize(new Dimension(0, 1000));
        framePesanTiket.add(scrollPane);
    }
    
    public void formTransaksi(){
        
        panelTransaksi = new JPanel();
        panelTransaksi.setLayout(null);
        panelTransaksi.setBackground(Color.white);
        panelTransaksi.setBounds(480, 20, 500, 600);
        
        
        back = new JButton("BACK");
        back.setBounds(80, 450, 150, 50);
        back.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        back.addActionListener(this);
        next.setBounds(270, 450, 150, 50);
        
        panelTransaksi.add(next);
        panelTransaksi.add(back);
        
        framePesanTiket.add(panelTransaksi);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == datePicker) {
//            if (datePicker.getModel().getValue() == null) {
//
//            }
        }
        
        if (ae.getSource() == lokasi) {
            if (lokasi.getSelectedItem().equals("Lokasi")) {
                rute.setEnabled(false);
            }else{
                rute.setEnabled(true);
            }
        }
        
        if (ae.getSource() == rute) {
            if (lokasi.getSelectedItem().equals("Lokasi")) {
                jumlahPenumpang.setEnabled(false);
            }else{
                jumlahPenumpang.setEnabled(true);
            }
        }
        
        if (ae.getSource() == next) {
            if (panelForm1.isVisible()) {
                panelForm1.setVisible(false);
                title2.setText("JAM & TEMPAT DUDUK");
                form2();
            }else if (scrollPane.isVisible()) {
                scrollPane.setVisible(false);
                title2.setText("CARA PEMBAYARAN");
                formTransaksi();
            }
        }
        
        if (ae.getSource() == back) {
            if (scrollPane.isVisible()) {
                scrollPane.setVisible(false);
                title2.setText("TANGGAL & RUTE");
                next.setBounds(100, 450, 300, 50);
                form1();
            }else if (panelTransaksi.isVisible()) {
                panelTransaksi.setVisible(false);
                title2.setText("JAM & TEMPAT DUDUK");
                form2();
            }
            
        }
        
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
    }
    
    public static void main(String[] args) {
        new Menu_pesanTiket();
    }
    
}
