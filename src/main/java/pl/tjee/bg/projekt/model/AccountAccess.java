/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tjee.bg.projekt.model;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Bartem
 */
@WebService(serviceName = "AccountAccess")
public class AccountAccess {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod
    public String login(String name, String password) {
        return "";
    }

    @WebMethod
    public String register(String name, String password) {

        //TODO
        return login(name, password);
    }

    @WebMethod
    public void logout(String userSessionId) {
    }

    @WebMethod
    public boolean validateSession(String userSessionId) {

        return true;
    }

}
