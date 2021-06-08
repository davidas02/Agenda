/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sauces.agenda.vista;

import com.sauces.agenda.modelo.Contacto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class ContactoTableModel extends AbstractTableModel{
        private List<Contacto> listado;
    private String[] columnas=new String[]{};
    
    public ContactoTableModel() {
        listado=new ArrayList<>();
        columnas=new String[]{"CODIGO","TITULAR","SALDO"};
    }

    public List<Contacto> getCuentas() {
        return listado;
    }

    public void setCuentas(List<Contacto> listado) {
        this.listado = listado;
        this.fireTableDataChanged();
    }

    public String[] getColumnas() {
        return columnas;
    }

    public void setColumnas(String[] columnas) {
        this.columnas = columnas;
    }
    
            @Override
    public int getRowCount() {
        return listado.size();
    }

    @Override
    public int getColumnCount() {
       return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Contacto c=listado.get(rowIndex);
        Object o=null;
        switch(columnIndex){
           case 0:o=c.getNombre();
            break;
           case 1:o=c.getTelefono();
            break;
           case 2:o=c.getEmail();
           break;
        }
        return o;
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        Class<?> clase=null;
        switch(columnIndex){
            case 0: clase=String.class;
            break;
            case 1: clase=String.class;
            break;
            case 2: clase=String.class;
        }
               return clase;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
}
