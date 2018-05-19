/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import beans.BeanDBLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import entidades.Usuario;

/**
 *
 * @author crist
 */
@WebService(serviceName = "ServicioPrincipal")
@Stateless()
public class ServicioPrincipal {

    @EJB
    private BeanDBLocal ejbRef;

    @WebMethod(operationName = "loginUsuario")
    public String loginUsuario(@WebParam(name = "nombreUsuario") final String nombreUsuario,
            @WebParam(name = "passUsuario") final String passUsuario) {
        return ejbRef.loginUsuario(nombreUsuario, passUsuario);
    }

    @WebMethod(operationName = "logoutUsuario")
    public String logoutUsuario(@WebParam(name = "nombreUsuario") final String nombreUsuario) {
        return ejbRef.logOutUsuario(nombreUsuario);
    }

    @WebMethod(operationName = "obtenerUsuarios")
    public List<Usuario> obtenerUsuarios() {
        return ejbRef.obtenerUsuarios();
    }

    @WebMethod(operationName = "crearUsuario")
    public String crearUsuario(@WebParam(name = "nombreUsuario") final String nombreUsuario,
            @WebParam(name = "passUsuario") final String passUsuario,
            @WebParam(name = "descripcionUsuario") final String descripcionUsuario) {
        return ejbRef.crearUsuario(nombreUsuario, passUsuario, descripcionUsuario);
    }

    @WebMethod(operationName = "modificarUsuario")
    public String modificarUsuario(@WebParam(name = "idUsuario") final long idUsuario,
            @WebParam(name = "nombreUsuario") final String nombreUsuario,
            @WebParam(name = "passUsuario") final String passUsuario,
            @WebParam(name = "descripcionUsuario") final String descripcionUsuario,
            @WebParam(name = "login") final boolean login) {
        return ejbRef.modificarUsuario(idUsuario, nombreUsuario, passUsuario, descripcionUsuario);
    }

    @WebMethod(operationName = "eliminarUsuario")
    public String eliminarUsuario(@WebParam(name = "idUsuario") final long idUsuario) {
        return ejbRef.eliminarUsuario(idUsuario);
    }
}
