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
public class TransaksiVoucher extends Transaksi {

    private int idTransaksi;
    private int idVoucher;

    private ArrayList<Voucher> voucher = new ArrayList<>();

    public TransaksiVoucher() {
    }

    public TransaksiVoucher(int idTransaksi, double totalPembayaran, Date date, String caraPembayaran, Member member, int idVoucher) {
        super(idTransaksi, totalPembayaran, date, caraPembayaran, member);
        this.idVoucher = idVoucher;
    }

    public ArrayList<Voucher> getVoucher() {
        return voucher;
    }

    public void setVoucher(ArrayList<Voucher> voucher) {
        this.voucher = voucher;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public int getIdVoucher() {
        return idVoucher;
    }

    public void setIdVoucher(int idVoucher) {
        this.idVoucher = idVoucher;
    }

}
