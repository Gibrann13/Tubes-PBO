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
 * @author Arvin Situmorang
 */
public class TransaksiVoucher extends Transaksi {

    private String idVoucher;
    ArrayList<Voucher> listVoucher = new ArrayList<>();

    public TransaksiVoucher(String idVoucher) {
        this.idVoucher = idVoucher;
    }

    public TransaksiVoucher(String idVoucher, int idTransaksi, int idUser, Double totalPembayaran, Date date, String metodePembayaran) {
        super(idTransaksi, idUser, totalPembayaran, date, metodePembayaran);
        this.idVoucher = idVoucher;
    }

    public String getIdVoucher() {
        return idVoucher;
    }

    public void setIdVoucher(String idVoucher) {
        this.idVoucher = idVoucher;
    }

    public ArrayList<Voucher> getListVoucher() {
        return listVoucher;
    }

    public void setListVoucher(ArrayList<Voucher> listVoucher) {
        this.listVoucher = listVoucher;
    }

}
