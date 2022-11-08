/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Arvin Situmorang
 */
public class Mobil {

    private String jenisMobil;
    private int jumlahKursi;

    public Mobil(String jenisMobil, int jumlahKursi) {
        this.jenisMobil = jenisMobil;
        this.jumlahKursi = jumlahKursi;
    }

    public String getJenisMobil() {
        return jenisMobil;
    }

    public void setJenisMobil(String jenisMobil) {
        this.jenisMobil = jenisMobil;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

}
