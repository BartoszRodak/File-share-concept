/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tjee.bg.projekt.controller;

/**
 *
 * @author Bartem
 */
public class LoginRequestBean {
    String name;
    String password;
    String id = null;
    String message = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean getStatus(){
        return true;
    }
    
    public String getMessage(){
        return this.message;
    }
    public String getId(){
        return this.id;
    }
}
