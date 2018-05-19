
package clientes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para usuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="usuario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descripcionusuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechacreacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idusuario" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="nombreusuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passusuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuario", propOrder = {
    "descripcionusuario",
    "fechacreacion",
    "idusuario",
    "login",
    "nombreusuario",
    "passusuario"
})
public class Usuario {

    protected String descripcionusuario;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechacreacion;
    protected Long idusuario;
    protected Boolean login;
    protected String nombreusuario;
    protected String passusuario;

    /**
     * Obtiene el valor de la propiedad descripcionusuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionusuario() {
        return descripcionusuario;
    }

    /**
     * Define el valor de la propiedad descripcionusuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionusuario(String value) {
        this.descripcionusuario = value;
    }

    /**
     * Obtiene el valor de la propiedad fechacreacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechacreacion() {
        return fechacreacion;
    }

    /**
     * Define el valor de la propiedad fechacreacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechacreacion(XMLGregorianCalendar value) {
        this.fechacreacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idusuario.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdusuario() {
        return idusuario;
    }

    /**
     * Define el valor de la propiedad idusuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdusuario(Long value) {
        this.idusuario = value;
    }

    /**
     * Obtiene el valor de la propiedad login.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogin() {
        return login;
    }

    /**
     * Define el valor de la propiedad login.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogin(Boolean value) {
        this.login = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreusuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreusuario() {
        return nombreusuario;
    }

    /**
     * Define el valor de la propiedad nombreusuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreusuario(String value) {
        this.nombreusuario = value;
    }

    /**
     * Obtiene el valor de la propiedad passusuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassusuario() {
        return passusuario;
    }

    /**
     * Define el valor de la propiedad passusuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassusuario(String value) {
        this.passusuario = value;
    }

}
