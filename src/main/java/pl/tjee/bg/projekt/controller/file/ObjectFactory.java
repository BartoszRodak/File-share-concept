
package pl.tjee.bg.projekt.controller.file;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.tjee.bg.projekt.controller.file package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteResponse_QNAME = new QName("http://model.projekt.bg.tjee.pl/", "deleteResponse");
    private final static QName _GetFileListResponse_QNAME = new QName("http://model.projekt.bg.tjee.pl/", "getFileListResponse");
    private final static QName _Upload_QNAME = new QName("http://model.projekt.bg.tjee.pl/", "upload");
    private final static QName _DownloadResponse_QNAME = new QName("http://model.projekt.bg.tjee.pl/", "downloadResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://model.projekt.bg.tjee.pl/", "helloResponse");
    private final static QName _Download_QNAME = new QName("http://model.projekt.bg.tjee.pl/", "download");
    private final static QName _Delete_QNAME = new QName("http://model.projekt.bg.tjee.pl/", "delete");
    private final static QName _GetFileList_QNAME = new QName("http://model.projekt.bg.tjee.pl/", "getFileList");
    private final static QName _UploadResponse_QNAME = new QName("http://model.projekt.bg.tjee.pl/", "uploadResponse");
    private final static QName _Hello_QNAME = new QName("http://model.projekt.bg.tjee.pl/", "hello");
    private final static QName _UploadArg3_QNAME = new QName("", "arg3");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.tjee.bg.projekt.controller.file
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Download }
     * 
     */
    public Download createDownload() {
        return new Download();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link GetFileListResponse }
     * 
     */
    public GetFileListResponse createGetFileListResponse() {
        return new GetFileListResponse();
    }

    /**
     * Create an instance of {@link Upload }
     * 
     */
    public Upload createUpload() {
        return new Upload();
    }

    /**
     * Create an instance of {@link DownloadResponse }
     * 
     */
    public DownloadResponse createDownloadResponse() {
        return new DownloadResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link UploadResponse }
     * 
     */
    public UploadResponse createUploadResponse() {
        return new UploadResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link GetFileList }
     * 
     */
    public GetFileList createGetFileList() {
        return new GetFileList();
    }

    /**
     * Create an instance of {@link FileDownload }
     * 
     */
    public FileDownload createFileDownload() {
        return new FileDownload();
    }

    /**
     * Create an instance of {@link FileListEntry }
     * 
     */
    public FileListEntry createFileListEntry() {
        return new FileListEntry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.projekt.bg.tjee.pl/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFileListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.projekt.bg.tjee.pl/", name = "getFileListResponse")
    public JAXBElement<GetFileListResponse> createGetFileListResponse(GetFileListResponse value) {
        return new JAXBElement<GetFileListResponse>(_GetFileListResponse_QNAME, GetFileListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Upload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.projekt.bg.tjee.pl/", name = "upload")
    public JAXBElement<Upload> createUpload(Upload value) {
        return new JAXBElement<Upload>(_Upload_QNAME, Upload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.projekt.bg.tjee.pl/", name = "downloadResponse")
    public JAXBElement<DownloadResponse> createDownloadResponse(DownloadResponse value) {
        return new JAXBElement<DownloadResponse>(_DownloadResponse_QNAME, DownloadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.projekt.bg.tjee.pl/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Download }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.projekt.bg.tjee.pl/", name = "download")
    public JAXBElement<Download> createDownload(Download value) {
        return new JAXBElement<Download>(_Download_QNAME, Download.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.projekt.bg.tjee.pl/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFileList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.projekt.bg.tjee.pl/", name = "getFileList")
    public JAXBElement<GetFileList> createGetFileList(GetFileList value) {
        return new JAXBElement<GetFileList>(_GetFileList_QNAME, GetFileList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.projekt.bg.tjee.pl/", name = "uploadResponse")
    public JAXBElement<UploadResponse> createUploadResponse(UploadResponse value) {
        return new JAXBElement<UploadResponse>(_UploadResponse_QNAME, UploadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.projekt.bg.tjee.pl/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arg3", scope = Upload.class)
    public JAXBElement<byte[]> createUploadArg3(byte[] value) {
        return new JAXBElement<byte[]>(_UploadArg3_QNAME, byte[].class, Upload.class, ((byte[]) value));
    }

}
