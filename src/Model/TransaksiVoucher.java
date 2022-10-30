/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class TransaksiVoucher extends Transaksi{
    private ArrayList<Voucher> voucher = new ArrayList<>();

    public TransaksiVoucher() {
    }

    public TransaksiVoucher(int idTransaksi, double totalPembayaran, Date date, String caraPembayaran, User user) {
        super(idTransaksi, totalPembayaran, date, caraPembayaran, user);
    }

    public ArrayList<Voucher> getVoucher() {
        return voucher;
    }

    public void setVoucher(ArrayList<Voucher> voucher) {
        this.voucher = voucher;
    }
    
    
}
