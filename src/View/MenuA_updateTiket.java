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
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Gibran<>
 */
public class MenuA_updateTiket implements ActionListener{
    
    JFrame frameUpdateTiket;
    JLabel title2;
    JPanel panelAwal,panelForm1,panelForm3,panelForm4,panelForm2;
    JButton backKeMenu,ButtonSubmitUpdate,backFromUpdate,backFromTambah,ButtonSubmitTambah,tambahTiket,updateTiket,deleteTiket,ButtonSubmit,backFromDelete;
    JComboBox Tiket,TiketUpdate;
    JTextField InputIdTiket,InputIdRute,InputIdMobil,InputJam,InputTglTiket,InputHargaTiket;
    MenuA_updateTiket(){
        frameUpdateTiket = new JFrame("MENU ADMIN UPDATE TIKET");
        frameUpdateTiket.pack();
        frameUpdateTiket.setSize(1000, 700);
        frameUpdateTiket.setLocationRelativeTo(null);
        frameUpdateTiket.getContentPane().setBackground(new Color(51, 153, 255));
        frameUpdateTiket.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelAwal = new JPanel();
        panelAwal.setLayout(null);
        panelAwal.setBackground(new Color(150, 153, 255));
        panelAwal.setBounds(0, 20, 480, 600);

        JLabel title = new JLabel("MENU UPDATE TIKET");
        title.setBounds(30, 180, 400, 50);
        title.setFont(new Font("Helvetica Neue", Font.BOLD, 30));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        
        title2 = new JLabel("UPDATE / DELETE");
        title2.setBounds(30, 210, 400, 50);
        title2.setFont(new Font("Helvetica Neue", Font.BOLD, 30));
        title2.setHorizontalAlignment(SwingConstants.CENTER);

        panelAwal.add(title2);        
        panelAwal.add(title);

        form1();
        frameUpdateTiket.add(panelAwal);
        frameUpdateTiket.setLayout(null);
        frameUpdateTiket.setVisible(true);

    }
    
    public void form1() { //MENU AWAL

        panelForm1 = new JPanel();
        panelForm1.setLayout(null);
        panelForm1.setBackground(Color.white);
        panelForm1.setBounds(480, 20, 500, 600);

        tambahTiket = new JButton("Tambah Tiket");
        tambahTiket.setBounds(130, 100, 250, 100);
        tambahTiket.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        tambahTiket.addActionListener(this);
        
        updateTiket = new JButton("Update Tiket");
        updateTiket.setBounds(130, 220, 250, 100);
        updateTiket.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        updateTiket.addActionListener(this);

        deleteTiket = new JButton("Delete Tiket");
        deleteTiket.setBounds(130, 340, 250, 100);
        deleteTiket.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        deleteTiket.addActionListener(this);

        backKeMenu = new JButton("Back Ke Menu");
        backKeMenu.setBounds(130, 460, 250, 100);
        backKeMenu.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        backKeMenu.addActionListener(this);
        
        panelForm1.add(tambahTiket);
        panelForm1.add(updateTiket);
        panelForm1.add(deleteTiket);
        panelForm1.add(backKeMenu);

        frameUpdateTiket.add(panelForm1);
    }

    public void form3(){  //DELETE
        panelForm3 = new JPanel();
        panelForm3.setLayout(null);
        panelForm3.setBackground(Color.white);
        panelForm3.setBounds(480, 20, 500, 600);
        
        JLabel labelTiket = new JLabel("Pilih Tiket");
        labelTiket.setBounds(50, 170, 200, 30);
        labelTiket.setFont(new Font("Helvetica Neue", Font.ITALIC, 18));
        String IsiTiket[]={"Voucher1","Voucher2","Voucher3","Voucher2","Voucher1"};
        Tiket = new JComboBox(IsiTiket);
        Tiket.setBounds(50, 200, 200, 30);
        Tiket.addActionListener(this);

        ButtonSubmit = new JButton("HAPUS");
        ButtonSubmit.setBounds(300, 450, 150, 50);
        ButtonSubmit.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        ButtonSubmit.addActionListener(this);
        
        backFromDelete = new JButton("BACK");
        backFromDelete.setBounds(80, 450, 150, 50);
        backFromDelete.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        backFromDelete.addActionListener(this);
        
        panelForm3.add(backFromDelete);
        panelForm3.add(ButtonSubmit);
        panelForm3.add(labelTiket);
        panelForm3.add(Tiket);
        
        frameUpdateTiket.add(panelForm3);
        }

