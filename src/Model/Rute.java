/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Rute implements Kota {

    private int idRute;
    private int tujuan;
    private int keberangkatan;
    private Kota kota;
    //ini deklarasi juga kah?

    public Rute(int idRute, int tujuan, int keberangkatan, Kota kota) {
        this.idRute = idRute;
        this.tujuan = tujuan;
        this.keberangkatan = keberangkatan;
        this.kota = kota;
    }

    public int getIdRute() {
        return idRute;
    }

    public void setIdRute(int idRute) {
        this.idRute = idRute;
    }

    public int getTujuan() {
        return tujuan;
    }

    public void setTujuan(int tujuan) {
        this.tujuan = tujuan;
    }

    public int getKeberangkatan() {
        return keberangkatan;
    }

    public void setKeberangkatan(int keberangkatan) {
        this.keberangkatan = keberangkatan;
    }

    public Kota getKota() {
        return kota;
    }

    public void setKota(Kota kota) {
        this.kota = kota;
    }

}
