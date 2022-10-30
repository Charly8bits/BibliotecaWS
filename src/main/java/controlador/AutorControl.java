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
import modelo.dao.AutorDao;
import modelo.entidad.Autor;


/**
 *
 * @author umg
 */

@ManagedBean
@ViewScoped
public class AutorControl {

    // Variables
    private List<Autor> listaAutors;
    private Autor persona;
    
    // Construtor
    public AutorControl() {
        persona = new Autor();
    }
    
    //Crea una lista con clase AutorDao
    public List<Autor> getListaAutors() {
        AutorDao ad = new AutorDao();
        listaAutors = ad.listarAutor();
        return listaAutors;
    }

    public void setListaAutors(List<Autor> listaAutors) {
        this.listaAutors = listaAutors;
    }

    public Autor getAutor() {
        return persona;
    }

    public void setAutor(Autor persona) {
        this.persona = persona;
    }

   //Limpiar autor
    public void limpiarAutor() {
        persona = new Autor();
    }
    
    //Agregar autor
    public void agregarAutor() {
        AutorDao ad = new AutorDao();
        ad.agregar(persona);      
    }

    //Modificar autor
    public void modificarAutor() {
        AutorDao ad = new AutorDao();
        ad.modificar(persona);
        limpiarAutor();
    }

    //Eliminar autor
    public void eliminarAutor() {
        AutorDao ad = new AutorDao();
        ad.eliminar(persona);
        limpiarAutor();
    }
}
