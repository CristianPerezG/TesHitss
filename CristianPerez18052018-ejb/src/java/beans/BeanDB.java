/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entidades.Usuario;
import java.util.Date;
import java.util.List;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

/**
 *
 * @author crist
 */
@Singleton
public class BeanDB implements BeanDBLocal {

    private String mensajeProceso = "";
    private Usuario usuarioEntidad;
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("CristianPerez17052018-ejbPU");
    private EntityManager em;
    private List<Usuario> listadoUsuarios;

    @Override
    public String loginUsuario(String nombreUsuario, String password) {
        try {
            em = emf.createEntityManager();
            usuarioEntidad = new Usuario();
            listadoUsuarios = em.createNativeQuery("SELECT u.* FROM TESTHITSS.USUARIO AS u WHERE u.NOMBREUSUARIO ='" + nombreUsuario + "' AND u.PASSUSUARIO = '" + password + "'", Usuario.class).getResultList();

            if (listadoUsuarios.size() > 0) {
                usuarioEntidad = listadoUsuarios.get(0);
                em.refresh(usuarioEntidad);
                if (usuarioEntidad.getLogin()) {
                    mensajeProceso = "Usuario ya logueado";
                } else {
                    mensajeProceso = "Usuario Logueado -" + usuarioEntidad.getNombreusuario();
                    usuarioEntidad.setLogin(true);
                    em.getTransaction().begin();
                    em.persist(usuarioEntidad);
                    em.getTransaction().commit();
                }
            } else {
                mensajeProceso = "Usuario no existe en la DB";
            }
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            mensajeProceso = "Error generado en el Sistema: " + e.toString();
            System.out.println(mensajeProceso);
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return mensajeProceso;
    }

    @Override
    public String logOutUsuario(String nombreUsuario) {
        try {
            em = emf.createEntityManager();
            usuarioEntidad = new Usuario();
            listadoUsuarios = em.createNativeQuery("SELECT u.* FROM TESTHITSS.USUARIO AS u WHERE u.NOMBREUSUARIO ='" + nombreUsuario + "'", Usuario.class).getResultList();
            for (Usuario usuarioBuscado : listadoUsuarios) {
                if (usuarioBuscado.getLogin()) {
                    usuarioBuscado.setLogin(false);
                    em.getTransaction().begin();
                    em.persist(usuarioBuscado);
                    em.getTransaction().commit();
                    mensajeProceso = "Usuario Deslogueado";
                }
            }
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            mensajeProceso = "Error generado en el Sistema: " + e.toString();
            System.out.println(mensajeProceso);
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return mensajeProceso;
    }

    @Override
    public String crearUsuario(String nombreUsuario, String passUsuario, String descripcionUsuario) {
        try {
            em = emf.createEntityManager();
            usuarioEntidad = new Usuario();         
            usuarioEntidad.setNombreusuario(nombreUsuario);
            usuarioEntidad.setPassusuario(passUsuario);
            usuarioEntidad.setDescripcionusuario(descripcionUsuario);
            usuarioEntidad.setFechacreacion(new Date());
            usuarioEntidad.setLogin(Boolean.FALSE);            
            em.getTransaction().begin();
            em.persist(usuarioEntidad);
            em.getTransaction().commit();
            mensajeProceso = "Usuario Creado Exitosamente";
        } catch (ConstraintViolationException ex) {
            mensajeProceso = "Error generado en el Sistema: " + ex.toString();
            System.out.println(mensajeProceso);
            for (ConstraintViolation actual : ex.getConstraintViolations()) {
                System.out.println(actual.toString());
            }
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } catch (Exception ex) {
            mensajeProceso = "Error generado en el Sistema: " + ex.toString();
            System.out.println(mensajeProceso);           
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return mensajeProceso;
    }

    @Override
    public String modificarUsuario(long idUsuario, String nombreUsuario, String passUsuario, String descripcionUsuario) {
        try {
            usuarioEntidad = new Usuario();
            em = emf.createEntityManager();
            usuarioEntidad = em.find(Usuario.class, idUsuario);
            em.getTransaction().begin();
            usuarioEntidad.setNombreusuario(nombreUsuario);
            usuarioEntidad.setPassusuario(passUsuario);
            usuarioEntidad.setDescripcionusuario(descripcionUsuario);
            usuarioEntidad.setLogin(false);
            em.getTransaction().commit();
            mensajeProceso = "Usuario Actualizado Exitosamente";
        } catch (Exception e) {
            mensajeProceso = "Error generado en el Sistema: " + e.toString();
            System.out.println(mensajeProceso);
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return mensajeProceso;
    }

    @Override
    public String eliminarUsuario(long idUsuario) {
        try {
            usuarioEntidad = new Usuario();
            em = emf.createEntityManager();
            usuarioEntidad = em.find(Usuario.class, Long.valueOf(idUsuario));
            em.getTransaction().begin();
            em.remove(usuarioEntidad);
            em.getTransaction().commit();
            mensajeProceso = "Usuario Eliminado Exitosamente";
        } catch (Exception e) {
            mensajeProceso = "Error generado en el Sistema: " + e.toString();
            System.out.println(mensajeProceso);
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return mensajeProceso;
    }

    @Override
    public List<Usuario> obtenerUsuarios() {
        try {
            em = emf.createEntityManager();
            usuarioEntidad = new Usuario();
            listadoUsuarios = em.createNativeQuery("SELECT u.* FROM TESTHITSS.USUARIO AS u ", Usuario.class).getResultList();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            mensajeProceso = "Error generado en el Sistema: " + e.toString();
            System.out.println(mensajeProceso);
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return listadoUsuarios;
    }
}
