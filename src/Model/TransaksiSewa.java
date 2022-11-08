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
public class TransaksiSewa extends Transaksi {

    private String idSewa;

    public TransaksiSewa(String idSewa, int idTransaksi, int idUser, Double totalPembayaran, Date date, String metodePembayaran) {
        super(idTransaksi, idUser, totalPembayaran, date, metodePembayaran);
        this.idSewa = idSewa;
    }

    public String getIdSewa() {
        return idSewa;
    }

    public void setIdSewa(String idSewa) {
        this.idSewa = idSewa;
    }

}
