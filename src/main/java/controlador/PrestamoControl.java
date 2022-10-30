/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;
import modelo.dao.EstudianteDao;
import modelo.dao.LibroDao;
import modelo.dao.PrestamoDao;
import modelo.entidad.Estudiante;
import modelo.entidad.Libro;
import modelo.entidad.Prestamo;


/**
 *
 * @author elcon
 */
@ManagedBean
@ViewScoped
public class PrestamoControl {

    //Variables
    private List<Prestamo> listaPrestamos;
    private Prestamo prestamo;
    //SelectItem 
    public List<SelectItem> selectlibro;
    public List<SelectItem> selectestudiante;

    // Select item que llama a clase Libro y LibroDao para mostrar informacion de esa tabla
        public List<SelectItem> getSelectLibro() {
        this.selectlibro = new ArrayList<SelectItem>();
        LibroDao cated = new LibroDao();
        List<Libro> ls = cated.listarLibro();
        selectlibro.clear();
        for (Libro opcion : ls) {
            SelectItem Item = new SelectItem(opcion.getIdLibro(),
                    opcion.getNombre());
            this.selectlibro.add(Item);
        }
        return selectlibro;
    }
        
       // Select item que llama a clase Estudiante y EstudianteDao para mostrar informacion de esa tabla
               public List<SelectItem> getSelectEstudiante() {
        this.selectestudiante = new ArrayList<SelectItem>();
        EstudianteDao cated = new EstudianteDao();
        List<Estudiante> ls = cated.listarEstudiante();
        selectlibro.clear();
        for (Estudiante opcion : ls) {
            SelectItem Item = new SelectItem(opcion.getIdEstudiante(),
                    opcion.getNombre());
                    opcion.getApellido();
            this.selectestudiante.add(Item);
        }
        return selectestudiante;
    }
    
    //Constructor
    public PrestamoControl() {
        prestamo = new Prestamo();
    }

    //Crea una lista con la clase PrestamoDao
    public List<Prestamo> getListaPrestamos() {
        PrestamoDao ad = new PrestamoDao();
        listaPrestamos = ad.listarPrestamo();
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    //Limpiar prestamo
    public void limpiarPrestamo() {
        prestamo = new Prestamo();
    }

    //Agregar prestamo
    public void agregarPrestamo() {
        PrestamoDao ad = new PrestamoDao();
        ad.agregar(prestamo);      
    }

    //Modificar prestamo
    public void modificarPrestamo() {
        PrestamoDao ad = new PrestamoDao();
        ad.modificar(prestamo);
        limpiarPrestamo();
    }

    //Eliminar prestamo
    public void eliminarPrestamo() {
        PrestamoDao ad = new PrestamoDao();
        ad.eliminar(prestamo);
        limpiarPrestamo();
    }
}
