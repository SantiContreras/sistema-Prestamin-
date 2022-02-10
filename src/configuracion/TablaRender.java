/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package configuracion;

import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author santi
 */
public class TablaRender extends DefaultTableCellRenderer {

    /*
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
       JLabel label = new JLabel();
       JCheckBox check = new JCheckBox();
       DefaultTableModel model = (DefaultTableModel) table.getModel();
       
       if(model.getValueAt(row, column).getClass().equals(Boolean.class)) {
           check.setSelected(Boolean.parseBoolean(model.getValueAt(row, column).toString()));
       return check;
       }
        if (column!=6) { 
            label.setText(model.getValueAt(row, column).toString());
        }
        
        return label;*/

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        if (o instanceof JCheckBox) {
            JCheckBox checks = (JCheckBox) o;
            return checks;
        }
        return super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1); //To change body of generated methods, choose Tools | Templates.
    }

}
