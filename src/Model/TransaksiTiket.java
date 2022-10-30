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
public class TransaksiTiket extends Transaksi{
    private ArrayList<Tiket> tiket = new ArrayList<>();

    public TransaksiTiket() {
    }

    public TransaksiTiket(int idTransaksi, double totalPembayaran, Date date, String caraPembayaran, User user) {
        super(idTransaksi, totalPembayaran, date, caraPembayaran, user);
    }

    public ArrayList<Tiket> getTiket() {
        return tiket;
    }

    public void setTiket(ArrayList<Tiket> tiket) {
        this.tiket = tiket;
    }
    
    
}
