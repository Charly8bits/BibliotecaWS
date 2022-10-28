package modelo.entidad;
// Generated 27 oct 2022 23:23:31 by Hibernate Tools 4.3.1



/**
 * Prestamo generated by hbm2java
 */
public class Prestamo  implements java.io.Serializable {


     private Integer idPrestamo;
     private String fechaPrestamo;
     private String fechaDevolucion;
     private int codEstudiante;
     private int codLibro;

    public Prestamo() {
    }

	
    public Prestamo(int codEstudiante, int codLibro) {
        this.codEstudiante = codEstudiante;
        this.codLibro = codLibro;
    }
    public Prestamo(String fechaPrestamo, String fechaDevolucion, int codEstudiante, int codLibro) {
       this.fechaPrestamo = fechaPrestamo;
       this.fechaDevolucion = fechaDevolucion;
       this.codEstudiante = codEstudiante;
       this.codLibro = codLibro;
    }
   
    public Integer getIdPrestamo() {
        return this.idPrestamo;
    }
    
    public void setIdPrestamo(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }
    public String getFechaPrestamo() {
        return this.fechaPrestamo;
    }
    
    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    public String getFechaDevolucion() {
        return this.fechaDevolucion;
    }
    
    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    public int getCodEstudiante() {
        return this.codEstudiante;
    }
    
    public void setCodEstudiante(int codEstudiante) {
        this.codEstudiante = codEstudiante;
    }
    public int getCodLibro() {
        return this.codLibro;
    }
    
    public void setCodLibro(int codLibro) {
        this.codLibro = codLibro;
    }




}


