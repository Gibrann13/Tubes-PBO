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
    JPanel panelAwal, panelForm1, panelForm2, panelTransaksi, panelDetail;
    JLabel title, title2, labelSeat, labelQrGopay, labelBca;
    JComboBox lokasi, rute, jumlahPenumpang;
    JDatePickerImpl datePicker;
    JButton home, next, back, jam[],seatBut[], gopay, bca;
    JScrollPane scrollPaneForm2;
    
    int banyakSeatDipilih;
    
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
        
        title = new JLabel("HALO, SILAHKAN PILIH");
        title.setBounds(30, 180, 400, 50);
        title.setFont(new Font("Helvetica Neue", Font.BOLD, 30));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        
        title2 = new JLabel("TANGGAL & RUTE");
        title2.setBounds(30, 210, 400, 50);
        title2.setFont(new Font("Helvetica Neue", Font.BOLD, 30));
        title2.setHorizontalAlignment(SwingConstants.CENTER);
        
        home = new JButton("BACK TO HOME");
        home.setBounds(100, 450, 300, 50);
        home.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        home.addActionListener(this);
        
        panelAwal.add(home);
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
        
        back = new JButton("BACK");
        back.setBounds(80, yBut + 100, 150, 50);
        back.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        back.addActionListener(this);
        next.setBounds(270, yBut + 100, 150, 50);
        
        for (int i = 0; i < jam.length; i++) {
            panelForm2.add(jam[i]);
        }
        panelForm2.add(img);
        for (int i = 0; i < seatBut.length; i++) {
            panelForm2.add(seatBut[i]);
        }
        panelForm2.add(next);
        panelForm2.add(back);
        
        scrollPaneForm2 = new JScrollPane(panelForm2, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPaneForm2.setBounds(480, 20, 500, 600);
        panelForm2.setPreferredSize(new Dimension(0, 1500));
        framePesanTiket.add(scrollPaneForm2);
    }
    
    public void formTransaksi(){
        panelDetail = new JPanel();
        panelDetail.setLayout(null);
        panelDetail.setBackground(new Color(150,153, 255));
        panelDetail.setBounds(0, 20, 480, 600);
        
        title.setText("Booking Detail");
        title2.setText("Payment Detail");
        title.setBounds(30, 20, 400, 50);
        title2.setBounds(30, 200, 400, 50);
        
        JLabel labelRuteTrans = new JLabel("RUTE: INI ISI RUTE YANG DIPILIH");
        labelRuteTrans.setBounds(30, 60, 400, 50);
        labelRuteTrans.setFont(new Font("Helvetica Neue", Font.ROMAN_BASELINE, 18));
        
        JLabel labelTanggalBerangkatTrans = new JLabel("TANGGAL: TANGGAL DIA BERANGKAT");
        labelTanggalBerangkatTrans.setBounds(30, 90, 400, 50);
        labelTanggalBerangkatTrans.setFont(new Font("Helvetica Neue", Font.ROMAN_BASELINE, 18));
        
        JLabel labelJamBerangkatTrans = new JLabel("JAM: JAM DIA BERANGKAT");
        labelJamBerangkatTrans.setBounds(30, 120, 400, 50);
        labelJamBerangkatTrans.setFont(new Font("Helvetica Neue", Font.ROMAN_BASELINE, 18));
        
        JLabel labelJumlahTiketTrans = new JLabel("JUMLAH TIKET: JUMLAH TIKET YANG DIBELI");
        labelJumlahTiketTrans.setBounds(30, 150, 400, 50);
        labelJumlahTiketTrans.setFont(new Font("Helvetica Neue", Font.ROMAN_BASELINE, 18));
        
        JLabel labelHargaTiketTrans = new JLabel("HARGA TIKET: HARGANYA");
        labelHargaTiketTrans.setBounds(30, 250, 400, 50);
        labelHargaTiketTrans.setFont(new Font("Helvetica Neue", Font.ROMAN_BASELINE, 18));
        
        JLabel labelTotalBayarTrans = new JLabel("TOTAL: TOTAL YANG DIBAYAR");
        labelTotalBayarTrans.setBounds(30, 280, 400, 50);
        labelTotalBayarTrans.setFont(new Font("Helvetica Neue", Font.ROMAN_BASELINE, 18));
        
        panelDetail.add(labelRuteTrans);
        panelDetail.add(labelTanggalBerangkatTrans);
        panelDetail.add(labelJamBerangkatTrans);
        panelDetail.add(labelJumlahTiketTrans);
        panelDetail.add(labelHargaTiketTrans);
        panelDetail.add(labelTotalBayarTrans);
        panelDetail.add(title);
        panelDetail.add(title2);
        
        
        panelTransaksi = new JPanel();
        panelTransaksi.setLayout(null);
        panelTransaksi.setBackground(Color.white);
        panelTransaksi.setBounds(480, 20, 500, 600);
        
        
        gopay = new JButton("GO-PAY");
        gopay.setBackground(Color.yellow);
        gopay.setBounds(100, 50, 300, 50);
        gopay.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        gopay.addActionListener(this);
        
        bca = new JButton("BCA Virtual Account");
        bca.setBackground(Color.lightGray);
        bca.setBounds(100, 110, 300, 50);
        bca.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        bca.addActionListener(this);
        
        labelQrGopay = new JLabel();
        ImageIcon qr = new ImageIcon(getClass().getResource("qrGopay.jpg"));
        labelQrGopay.setIcon(qr);
        labelQrGopay.setBounds(100, 200, 300, 200);
        labelQrGopay.setHorizontalAlignment(SwingConstants.CENTER);
        
        labelBca = new JLabel();
        ImageIcon bcaa = new ImageIcon(getClass().getResource("bca.png"));
        labelBca.setIcon(bcaa);
        labelBca.setBounds(100, 200, 300, 200);
        labelBca.setHorizontalAlignment(SwingConstants.CENTER);
        labelBca.setVisible(false);
        
        back = new JButton("BACK");
        back.setBounds(80, 450, 150, 50);
        back.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        back.addActionListener(this);
        next.setText("SELESAI");
        next.setBounds(270, 450, 150, 50);
        
        panelTransaksi.add(gopay);
        panelTransaksi.add(bca);
        panelTransaksi.add(labelQrGopay);
        panelTransaksi.add(labelBca);
        panelTransaksi.add(next);
        panelTransaksi.add(back);
        
        framePesanTiket.add(panelDetail);
        framePesanTiket.add(panelTransaksi);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == home) {
            framePesanTiket.dispose();
            new Menu_member();
        }
        
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
            }else if (scrollPaneForm2.isVisible()) {
                scrollPaneForm2.setVisible(false);
                panelAwal.setVisible(false);
                formTransaksi();
            }else if (panelTransaksi.isVisible()) {
                JOptionPane.showMessageDialog (null, "Terima Kasih Telah Melakukan Pembayaran.\nPesanan anda akan segera di konfirmasi!", "PAYMENT", JOptionPane.INFORMATION_MESSAGE);
                framePesanTiket.dispose();
                new Menu_member();
            }
        }
        
        if (ae.getSource() == back) {
            if (scrollPaneForm2.isVisible()) {
                scrollPaneForm2.setVisible(false);
                title2.setText("TANGGAL & RUTE");
                next.setBounds(100, 450, 300, 50);
                form1();
            }else if (panelTransaksi.isVisible()) {
                panelTransaksi.setVisible(false);
                title.setText("HALO, SILAHKAN PILIH");
                title2.setText("JAM & TEMPAT DUDUK");
                title2.setBounds(30, 210, 400, 50);
                title.setBounds(30, 180, 400, 50);
                panelAwal.add(title);
                panelAwal.add(title2);
                panelAwal.setVisible(true);
                panelDetail.setVisible(false);
                form2();
            }
            
        }
        
        // BIAR CUMAN BISA DIPAKE PAS FORM2 VISIBLE, SOALNYA KLO GA PAKE INI ERROR DIA
        if (panelForm1.isVisible() == false) {
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

                    if (banyakSeatDipilih == Integer.parseInt((String) jumlahPenumpang.getSelectedItem())) {
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
        
        if (ae.getSource() == gopay) {
            gopay.setBackground(Color.yellow);
            bca.setBackground(Color.lightGray);
            labelQrGopay.setVisible(true);
            labelBca.setVisible(false);
        }
        
        if (ae.getSource() == bca) {
            bca.setBackground(Color.yellow);
            gopay.setBackground(Color.lightGray);
            labelBca.setVisible(true);
            labelQrGopay.setVisible(false);
        }
        
    }
    
    public static void main(String[] args) {
        new Menu_pesanTiket();
    }
    
}
