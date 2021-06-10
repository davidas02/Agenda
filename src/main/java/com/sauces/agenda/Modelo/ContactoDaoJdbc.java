/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sauces.agenda.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author daw1
 */
public class ContactoDaoJdbc implements ContactoDao{
    private ConexionBD conexion;

    public ContactoDaoJdbc(ConexionBD conexion) {
        this.conexion = conexion;
    }
    
    @Override
    public int modificar(Contacto contacto) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Contacto> listar() throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertar(Contacto contacto) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Contacto buscar(String nombre) throws DaoException {
     Contacto c=null;
     try(Connection con=conexion.getConnection();
             PreparedStatement ps=con.prepareStatement("SELECT * FROM contacto WHERE nombre=?");){
     ps.setString(1,nombre);
     ResultSet rs=ps.executeQuery();
     while(rs.next()){
     c=new Contacto(rs.getString("nombre"),rs.getString("telefono"),rs.getString("email"));
     }
     }catch(SQLException ex){
         throw new DaoException(ex.getMessage());
     }
     return c;
    }

    @Override
    public int borrar(String nombre) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
