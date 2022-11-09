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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Gibran<>
 */
public class MenuH_admin implements ActionListener{
    
    JFrame frameAdmin;
    JButton updateVoucher, lihatRiwayatUser, updateTiket, lihatJumlahPenumpang, lihatPendapatan;

    public MenuH_admin(){
        frameAdmin = new JFrame("MENU MEMBER");
        frameAdmin.pack();
        frameAdmin.setSize(1000, 700);
        frameAdmin.setLocationRelativeTo(null);
        frameAdmin.getContentPane().setBackground(new Color(51, 153, 255));
        frameAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel title = new JLabel("WELCOME #NAMAADMIN");
        title.setBounds(90, 50, 800, 50);
        title.setFont(new Font("Helvetica Neue", Font.BOLD, 30));
        title.setHorizontalAlignment(SwingConstants.CENTER);

        updateVoucher = new JButton("Update Voucher");
        updateVoucher.setBounds(190, 120, 250, 100);
        updateVoucher.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        updateVoucher.addActionListener(this);

        lihatRiwayatUser = new JButton("Lihat History User");
        lihatRiwayatUser.setBounds(550, 120, 250, 100);
        lihatRiwayatUser.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        lihatRiwayatUser.addActionListener(this);
        
        updateTiket = new JButton("Update Tiket");
        updateTiket.setBounds(190, 270, 250, 100);
        updateTiket.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        updateTiket.addActionListener(this);
        
        lihatJumlahPenumpang = new JButton("Lihat Jumlah Penumpang");
        lihatJumlahPenumpang.setBounds(290, 420, 350, 100);
        lihatJumlahPenumpang.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        lihatJumlahPenumpang.addActionListener(this);
        
        lihatPendapatan = new JButton("Lihat Pendapatan");
        lihatPendapatan.setBounds(550, 270, 250, 100);
        lihatPendapatan.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
        lihatPendapatan.addActionListener(this);
        
        frameAdmin.add(title);
        frameAdmin.add(updateVoucher);
        frameAdmin.add(lihatRiwayatUser);
        frameAdmin.add(updateTiket);
        frameAdmin.add(lihatJumlahPenumpang);
        frameAdmin.add(lihatPendapatan);
        frameAdmin.setLayout(null);
        frameAdmin.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == updateVoucher) {
            frameAdmin.dispose();
            new MenuA_updateVoucher();
        } else if (ae.getSource() == lihatPendapatan){
            new MenuA_lihatPendapatan();
        } else if (ae.getSource() == lihatJumlahPenumpang){
            new MenuA_lihatJumlahPenumpang();
        } else if (ae.getSource() == lihatRiwayatUser){
            new MenuA_lihatRiwayatUser();
        } else if (ae.getSource() == updateTiket){
            new MenuA_updateTiket();
        }


    }
    
    public static void main(String[] args) {
        new MenuH_admin();
    }
}