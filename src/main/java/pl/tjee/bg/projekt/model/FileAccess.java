/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tjee.bg.projekt.model;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Bartem
 */
@WebService(serviceName = "FileAccess")
public class FileAccess {

    /**
     * This is a sample web service operation
     * @param txt
     * @return 
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     *
     * @param userSessionId
     * @param fileName
     * @param fileType
     * @param fileData
     * @param description
     * @return
     */
    @WebMethod
    public boolean upload(String userSessionId, String fileName, String fileType, byte[] fileData, String description) {
        File file = new File();
        file.setContent(fileData);
        file.setDescription(description);
        file.setType(fileType);
        file.setName(fileName);
//        file.setAuthor(null);
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(file);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
//            if (transaction != null) {
//                transaction.rollback();
//            }
        }
        return true;
    }

    @WebMethod
    public FileListEntry[] getFileList(String userSessionId) {
        List<File> files = null;
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            files = session.createQuery("from File", File.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
        List<FileListEntry> result = new ArrayList<>();
        files.forEach(f -> result.add(new FileListEntry(null, f.getId(), f.getName(), f.getDescription())));
        return result.toArray(new FileListEntry[result.size()]);
    }

    @WebMethod
    public FileDownload download(String userSessionId, int fileId) {
        Transaction transaction = null;
        File file = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            file = session.createQuery("from File where id=" + fileId, File.class).list().get(0);
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return new FileDownload(file);

    }

    @WebMethod
    public boolean delete(String userSessionId, int fileId) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.createQuery("delete from File where id=" + fileId).executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return true;
    }
}
