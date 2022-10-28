package modelo.entidad;
// Generated 27 oct 2022 23:23:31 by Hibernate Tools 4.3.1



/**
 * Libro generated by hbm2java
 */
public class Libro  implements java.io.Serializable {


     private Integer idLibro;
     private String nombre;
     private long isbn;
     private int codAutor;
     private int codTipoLibro;

    public Libro() {
    }

    public Libro(String nombre, long isbn, int codAutor, int codTipoLibro) {
       this.nombre = nombre;
       this.isbn = isbn;
       this.codAutor = codAutor;
       this.codTipoLibro = codTipoLibro;
    }
   
    public Integer getIdLibro() {
        return this.idLibro;
    }
    
    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public long getIsbn() {
        return this.isbn;
    }
    
    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
    public int getCodAutor() {
        return this.codAutor;
    }
    
    public void setCodAutor(int codAutor) {
        this.codAutor = codAutor;
    }
    public int getCodTipoLibro() {
        return this.codTipoLibro;
    }
    
    public void setCodTipoLibro(int codTipoLibro) {
        this.codTipoLibro = codTipoLibro;
    }




}

