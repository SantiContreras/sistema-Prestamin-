package configuracion;


import java.awt.Color;
import static java.awt.Color.green;
import static java.awt.Color.red;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author santi
 */
public class ColorearFilas extends DefaultTableCellRenderer{
    private Component component ; 

  
   

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
         component =super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
         if (row%2 == 0) {
            Color color = new Color(230,232,248);
            component.setBackground(color);
            component.setForeground(Color.black);
            
            
        }
         else {
             //Color color = new Color(102,102,255);
            component.setBackground(Color.WHITE);
            component.setForeground(Color.black);
         }
         
        
         
       
         
         
         
         return this; //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
