package modelo.entidad;
// Generated 27 oct 2022 23:23:31 by Hibernate Tools 4.3.1



/**
 * Autor generated by hbm2java
 */
public class Autor  implements java.io.Serializable {


     private Integer idAutor;
     private String nombre;
     private String apellido;

    public Autor() {
    }

    public Autor(String nombre, String apellido) {
       this.nombre = nombre;
       this.apellido = apellido;
    }
   
    public Integer getIdAutor() {
        return this.idAutor;
    }
    
    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }




}


