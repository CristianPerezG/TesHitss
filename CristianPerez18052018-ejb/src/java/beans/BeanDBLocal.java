/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entidades.Usuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author crist
 */
@Local
public interface BeanDBLocal {

    public String logOutUsuario(String nombreUsuario);

    public String loginUsuario(String nombreUsuario, String password);

    public List<Usuario> obtenerUsuarios();

    public String crearUsuario(String nombreUsuario, String passUsuario, String descripcionUsuario);

    public String modificarUsuario(long idUsuario, String nombreUsuario, String passUsuario, String descripcionUsuario);

    public String eliminarUsuario(long idUsuario);
}
