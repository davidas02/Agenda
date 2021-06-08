/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sauces.agenda.controladorAgenda;

import com.sauces.agenda.modelo.Contacto;
import com.sauces.agenda.modelo.ContactoDao;
import com.sauces.agenda.modelo.DaoException;
import com.sauces.agenda.vista.VentanaAgenda;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daw1
 */
public class ControladorAgenda {
    private VentanaAgenda ventana;
    private ContactoDao contactoDao;

    public ControladorAgenda(VentanaAgenda ventana, ContactoDao contactoDao) {
        this.ventana = ventana;
        this.contactoDao = contactoDao;
    }
    
    public void crear(){
    String nombre,telefono,email;
    nombre=ventana.getNombre();
    telefono=ventana.getTelefono();
    email=ventana.getEmail();
    }
    public void editar(){
    
    }
    public void borrar(){
    String nombre=ventana.getNombre();
    Contacto contacto=contactoDao.buscar(nombre);
   
    }
    public void buscar(){
        String nombre=ventana.getNombre();
        try {
            Contacto contacto=contactoDao.buscar(nombre);
            if(contacto!=null){
                ventana.mostrarTelefono(contacto.getTelefono());
                ventana.mostrarEmail(contacto.getEmail());
            }
        } catch (DaoException ex) {
            Logger.getLogger(ControladorAgenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void listar(){}
    public void exportar(){}
    public void importar(){
    }
    public void iniciar(){
        ventana.mostrar();
    }
}
