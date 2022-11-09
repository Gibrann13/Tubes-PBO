/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.sql.*;
import java.util.Set;

/**
 *
 * @author jonjovio
 */
public class Controller_user {
    
    static DatabaseHandler conn = new DatabaseHandler();
    
    public boolean checkLogin(String email, String password){
        conn.connect();
        String query = "SELECT * FROM member WHERE email='" + email + "'&&password='" + password + "'";
        Member member = Member.getMemberInst();
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                member.setIdUser(rs.getInt("idMember"));
                member.setFirstName(rs.getString("firstName"));
                member.setLastName(rs.getString("lastName"));
                member.setEmail(rs.getString("email"));
                member.setPassword(rs.getString("password"));
                member.setPhoneNumber(rs.getString("phoneNumber"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        if (member.getFirstName() == null) {
            return false;
        }else {
            return true;
        }
    }
    
    
    
    public boolean insertNewMember(Member member) {
        conn.connect();
        String query = "INSERT INTO member VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setInt(1, member.getIdUser());
            stmt.setString(2, member.getFirstName());
            stmt.setString(3, member.getLastName());
            stmt.setString(4, member.getEmail());
            stmt.setString(5, member.getPassword());
            stmt.setString(6, member.getPhoneNumber());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
    
}
