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
import modelo.dao.AutorDao;
import modelo.dao.EstudianteDao;
import modelo.dao.LibroDao;
import modelo.dao.TipoLibroDao;
import modelo.entidad.Autor;
import modelo.entidad.Estudiante;
import modelo.entidad.Libro;
import modelo.entidad.TipoLibro;


/**
 *
 * @author elcon
 */
@ManagedBean
@ViewScoped
public class LibroControl {

    /**
     * Creates a new instance of LibroControl
     */
    private List<Libro> listaLibros;
    private Libro libro;
       public List<SelectItem> selectautor;
    public List<SelectItem> selectTlibro;

         
               public List<SelectItem> getSelectTlibro() {
        this.selectTlibro = new ArrayList<>();
        TipoLibroDao cated = new TipoLibroDao();
        List<TipoLibro> ls = cated.listarTipoLibro();
        selectTlibro.clear();
        for (TipoLibro opcion : ls) {
            SelectItem Item = new SelectItem(opcion.getIdTipoLibro(),
                    opcion.getDescTipo());
            this.selectTlibro.add(Item);
        }
        return selectTlibro;
    }  
    
        public List<SelectItem> getSelectAutor() {
        this.selectautor = new ArrayList<>();
        AutorDao cated = new AutorDao();
        List<Autor> ls = cated.listarAutor();
        selectautor.clear();
        for (Autor opcion : ls) {
            SelectItem Item = new SelectItem(opcion.getIdAutor(),
                    opcion.getNombre());
            this.selectautor.add(Item);
        }
        return selectautor;
    }
        


    public LibroControl() {
        libro = new Libro();
    }

    public List<Libro> getListaLibros() {
        LibroDao ad = new LibroDao();
        listaLibros = ad.listarLibro();
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void limpiarLibro() {
        libro = new Libro();
    }

    public void agregarLibro() {
        LibroDao ad = new LibroDao();
        ad.agregar(libro);      
    }

    public void modificarLibro() {
        LibroDao ad = new LibroDao();
        ad.modificar(libro);
        limpiarLibro();
    }

    public void eliminarLibro() {
        LibroDao ad = new LibroDao();
        ad.eliminar(libro);
        limpiarLibro();
    }
}
