
package clientes;

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
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServicioPrincipal", targetNamespace = "http://servicios/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioPrincipal {


    /**
     * 
     * @param idUsuario
     * @param descripcionUsuario
     * @param passUsuario
     * @param nombreUsuario
     * @param login
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modificarUsuario", targetNamespace = "http://servicios/", className = "clientes.ModificarUsuario")
    @ResponseWrapper(localName = "modificarUsuarioResponse", targetNamespace = "http://servicios/", className = "clientes.ModificarUsuarioResponse")
    @Action(input = "http://servicios/ServicioPrincipal/modificarUsuarioRequest", output = "http://servicios/ServicioPrincipal/modificarUsuarioResponse")
    public String modificarUsuario(
        @WebParam(name = "idUsuario", targetNamespace = "")
        long idUsuario,
        @WebParam(name = "nombreUsuario", targetNamespace = "")
        String nombreUsuario,
        @WebParam(name = "passUsuario", targetNamespace = "")
        String passUsuario,
        @WebParam(name = "descripcionUsuario", targetNamespace = "")
        String descripcionUsuario,
        @WebParam(name = "login", targetNamespace = "")
        boolean login);

    /**
     * 
     * @param descripcionUsuario
     * @param passUsuario
     * @param nombreUsuario
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearUsuario", targetNamespace = "http://servicios/", className = "clientes.CrearUsuario")
    @ResponseWrapper(localName = "crearUsuarioResponse", targetNamespace = "http://servicios/", className = "clientes.CrearUsuarioResponse")
    @Action(input = "http://servicios/ServicioPrincipal/crearUsuarioRequest", output = "http://servicios/ServicioPrincipal/crearUsuarioResponse")
    public String crearUsuario(
        @WebParam(name = "nombreUsuario", targetNamespace = "")
        String nombreUsuario,
        @WebParam(name = "passUsuario", targetNamespace = "")
        String passUsuario,
        @WebParam(name = "descripcionUsuario", targetNamespace = "")
        String descripcionUsuario);

    /**
     * 
     * @param passUsuario
     * @param nombreUsuario
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loginUsuario", targetNamespace = "http://servicios/", className = "clientes.LoginUsuario")
    @ResponseWrapper(localName = "loginUsuarioResponse", targetNamespace = "http://servicios/", className = "clientes.LoginUsuarioResponse")
    @Action(input = "http://servicios/ServicioPrincipal/loginUsuarioRequest", output = "http://servicios/ServicioPrincipal/loginUsuarioResponse")
    public String loginUsuario(
        @WebParam(name = "nombreUsuario", targetNamespace = "")
        String nombreUsuario,
        @WebParam(name = "passUsuario", targetNamespace = "")
        String passUsuario);

    /**
     * 
     * @return
     *     returns java.util.List<clientes.Usuario>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerUsuarios", targetNamespace = "http://servicios/", className = "clientes.ObtenerUsuarios")
    @ResponseWrapper(localName = "obtenerUsuariosResponse", targetNamespace = "http://servicios/", className = "clientes.ObtenerUsuariosResponse")
    @Action(input = "http://servicios/ServicioPrincipal/obtenerUsuariosRequest", output = "http://servicios/ServicioPrincipal/obtenerUsuariosResponse")
    public List<Usuario> obtenerUsuarios();

    /**
     * 
     * @param nombreUsuario
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "logoutUsuario", targetNamespace = "http://servicios/", className = "clientes.LogoutUsuario")
    @ResponseWrapper(localName = "logoutUsuarioResponse", targetNamespace = "http://servicios/", className = "clientes.LogoutUsuarioResponse")
    @Action(input = "http://servicios/ServicioPrincipal/logoutUsuarioRequest", output = "http://servicios/ServicioPrincipal/logoutUsuarioResponse")
    public String logoutUsuario(
        @WebParam(name = "nombreUsuario", targetNamespace = "")
        String nombreUsuario);

    /**
     * 
     * @param idUsuario
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarUsuario", targetNamespace = "http://servicios/", className = "clientes.EliminarUsuario")
    @ResponseWrapper(localName = "eliminarUsuarioResponse", targetNamespace = "http://servicios/", className = "clientes.EliminarUsuarioResponse")
    @Action(input = "http://servicios/ServicioPrincipal/eliminarUsuarioRequest", output = "http://servicios/ServicioPrincipal/eliminarUsuarioResponse")
    public String eliminarUsuario(
        @WebParam(name = "idUsuario", targetNamespace = "")
        long idUsuario);

}
