/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Admin extends User {

    private String adminName;

    public Admin(String adminName, int idUser, String email, String password, Model.UserType UserType) {
        super(idUser, email, password, UserType);
        this.adminName = adminName;
    }

    public Admin() {

    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

}
