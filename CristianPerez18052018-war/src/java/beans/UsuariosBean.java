/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import clientes.ServicioPrincipal_Service;
import clientes.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author crist
 */
@Named(value = "usuariosBean")
@RequestScoped
public class UsuariosBean {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/192.168.0.12_8080/ServicioPrincipal/ServicioPrincipal.wsdl")
    private ServicioPrincipal_Service service;

    @ManagedProperty(value = "#{nombreUsuario}")
    private String nombreUsuario;
    @ManagedProperty(value = "#{passUsuario}")
    private String passUsuario;
    @ManagedProperty(value = "#{descipcionUsuario}")
    private String descipcionUsuario;

    @ManagedProperty(value = "#{nombreUsuarioE}")
    private String nombreUsuarioE;
    @ManagedProperty(value = "#{idUsuarioE}")
    private Long idUsuarioE;
    @ManagedProperty(value = "#{passUsuarioE}")
    private String passUsuarioE;
    @ManagedProperty(value = "#{descipcionUsuarioE}")
    private String descipcionUsuarioE;
    @ManagedProperty(value = "#{estaLogeadoE}")
    private boolean estaLogeadoE;

    @ManagedProperty(value = "#{usuarioLogeado}")
    private String usuarioLogeado;
    @ManagedProperty(value = "#{mensajeCreacion}")
    private String mensajeCreacion = "";
    @ManagedProperty(value = "#{mensajeModificacion}")
    private String mensajeModificacion = "";
    @ManagedProperty(value = "#{mensajeEliminacion}")
    private String mensajeEliminacion = "";

    @ManagedProperty(value = "#{listadoUsuarios}")
    private List<Usuario> listadoUsuarios = new ArrayList<>();

    public UsuariosBean() {
        usuarioLogeado = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("nombreUsuario");
    }

    public void editarUsuario(Long idUsuario, String nombreUsuario, String passUsuario, String descripcionUsuario, String fechaCreacion, boolean estaLogueado) {
        this.nombreUsuarioE = nombreUsuario;
        this.passUsuarioE = passUsuario;
        this.descipcionUsuarioE = descripcionUsuario;
        this.estaLogeadoE = estaLogueado;
        this.idUsuarioE = idUsuario;
    }

    public void crearUsuario() {
        mensajeCreacion = crearUsuarioWS(nombreUsuario, passUsuario, descipcionUsuario);
        mensajeModificacion = "";
        mensajeEliminacion = "";
    }
    
    public void modificarUsuario() {
        mensajeModificacion = modificarUsuarioWS(idUsuarioE, nombreUsuarioE, passUsuarioE, descipcionUsuarioE, estaLogeadoE);
        mensajeCreacion = "";
        mensajeEliminacion = "";
    }

    public void eliminarUsuario(long idUsuario) {
        mensajeEliminacion = eliminarUsuarioWS(idUsuario);
        mensajeCreacion = "";
        mensajeModificacion = "";
    }

    @PostConstruct
    public void obtenerUsuarios() {
        this.listadoUsuarios = obtenerUsuariosWS();
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassUsuario() {
        return passUsuario;
    }

    public void setPassUsuario(String passUsuario) {
        this.passUsuario = passUsuario;
    }

    public String getDescipcionUsuario() {
        return descipcionUsuario;
    }

    public void setDescipcionUsuario(String descipcionUsuario) {
        this.descipcionUsuario = descipcionUsuario;
    }

    public List<Usuario> getListadoUsuarios() {
        return listadoUsuarios;
    }

    public void setListadoUsuarios(List<Usuario> listadoUsuarios) {
        this.listadoUsuarios = listadoUsuarios;
    }

    public String getNombreUsuarioE() {
        return nombreUsuarioE;
    }

    public void setNombreUsuarioE(String nombreUsuarioE) {
        this.nombreUsuarioE = nombreUsuarioE;
    }

    public String getPassUsuarioE() {
        return passUsuarioE;
    }

    public void setPassUsuarioE(String passUsuarioE) {
        this.passUsuarioE = passUsuarioE;
    }

    public String getDescipcionUsuarioE() {
        return descipcionUsuarioE;
    }

    public void setDescipcionUsuarioE(String descipcionUsuarioE) {
        this.descipcionUsuarioE = descipcionUsuarioE;
    }

    public boolean isEstaLogeadoE() {
        return estaLogeadoE;
    }

    public void setEstaLogeadoE(boolean estaLogeadoE) {
        this.estaLogeadoE = estaLogeadoE;
    }

    public String getUsuarioLogeado() {
        return usuarioLogeado;
    }

    public void setUsuarioLogeado(String usuarioLogeado) {
        this.usuarioLogeado = usuarioLogeado;
    }

    public String getMensajeCreacion() {
        return mensajeCreacion;
    }

    public void setMensajeCreacion(String mensajeCreacion) {
        this.mensajeCreacion = mensajeCreacion;
    }

    public String getMensajeModificacion() {
        return mensajeModificacion;
    }

    public void setMensajeModificacion(String mensajeModificacion) {
        this.mensajeModificacion = mensajeModificacion;
    }

    public String getMensajeEliminacion() {
        return mensajeEliminacion;
    }

    public void setMensajeEliminacion(String mensajeEliminacion) {
        this.mensajeEliminacion = mensajeEliminacion;
    }

    public Long getIdUsuarioE() {
        return idUsuarioE;
    }

    public void setIdUsuarioE(Long idUsuarioE) {
        this.idUsuarioE = idUsuarioE;
    }

    private String crearUsuarioWS(java.lang.String nombreUsuario, java.lang.String passUsuario, java.lang.String descripcionUsuario) {
        clientes.ServicioPrincipal port = service.getServicioPrincipalPort();
        return port.crearUsuario(nombreUsuario, passUsuario, descripcionUsuario);
    }

    private String eliminarUsuarioWS(long idUsuario) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        clientes.ServicioPrincipal port = service.getServicioPrincipalPort();
        return port.eliminarUsuario(idUsuario);
    }

    private String modificarUsuarioWS(long idUsuario, java.lang.String nombreUsuario, java.lang.String passUsuario, java.lang.String descripcionUsuario, boolean login) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        clientes.ServicioPrincipal port = service.getServicioPrincipalPort();
        return port.modificarUsuario(idUsuario, nombreUsuario, passUsuario, descripcionUsuario, login);
    }

    private java.util.List<clientes.Usuario> obtenerUsuariosWS() {        
        clientes.ServicioPrincipal port = service.getServicioPrincipalPort();
        return port.obtenerUsuarios();
    }

    
}
