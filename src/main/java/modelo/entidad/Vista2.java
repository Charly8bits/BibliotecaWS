package modelo.entidad;
// Generated 27 oct 2022 23:23:31 by Hibernate Tools 4.3.1



/**
 * Vista2 generated by hbm2java
 */
public class Vista2  implements java.io.Serializable {


     private long isbn;
     private String nombre;
     private String nombreAutor;
     private String apellidoAutor;
     private String descTipo;
     private String estado;

    public Vista2() {
    }

    public Vista2(long isbn, String nombre, String nombreAutor, String apellidoAutor, String descTipo, String estado) {
       this.isbn = isbn;
       this.nombre = nombre;
       this.nombreAutor = nombreAutor;
       this.apellidoAutor = apellidoAutor;
       this.descTipo = descTipo;
       this.estado = estado;
    }
   
    public long getIsbn() {
        return this.isbn;
    }
    
    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombreAutor() {
        return this.nombreAutor;
    }
    
    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }
    public String getApellidoAutor() {
        return this.apellidoAutor;
    }
    
    public void setApellidoAutor(String apellidoAutor) {
        this.apellidoAutor = apellidoAutor;
    }
    public String getDescTipo() {
        return this.descTipo;
    }
    
    public void setDescTipo(String descTipo) {
        this.descTipo = descTipo;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }




}

