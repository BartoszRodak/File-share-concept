
package pl.tjee.bg.projekt.controller.account;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.tjee.bg.projekt.controller.account package. 
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

    private final static QName _ValidateSessionResponse_QNAME = new QName("http://model.projekt.bg.tjee.pl/", "validateSessionResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://model.projekt.bg.tjee.pl/", "helloResponse");
    private final static QName _RegisterResponse_QNAME = new QName("http://model.projekt.bg.tjee.pl/", "registerResponse");
    private final static QName _LoginResponse_QNAME = new QName("http://model.projekt.bg.tjee.pl/", "loginResponse");
    private final static QName _LogoutResponse_QNAME = new QName("http://model.projekt.bg.tjee.pl/", "logoutResponse");
    private final static QName _Logout_QNAME = new QName("http://model.projekt.bg.tjee.pl/", "logout");
    private final static QName _Login_QNAME = new QName("http://model.projekt.bg.tjee.pl/", "login");
    private final static QName _Register_QNAME = new QName("http://model.projekt.bg.tjee.pl/", "register");
    private final static QName _Hello_QNAME = new QName("http://model.projekt.bg.tjee.pl/", "hello");
    private final static QName _ValidateSession_QNAME = new QName("http://model.projekt.bg.tjee.pl/", "validateSession");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.tjee.bg.projekt.controller.account
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link ValidateSessionResponse }
     * 
     */
    public ValidateSessionResponse createValidateSessionResponse() {
        return new ValidateSessionResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link ValidateSession }
     * 
     */
    public ValidateSession createValidateSession() {
        return new ValidateSession();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateSessionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.projekt.bg.tjee.pl/", name = "validateSessionResponse")
    public JAXBElement<ValidateSessionResponse> createValidateSessionResponse(ValidateSessionResponse value) {
        return new JAXBElement<ValidateSessionResponse>(_ValidateSessionResponse_QNAME, ValidateSessionResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.projekt.bg.tjee.pl/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.projekt.bg.tjee.pl/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.projekt.bg.tjee.pl/", name = "logoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.projekt.bg.tjee.pl/", name = "logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.projekt.bg.tjee.pl/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.projekt.bg.tjee.pl/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.projekt.bg.tjee.pl/", name = "validateSession")
    public JAXBElement<ValidateSession> createValidateSession(ValidateSession value) {
        return new JAXBElement<ValidateSession>(_ValidateSession_QNAME, ValidateSession.class, null, value);
    }

}
