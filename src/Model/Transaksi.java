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
public class Transaksi {
    private int idTransaksi;
    private double totalPembayaran;
    private Date date;
    private String caraPembayaran;
    private User user;

    public Transaksi(){
    }
    
    public Transaksi(int idTransaksi, double totalPembayaran, Date date, String caraPembayaran, User user) {
        this.idTransaksi = idTransaksi;
        this.totalPembayaran = totalPembayaran;
        this.date = date;
        this.caraPembayaran = caraPembayaran;
        this.user = user;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public double getTotalPembayaran() {
        return totalPembayaran;
    }

    public void setTotalPembayaran(double totalPembayaran) {
        this.totalPembayaran = totalPembayaran;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCaraPembayaran() {
        return caraPembayaran;
    }

    public void setCaraPembayaran(String caraPembayaran) {
        this.caraPembayaran = caraPembayaran;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
}
