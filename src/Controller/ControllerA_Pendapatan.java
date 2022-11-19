/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.ControllerA_voucher.conn;
import Model.Tiket;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gibran<>
 */
public class ControllerA_Pendapatan {
    

public int cariPendapatan(int n, String m) {
        conn.connect();
        int pendapatan = 0;
        
        String query = "SELECT MONTH(tanggal) Bulan, YEAR(tanggal) Tahun, SUM(totalPembayaran) TotalBayar\n" +
"FROM transaksi WHERE MONTH(tanggal) = " + n + " && YEAR(tanggal) = " + m +"\n" +
"GROUP BY MONTH(tanggal), YEAR(tanggal)\n" +
"ORDER BY MONTH(tanggal), YEAR(tanggal)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                pendapatan = rs.getInt(3);
            }
//            System.out.println(rs.getInt(3));
            return pendapatan;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    return pendapatan;
    }
}
