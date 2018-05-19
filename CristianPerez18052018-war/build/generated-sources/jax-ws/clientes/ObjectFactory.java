
package clientes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientes package. 
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

    private final static QName _CrearUsuario_QNAME = new QName("http://servicios/", "crearUsuario");
    private final static QName _CrearUsuarioResponse_QNAME = new QName("http://servicios/", "crearUsuarioResponse");
    private final static QName _EliminarUsuario_QNAME = new QName("http://servicios/", "eliminarUsuario");
    private final static QName _EliminarUsuarioResponse_QNAME = new QName("http://servicios/", "eliminarUsuarioResponse");
    private final static QName _LoginUsuario_QNAME = new QName("http://servicios/", "loginUsuario");
    private final static QName _LoginUsuarioResponse_QNAME = new QName("http://servicios/", "loginUsuarioResponse");
    private final static QName _LogoutUsuario_QNAME = new QName("http://servicios/", "logoutUsuario");
    private final static QName _LogoutUsuarioResponse_QNAME = new QName("http://servicios/", "logoutUsuarioResponse");
    private final static QName _ModificarUsuario_QNAME = new QName("http://servicios/", "modificarUsuario");
    private final static QName _ModificarUsuarioResponse_QNAME = new QName("http://servicios/", "modificarUsuarioResponse");
    private final static QName _ObtenerUsuarios_QNAME = new QName("http://servicios/", "obtenerUsuarios");
    private final static QName _ObtenerUsuariosResponse_QNAME = new QName("http://servicios/", "obtenerUsuariosResponse");
    private final static QName _Usuario_QNAME = new QName("http://servicios/", "usuario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearUsuario }
     * 
     */
    public CrearUsuario createCrearUsuario() {
        return new CrearUsuario();
    }

    /**
     * Create an instance of {@link CrearUsuarioResponse }
     * 
     */
    public CrearUsuarioResponse createCrearUsuarioResponse() {
        return new CrearUsuarioResponse();
    }

    /**
     * Create an instance of {@link EliminarUsuario }
     * 
     */
    public EliminarUsuario createEliminarUsuario() {
        return new EliminarUsuario();
    }

    /**
     * Create an instance of {@link EliminarUsuarioResponse }
     * 
     */
    public EliminarUsuarioResponse createEliminarUsuarioResponse() {
        return new EliminarUsuarioResponse();
    }

    /**
     * Create an instance of {@link LoginUsuario }
     * 
     */
    public LoginUsuario createLoginUsuario() {
        return new LoginUsuario();
    }

    /**
     * Create an instance of {@link LoginUsuarioResponse }
     * 
     */
    public LoginUsuarioResponse createLoginUsuarioResponse() {
        return new LoginUsuarioResponse();
    }

    /**
     * Create an instance of {@link LogoutUsuario }
     * 
     */
    public LogoutUsuario createLogoutUsuario() {
        return new LogoutUsuario();
    }

    /**
     * Create an instance of {@link LogoutUsuarioResponse }
     * 
     */
    public LogoutUsuarioResponse createLogoutUsuarioResponse() {
        return new LogoutUsuarioResponse();
    }

    /**
     * Create an instance of {@link ModificarUsuario }
     * 
     */
    public ModificarUsuario createModificarUsuario() {
        return new ModificarUsuario();
    }

    /**
     * Create an instance of {@link ModificarUsuarioResponse }
     * 
     */
    public ModificarUsuarioResponse createModificarUsuarioResponse() {
        return new ModificarUsuarioResponse();
    }

    /**
     * Create an instance of {@link ObtenerUsuarios }
     * 
     */
    public ObtenerUsuarios createObtenerUsuarios() {
        return new ObtenerUsuarios();
    }

    /**
     * Create an instance of {@link ObtenerUsuariosResponse }
     * 
     */
    public ObtenerUsuariosResponse createObtenerUsuariosResponse() {
        return new ObtenerUsuariosResponse();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "crearUsuario")
    public JAXBElement<CrearUsuario> createCrearUsuario(CrearUsuario value) {
        return new JAXBElement<CrearUsuario>(_CrearUsuario_QNAME, CrearUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "crearUsuarioResponse")
    public JAXBElement<CrearUsuarioResponse> createCrearUsuarioResponse(CrearUsuarioResponse value) {
        return new JAXBElement<CrearUsuarioResponse>(_CrearUsuarioResponse_QNAME, CrearUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "eliminarUsuario")
    public JAXBElement<EliminarUsuario> createEliminarUsuario(EliminarUsuario value) {
        return new JAXBElement<EliminarUsuario>(_EliminarUsuario_QNAME, EliminarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "eliminarUsuarioResponse")
    public JAXBElement<EliminarUsuarioResponse> createEliminarUsuarioResponse(EliminarUsuarioResponse value) {
        return new JAXBElement<EliminarUsuarioResponse>(_EliminarUsuarioResponse_QNAME, EliminarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "loginUsuario")
    public JAXBElement<LoginUsuario> createLoginUsuario(LoginUsuario value) {
        return new JAXBElement<LoginUsuario>(_LoginUsuario_QNAME, LoginUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "loginUsuarioResponse")
    public JAXBElement<LoginUsuarioResponse> createLoginUsuarioResponse(LoginUsuarioResponse value) {
        return new JAXBElement<LoginUsuarioResponse>(_LoginUsuarioResponse_QNAME, LoginUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "logoutUsuario")
    public JAXBElement<LogoutUsuario> createLogoutUsuario(LogoutUsuario value) {
        return new JAXBElement<LogoutUsuario>(_LogoutUsuario_QNAME, LogoutUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "logoutUsuarioResponse")
    public JAXBElement<LogoutUsuarioResponse> createLogoutUsuarioResponse(LogoutUsuarioResponse value) {
        return new JAXBElement<LogoutUsuarioResponse>(_LogoutUsuarioResponse_QNAME, LogoutUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "modificarUsuario")
    public JAXBElement<ModificarUsuario> createModificarUsuario(ModificarUsuario value) {
        return new JAXBElement<ModificarUsuario>(_ModificarUsuario_QNAME, ModificarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "modificarUsuarioResponse")
    public JAXBElement<ModificarUsuarioResponse> createModificarUsuarioResponse(ModificarUsuarioResponse value) {
        return new JAXBElement<ModificarUsuarioResponse>(_ModificarUsuarioResponse_QNAME, ModificarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "obtenerUsuarios")
    public JAXBElement<ObtenerUsuarios> createObtenerUsuarios(ObtenerUsuarios value) {
        return new JAXBElement<ObtenerUsuarios>(_ObtenerUsuarios_QNAME, ObtenerUsuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "obtenerUsuariosResponse")
    public JAXBElement<ObtenerUsuariosResponse> createObtenerUsuariosResponse(ObtenerUsuariosResponse value) {
        return new JAXBElement<ObtenerUsuariosResponse>(_ObtenerUsuariosResponse_QNAME, ObtenerUsuariosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Usuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "usuario")
    public JAXBElement<Usuario> createUsuario(Usuario value) {
        return new JAXBElement<Usuario>(_Usuario_QNAME, Usuario.class, null, value);
    }

}
