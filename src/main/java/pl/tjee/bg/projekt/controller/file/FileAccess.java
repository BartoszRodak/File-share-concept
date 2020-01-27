
package pl.tjee.bg.projekt.controller.file;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FileAccess", targetNamespace = "http://model.projekt.bg.tjee.pl/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FileAccess {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "delete", targetNamespace = "http://model.projekt.bg.tjee.pl/", className = "pl.tjee.bg.projekt.controller.file.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://model.projekt.bg.tjee.pl/", className = "pl.tjee.bg.projekt.controller.file.DeleteResponse")
    @Action(input = "http://model.projekt.bg.tjee.pl/FileAccess/deleteRequest", output = "http://model.projekt.bg.tjee.pl/FileAccess/deleteResponse")
    public boolean delete(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "upload", targetNamespace = "http://model.projekt.bg.tjee.pl/", className = "pl.tjee.bg.projekt.controller.file.Upload")
    @ResponseWrapper(localName = "uploadResponse", targetNamespace = "http://model.projekt.bg.tjee.pl/", className = "pl.tjee.bg.projekt.controller.file.UploadResponse")
    @Action(input = "http://model.projekt.bg.tjee.pl/FileAccess/uploadRequest", output = "http://model.projekt.bg.tjee.pl/FileAccess/uploadResponse")
    public boolean upload(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        byte[] arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://model.projekt.bg.tjee.pl/", className = "pl.tjee.bg.projekt.controller.file.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://model.projekt.bg.tjee.pl/", className = "pl.tjee.bg.projekt.controller.file.HelloResponse")
    @Action(input = "http://model.projekt.bg.tjee.pl/FileAccess/helloRequest", output = "http://model.projekt.bg.tjee.pl/FileAccess/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<pl.tjee.bg.projekt.controller.file.FileListEntry>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFileList", targetNamespace = "http://model.projekt.bg.tjee.pl/", className = "pl.tjee.bg.projekt.controller.file.GetFileList")
    @ResponseWrapper(localName = "getFileListResponse", targetNamespace = "http://model.projekt.bg.tjee.pl/", className = "pl.tjee.bg.projekt.controller.file.GetFileListResponse")
    @Action(input = "http://model.projekt.bg.tjee.pl/FileAccess/getFileListRequest", output = "http://model.projekt.bg.tjee.pl/FileAccess/getFileListResponse")
    public List<FileListEntry> getFileList(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns pl.tjee.bg.projekt.controller.file.FileDownload
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "download", targetNamespace = "http://model.projekt.bg.tjee.pl/", className = "pl.tjee.bg.projekt.controller.file.Download")
    @ResponseWrapper(localName = "downloadResponse", targetNamespace = "http://model.projekt.bg.tjee.pl/", className = "pl.tjee.bg.projekt.controller.file.DownloadResponse")
    @Action(input = "http://model.projekt.bg.tjee.pl/FileAccess/downloadRequest", output = "http://model.projekt.bg.tjee.pl/FileAccess/downloadResponse")
    public FileDownload download(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}