    public void form4(){  //TAMBAH
        panelForm4 = new JPanel();
        panelForm4.setLayout(null);
        panelForm4.setBackground(Color.white);
        panelForm4.setBounds(480, 20, 500, 600);
        
        JLabel labelIDTiket = new JLabel("ID TIKET :");
        labelIDTiket.setBounds(50, 40, 200, 30);
        labelIDTiket.setFont(new Font("Helvetica Neue", Font.ITALIC, 18));
        InputIdTiket = new JTextField("");        
        InputIdTiket.setBounds(50, 70, 200, 30);
        
        JLabel labelIDRute = new JLabel("ID RUTE :");
        labelIDRute.setBounds(50, 110, 200, 30);
        labelIDRute.setFont(new Font("Helvetica Neue", Font.ITALIC, 18));
        InputIdRute = new JTextField("");        
        InputIdRute.setBounds(50, 140, 200, 30);
        
        JLabel labelIDMobil = new JLabel("ID MOBIL :");
        labelIDMobil.setBounds(50, 180, 200, 30);
        labelIDMobil.setFont(new Font("Helvetica Neue", Font.ITALIC, 18));
        InputIdMobil = new JTextField("");        
        InputIdMobil.setBounds(50, 210, 200, 30);
        
        JLabel labelJam = new JLabel("JAM :");
        labelJam.setBounds(50, 250, 200, 30);
        labelJam.setFont(new Font("Helvetica Neue", Font.ITALIC, 18));
//        InputJam = new JTextField("");        
//        InputJam.setBounds(50, 280, 200, 30);
        
        JLabel labelTglTiket = new JLabel("TANGGAL :");
        labelTglTiket.setBounds(50, 320, 200, 30);
        labelTglTiket.setFont(new Font("Helvetica Neue", Font.ITALIC, 18));
//        InputTglTiket = new JTextField("");        
//        InputTglTiket.setBounds(50, 350, 200, 30);
        
        JLabel labelHargaTiket = new JLabel("HARGA TIKET :");
        labelHargaTiket.setBounds(50, 380, 200, 30);
        labelHargaTiket.setFont(new Font("Helvetica Neue", Font.ITALIC, 18));
        InputHargaTiket = new JTextField("");        
        InputHargaTiket.setBounds(50, 410, 200, 30);

        backFromTambah = new JButton("BACK");
        backFromTambah.setBounds(80, 450, 150, 50);
        backFromTambah.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        backFromTambah.addActionListener(this);
        
        ButtonSubmitTambah = new JButton("Submit");
        ButtonSubmitTambah.setBounds(260, 450, 150, 50);
        ButtonSubmitTambah.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        ButtonSubmitTambah.addActionListener(this);
        
        panelForm4.add(labelIDMobil);
        panelForm4.add(labelIDRute);
        panelForm4.add(labelIDTiket);
        panelForm4.add(backFromTambah);
        panelForm4.add(InputIdTiket);
        panelForm4.add(InputIdRute);
        panelForm4.add(InputIdMobil);
        panelForm4.add(labelJam);
        panelForm4.add(labelTglTiket);
        panelForm4.add(labelHargaTiket);
        panelForm4.add(InputHargaTiket);
        panelForm4.add(ButtonSubmitTambah);
        
        frameUpdateTiket.add(panelForm4);
        }

