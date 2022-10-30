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
public class Sewa {
    private int idSewa; 
    private double harga;
    private String jam;
    private Date date;
    private Mobil mobil;
    
    public Sewa(){
    }
    
    public Sewa(int idSewa, double harga, String jam, Date date) {
        this.idSewa = idSewa;
        this.harga = harga;
        this.jam = jam;
        this.date = date;
    }

    public int getIdSewa() {
        return idSewa;
    }

    public void setIdSewa(int idSewa) {
        this.idSewa = idSewa;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
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
    
    
}
