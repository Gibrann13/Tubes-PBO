/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

public class Tiket {

    private int idTiket;
    private int idMobil;
    private int idRute;
    private Date date;
    private String jam;
    private double harga;
    ArrayList<String> listRute = new ArrayList<>();

    public Tiket(int idTiket, int idMobil, int idRute, Date date, String jam, double harga) {
        this.idTiket = idTiket;
        this.idMobil = idMobil;
        this.idRute = idRute;
        this.date = date;
        this.jam = jam;
        this.harga = harga;
    }

    public int getIdTiket() {
        return idTiket;
    }

    public void setIdTiket(int idTiket) {
        this.idTiket = idTiket;
    }

    public int getIdMobil() {
        return idMobil;
    }

    public void setIdMobil(int idMobil) {
        this.idMobil = idMobil;
    }

    public int getIdRute() {
        return idRute;
    }

    public void setIdRute(int idRute) {
        this.idRute = idRute;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public ArrayList<String> getListRute() {
        return listRute;
    }

    public void setListRute(ArrayList<String> listRute) {
        this.listRute = listRute;
    }

}