    public void form2(){ //UPDATE
        panelForm2 = new JPanel();
        panelForm2.setLayout(null);
        panelForm2.setBackground(Color.white);
        panelForm2.setBounds(480, 20, 500, 600);
    
        JLabel labelTiket = new JLabel("Pilih Tiket Yang Ingin Diubah");
        labelTiket.setBounds(50, 10, 400, 30);
        labelTiket.setFont(new Font("Helvetica Neue", Font.ITALIC, 18));
        String IsiTiket[]={"Voucher1","Voucher2","Voucher3","Voucher2","Voucher1"};
        TiketUpdate = new JComboBox(IsiTiket);
        TiketUpdate.setBounds(50, 40, 200, 30);
        TiketUpdate.addActionListener(this);
    
        JLabel labelIDTiket = new JLabel("ID TIKET BARU :");
        labelIDTiket.setBounds(50, 70, 200, 30);
        labelIDTiket.setFont(new Font("Helvetica Neue", Font.ITALIC, 18));
        InputIdTiket = new JTextField("");        
        InputIdTiket.setBounds(50, 100, 200, 30);
        InputIdTiket.setEnabled(false);
        
        JLabel labelIDRute = new JLabel("ID RUTE BARU :");
        labelIDRute.setBounds(50, 130, 200, 30);
        labelIDRute.setFont(new Font("Helvetica Neue", Font.ITALIC, 18));
        InputIdRute = new JTextField("");        
        InputIdRute.setBounds(50, 170, 200, 30);
        InputIdRute.setEnabled(false);
        
        JLabel labelIDMobil = new JLabel("ID MOBIL BARU :");
        labelIDMobil.setBounds(50, 200, 200, 30);
        labelIDMobil.setFont(new Font("Helvetica Neue", Font.ITALIC, 18));
        InputIdMobil = new JTextField("");        
        InputIdMobil.setBounds(50, 230, 200, 30);
        InputIdMobil.setEnabled(false);
        
        JLabel labelJam = new JLabel("JAM :");
        labelJam.setBounds(50, 260, 200, 30);
        labelJam.setFont(new Font("Helvetica Neue", Font.ITALIC, 18));
//        InputJam = new JTextField("");        
//        InputJam.setBounds(50, 290, 200, 30);
//        InputJam.setEnabled(false);
        
        JLabel labelTglTiket = new JLabel("TANGGAL BARU :");
        labelTglTiket.setBounds(50, 320, 200, 30);
        labelTglTiket.setFont(new Font("Helvetica Neue", Font.ITALIC, 18));
//        InputTglTiket = new JTextField("");        
//        InputTglTiket.setBounds(50, 350, 200, 30);
//        InputTglTiket.setEnabled(false);
        
        JLabel labelHargaTiket = new JLabel("HARGA TIKET BARU :");
        labelHargaTiket.setBounds(50, 380, 200, 30);
        labelHargaTiket.setFont(new Font("Helvetica Neue", Font.ITALIC, 18));
        InputHargaTiket = new JTextField("");        
        InputHargaTiket.setBounds(50, 410, 200, 30);
        InputHargaTiket.setEnabled(false);
        
        backFromUpdate = new JButton("BACK");
        backFromUpdate.setBounds(80, 460, 150, 50);
        backFromUpdate.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        backFromUpdate.addActionListener(this);
        
        ButtonSubmitUpdate = new JButton("Submit");
        ButtonSubmitUpdate.setBounds(260, 460, 150, 50);
        ButtonSubmitUpdate.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        ButtonSubmitUpdate.addActionListener(this);
    
        panelForm2.add(ButtonSubmitUpdate);
        panelForm2.add(backFromUpdate);
        panelForm2.add(InputHargaTiket);
        panelForm2.add(labelHargaTiket);
        panelForm2.add(labelTglTiket);
        panelForm2.add(labelJam);
        panelForm2.add(labelIDMobil);
        panelForm2.add(labelIDRute);
        panelForm2.add(InputIdRute);
        panelForm2.add(InputIdTiket);
        panelForm2.add(labelIDTiket);
        panelForm2.add(TiketUpdate);
        panelForm2.add(labelTiket);
        
        frameUpdateTiket.add(panelForm2);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == TiketUpdate) {
            if (TiketUpdate.getSelectedItem().equals("Tiket")) {
                InputIdTiket.setEnabled(false);
                InputIdRute.setEnabled(false);
                InputHargaTiket.setEnabled(false);
            }else{
                InputIdTiket.setEnabled(true);
                InputIdRute.setEnabled(true);
                InputHargaTiket.setEnabled(true);
            }
        }
        if (ae.getSource() == backKeMenu) {
            if (frameUpdateTiket.isVisible()) {
                frameUpdateTiket.setVisible(false);
                new MenuH_admin();
            }
        }
        if (ae.getSource() == backFromTambah) {
            if (panelForm4.isVisible()) {
                panelForm4.setVisible(false);
                title2.setText("UPDATE / DELETE");
                form1();
            }        
        }

        if (ae.getSource() == backFromDelete) {
            if (panelForm3.isVisible()) {
                panelForm3.setVisible(false);
                title2.setText("UPDATE / DELETE");
                form1();
            }        
        }
        if (ae.getSource() == backFromUpdate) {
            if (panelForm2.isVisible()) {
                panelForm2.setVisible(false);
                title2.setText("UPDATE / DELETE");
                form1();
            }        
        }

        if (ae.getSource() == deleteTiket) {
            if (panelForm1.isVisible()) {
                panelForm1.setVisible(false);
                title2.setText("DELETE TIKET");
                form3();
            }
        }
        if (ae.getSource() == updateTiket) {
            if (panelForm1.isVisible()) {
                panelForm1.setVisible(false);
                title2.setText("UPDATE TIKET");
                form2();
            }
        }
        if (ae.getSource() == tambahTiket) {
            if (panelForm1.isVisible()) {
                panelForm1.setVisible(false);
                title2.setText("TAMBAH TIKET");
                form4();
            }
        }

    }
    public static void main(String[] args) {
        new MenuA_updateTiket();
    }


}