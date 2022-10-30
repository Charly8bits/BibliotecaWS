/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.dao.TipoLibroDao;
import modelo.entidad.TipoLibro;


/**
 *
 * @author elcon
 */
@ManagedBean
@ViewScoped
public class TipoLibroControl {

    //Variables
    private List<TipoLibro> listaTipoLibros;
    private TipoLibro tipolibro;

    //Constructor
    public TipoLibroControl() {
        tipolibro = new TipoLibro();
    }

    //Crea una lista con la clase TipoLibroDao
    public List<TipoLibro> getListaTipoLibros() {
        TipoLibroDao ad = new TipoLibroDao();
        listaTipoLibros = ad.listarTipoLibro();
        return listaTipoLibros;
    }

    public void setListaTipoLibros(List<TipoLibro> listaTipoLibros) {
        this.listaTipoLibros = listaTipoLibros;
    }

    public TipoLibro getTipoLibro() {
        return tipolibro;
    }

    public void setTipoLibro(TipoLibro tipolibro) {
        this.tipolibro = tipolibro;
    }

    //Limpiar TipoLibro
    public void limpiarTipoLibro() {
        tipolibro = new TipoLibro();
    }

    //Agregar TipoLibro
    public void agregarTipoLibro() {
        TipoLibroDao ad = new TipoLibroDao();
        ad.agregar(tipolibro);      
    }

    ///Modificar TipoLibro
    public void modificarTipoLibro() {
        TipoLibroDao ad = new TipoLibroDao();
        ad.modificar(tipolibro);
        limpiarTipoLibro();
    }

    //Eliminar TipoLibro
    public void eliminarTipoLibro() {
        TipoLibroDao ad = new TipoLibroDao();
        ad.eliminar(tipolibro);
        limpiarTipoLibro();
    }
}
