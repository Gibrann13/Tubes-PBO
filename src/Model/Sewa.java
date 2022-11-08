/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Arvin Situmorang
 */
public class Sewa {

    private int idMobil;
    private double harga;
    private int idSewa;
    private String jam;
    private Date date;
    private TransaksiSewa transaksi;

    public Sewa(int idMobil, double harga, int idSewa, String jam, Date date, TransaksiSewa transaksi) {
        this.idMobil = idMobil;
        this.harga = harga;
        this.idSewa = idSewa;
        this.jam = jam;
        this.date = date;
        this.transaksi = transaksi;
    }

    public int getIdMobil() {
        return idMobil;
    }

    public void setIdMobil(int idMobil) {
        this.idMobil = idMobil;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getIdSewa() {
        return idSewa;
    }

    public void setIdSewa(int idSewa) {
        this.idSewa = idSewa;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public TransaksiSewa getTransaksi() {
        return transaksi;
    }

    public void setTransaksi(TransaksiSewa transaksi) {
        this.transaksi = transaksi;
    }

}
