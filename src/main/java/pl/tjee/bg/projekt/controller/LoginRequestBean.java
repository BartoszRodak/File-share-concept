/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tjee.bg.projekt.controller;

import pl.tjee.bg.projekt.controller.account.AccountAccess;
import pl.tjee.bg.projekt.controller.account.AccountAccess_Service;

/**
 *
 * @author Bartem
 */
public class LoginRequestBean {

    String name;
    String password;
    String id = null;
    String message = "";

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

    public boolean getStatus() {
        System.out.println("log: " + name);
        System.out.println("log: " + password);
        
        AccountAccess aa = new AccountAccess_Service().getAccountAccessPort();
        this.id = aa.login(name, password);

        return this.id != null;
    }

    public String getMessage() {
        return this.message;
    }

    public String getId() {
        return this.id;
    }
}
