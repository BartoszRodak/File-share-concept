/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tjee.bg.projekt.model;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.hibernate.Session;

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
        System.out.println("log: " + name);
        System.out.println("log: " + password);
        List<Account> accounts = new LinkedList<>();
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            accounts = session.createQuery("from Account where name= :name and pass= :password ", Account.class).setParameter("name", name).setParameter("password", password).list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (accounts.size() != 1) {
            return null;
        } else {
            String sessionId = UUID.randomUUID().toString();
            try (Session session = HibernateUtil.getSessionFactory().openSession()) {
                Account a = accounts.get(0);
                a.setSessionId(sessionId);
                System.out.println("log: " + a);
                session.beginTransaction();
                session.update(a);
                session.getTransaction().commit();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
            return sessionId;
        }
    }

    @WebMethod
    public String register(String name, String password) {
        return null;
    }

    @WebMethod
    public void logout(String userSessionId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.createQuery("update Account set sessionId=null where sessionId = :userSessionId").setParameter("userSessionId", userSessionId).executeUpdate();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @WebMethod
    public boolean validateSession(String userSessionId) {
        return true;
    }

}
