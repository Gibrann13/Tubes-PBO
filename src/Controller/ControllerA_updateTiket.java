/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.Controller_tiket.printRute;
import Model.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author jonjovio
 */
public class ControllerA_updateTiket {
    
    static DatabaseHandler conn = new DatabaseHandler();
    
    public static ArrayList<String> getRute(){
        conn.connect();

        String query = "SELECT * FROM rute";
        ArrayList<String> rute = new ArrayList<>();
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                rute.add(rs.getInt("idRute") + " - " + printRute(rs.getInt("berangkat"), rs.getInt("tujuan")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rute;
    }
    
    public static ArrayList<String> getMobil(){
        conn.connect();

        String query = "SELECT * FROM mobil";
        ArrayList<String> mobil = new ArrayList<>();
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                mobil.add(rs.getInt("idMobil") + " - " + rs.getString("jenisMobil"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mobil;
    }
    
    public static boolean addTiket(Tiket tiket){
        conn.connect();
        String query = "INSERT INTO tiket VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setInt(1, tiket.getIdTiket());
            stmt.setInt(2, tiket.getRute().getIdRute());
            stmt.setInt(3, tiket.getMobil().getIdMobil());
            stmt.setString(4, tiket.getJam());
            stmt.setDate(5, (java.sql.Date) tiket.getDate());
            stmt.setDouble(6, tiket.getHarga());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
