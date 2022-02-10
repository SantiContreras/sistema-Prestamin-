package configuracion;


import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author santi
 */
public class ColorearHeader extends DefaultTableCellRenderer {
    private Component componente;
    
    @Override
    public Component getTableCellRendererComponent(JTable tabla, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
         componente =super.getTableCellRendererComponent(tabla, value, isSelected, hasFocus, row, column);
         
         //if (row%2 == 0) {
            Color color = new Color(102,102,102);
            componente.setBackground(color);
            componente.setForeground(Color.WHITE);
            
        //}
        // else {
            //component.setBackground(Color.LIGHT_GRAY);
             //component.setForeground(Color.black);
         //}
         return this; //To change body of generated methods, choose Tools | Templates.
    }
}
