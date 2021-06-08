/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sauces.agenda.AppAgenda;

import com.sauces.agenda.controladorAgenda.ControladorAgenda;
import com.sauces.agenda.modelo.*;
import com.sauces.agenda.vista.VentanaAgenda;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author daw1
 */
public class AppAgenda {
    public static void main(String[] args) {
    String url,usuario,password;
    ControladorAgenda controlador;
    ContactoDao modelo;
        VentanaAgenda vista;
    Properties propiedades;
 
    vista=new VentanaAgenda();
    propiedades=new Properties();
 
 try(InputStream is=ClassLoader.getSystemClassLoader().getResourceAsStream("conexion.properties");){
 propiedades.load(is);
 url=propiedades.getProperty("url");
 usuario=propiedades.getProperty("usuario");
 password=propiedades.getProperty("password");
 
 ConexionBD conexion=new ConexionBD(url,usuario,password);
 modelo=new ContactoDaoJdbc(conexion);
 
 controlador=new ControladorAgenda(vista,modelo);
 vista.setControlador(controlador);
 controlador.iniciar();
 } catch (IOException ex) {
 vista.mostrarMensaje(ex.getMessage());
 } 
    }
}
