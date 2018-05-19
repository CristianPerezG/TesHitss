
package clientes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para modificarUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modificarUsuario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="nombreUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcionUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificarUsuario", propOrder = {
    "idUsuario",
    "nombreUsuario",
    "passUsuario",
    "descripcionUsuario",
    "login"
})
public class ModificarUsuario {

    protected long idUsuario;
    protected String nombreUsuario;
    protected String passUsuario;
    protected String descripcionUsuario;
    protected boolean login;

    /**
     * Obtiene el valor de la propiedad idUsuario.
     * 
     */
    public long getIdUsuario() {
        return idUsuario;
    }

    /**
     * Define el valor de la propiedad idUsuario.
     * 
     */
    public void setIdUsuario(long value) {
        this.idUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Define el valor de la propiedad nombreUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreUsuario(String value) {
        this.nombreUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad passUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassUsuario() {
        return passUsuario;
    }

    /**
     * Define el valor de la propiedad passUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassUsuario(String value) {
        this.passUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionUsuario() {
        return descripcionUsuario;
    }

    /**
     * Define el valor de la propiedad descripcionUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionUsuario(String value) {
        this.descripcionUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad login.
     * 
     */
    public boolean isLogin() {
        return login;
    }

    /**
     * Define el valor de la propiedad login.
     * 
     */
    public void setLogin(boolean value) {
        this.login = value;
    }

}
