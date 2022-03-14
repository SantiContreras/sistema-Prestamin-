/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package configuracion;

import java.awt.Color;
import static java.awt.Color.green;
import static java.awt.Color.red;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author santi
 */
public class ColorearCelda extends JTable {
    
    
    @Override
    public Component prepareRenderer(TableCellRenderer renderer , int row , int Col){
         Component component = super.prepareRenderer(renderer,  row,  Col);
         
         if(this.getValueAt(row, Col).toString().equals("PENDIENTE")){
             component.setBackground(red);
         }
         if(this.getValueAt(row, Col).toString().equals("PAGADA")){
         
         component.setBackground(green);
         
         }
         
         if(this.getValueAt(row, Col).toString().equals("ATRASADA")){
         
         component.setBackground(Color.yellow);
         
         }
         
          if(this.getValueAt(row, Col).toString().equals("VENCIDA")){
         
         component.setBackground(Color.darkGray);
         
         }
        
         return component;
    }
}
