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
public class Transaksi {

    private int idTransaksi;
    private int idUser;
    private Double totalPembayaran;
    private Date date;
    private String metodePembayaran;
    
    public Transaksi() {
        
    }

    public Transaksi(int idTransaksi, int idUser, Double totalPembayaran, Date date, String metodePembayaran) {
        this.idTransaksi = idTransaksi;
        this.idUser = idUser;
        this.totalPembayaran = totalPembayaran;
        this.date = date;
        this.metodePembayaran = metodePembayaran;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public Double getTotalPembayaran() {
        return totalPembayaran;
    }

    public void setTotalPembayaran(Double totalPembayaran) {
        this.totalPembayaran = totalPembayaran;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }
    
    
}
