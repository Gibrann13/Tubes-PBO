/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class TransaksiSewa extends Transaksi{
    private Sewa sewa;
    private Date tanggalSewa;
    private int lamaSewa;
    
    public TransaksiSewa() {
    }

    public TransaksiSewa(Sewa sewa, int idTransaksi, double totalPembayaran, Date date, String caraPembayaran, Member member) {
        super(idTransaksi, totalPembayaran, date, caraPembayaran, member);
        this.sewa = sewa;
    }
    
    public Sewa getSewa() {
        return sewa;
    }

    public void setSewa(Sewa sewa) {
        this.sewa = sewa;
    }

    public Date getTanggalSewa() {
        return tanggalSewa;
    }

    public void setTanggalSewa(Date tanggalSewa) {
        this.tanggalSewa = tanggalSewa;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }
    
    
}
