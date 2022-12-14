/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public abstract class User {
    private int idUser;
    private String email;
    private String password;
    private UserType UserType;

    public User(){
    }
    
    public User(int idUser, String email, String password, UserType UserType) {
        this.idUser = idUser;
        this.email = email;
        this.password = password;
        this.UserType = UserType;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return UserType;
    }

    public void setUserType(UserType UserType) {
        this.UserType = UserType;
    }
    
    abstract String welcomeText();
    
}
