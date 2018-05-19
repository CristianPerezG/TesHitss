/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import clientes.ServicioPrincipal_Service;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author crist
 */
@Named(value = "loginBean")
@RequestScoped
public class LoginBean {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/192.168.0.12_8080/ServicioPrincipal/ServicioPrincipal.wsdl")
    private ServicioPrincipal_Service service;
    
    @ManagedProperty(value = "#{mensajeLogin}")
    private String mensajeLogin = "";
    @ManagedProperty(value = "#{descipcionUsuario}")
    private String descipcionUsuario = "";
    @ManagedProperty(value = "#{nombreUsuario}")
    private String nombreUsuario;
    @ManagedProperty(value = "#{passUsuario}")
    private String passUsuario;

    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
    }

    public String loginUsuario() {
        mensajeLogin = loginUsuarioWS(nombreUsuario, passUsuario);
        System.out.println("Mensaje del Proceso : " + mensajeLogin);
        if (mensajeLogin.contains("Usuario Logueado")) {
            this.descipcionUsuario = mensajeLogin;
            return ("Bienvenida");
        } else {
            return ("Login");
        }
    }

    public String logoutUsuario() {
        mensajeLogin = logoutUsuarioWS(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("nombreUsuario"));
        System.out.println("Mensaje del Proceso : " + mensajeLogin);
        return ("Login");
    }

    public String irAdminUsuarios() {
        return "AdminUsuarios";
    }

    public String irHome() {
        return "Bienvenida";
    }

    public String getMensajeLogin() {
        return mensajeLogin;
    }

    public void setMensajeLogin(String mensajeLogin) {
        this.mensajeLogin = mensajeLogin;
    }

    public String getDescipcionUsuario() {
        return descipcionUsuario;
    }

    public void setDescipcionUsuario(String descipcionUsuario) {
        this.descipcionUsuario = descipcionUsuario;
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

    public boolean hayAlerta() {
        return !mensajeLogin.equals("");
    }

    private String loginUsuarioWS(java.lang.String nombreUsuario, java.lang.String passUsuario) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        clientes.ServicioPrincipal port = service.getServicioPrincipalPort();
        return port.loginUsuario(nombreUsuario, passUsuario);
    }

    private String logoutUsuarioWS(java.lang.String nombreUsuario) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        clientes.ServicioPrincipal port = service.getServicioPrincipalPort();
        return port.logoutUsuario(nombreUsuario);
    }    
}
