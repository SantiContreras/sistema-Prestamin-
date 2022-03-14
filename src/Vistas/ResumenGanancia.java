/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Modelo.Cliente;
import Modelo.Prestamo;
import ModeloDao.GananciaDao;
import ModeloDao.PrestamoDao;
import configuracion.ColorearHeaderCuotaTikect;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author santi
 */
public class ResumenGanancia extends javax.swing.JInternalFrame {

    PrestamoDao predao = new PrestamoDao();
    Prestamo pre = new Prestamo();
    GananciaDao gandao = new GananciaDao();
    List<Prestamo> listaprestamos = predao.BuscarPrestamo();
    DefaultTableModel modelo = new DefaultTableModel();
    ColorearHeaderCuotaTikect ColorGanancia = new ColorearHeaderCuotaTikect();

    public ResumenGanancia() {
        initComponents();
        //listarprestamos();
        tablaresumen.getTableHeader().setDefaultRenderer(ColorGanancia);
    }

    public void BuscarPrestamosPorFecha() {

        java.sql.Date fechaOn = null;
        java.sql.Date fechaIn = null;
        double totalganado =0;

        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        //parseamos la fecha de inicio para pasarle a un tipo date
        String diaini = Integer.toString(fechainicio.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mesini = Integer.toString(fechainicio.getCalendar().get(Calendar.MONTH) + 1);
        String yearini = Integer.toString(fechainicio.getCalendar().get(Calendar.YEAR));
        String fechainicial = yearini + "-" + mesini + "-" + diaini;
        /*try {
            Date fechainic = formato.parse(fechainicial);
            fechaIn = new java.sql.Date(fechainic.getTime());
        } catch (Exception e) {
        }*/

        String diafin = Integer.toString(fechafin.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mesfin = Integer.toString(fechafin.getCalendar().get(Calendar.MONTH) + 1);
        String yearfin = Integer.toString(fechafin.getCalendar().get(Calendar.YEAR));
        String fechafinal = yearfin + "-" + mesfin + "-" + diafin;

        /*try {
            Date fechafin = formato.parse(fechafinal);
            fechaOn = new java.sql.Date(fechafin.getTime());
        } catch (Exception e) {
        }*/
        modelo = (DefaultTableModel) tablaresumen.getModel();
        List<Prestamo> listaporfechas = predao.BuscarPrestamoRangoFecha(fechainicial, fechafinal);

        if (listaporfechas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No Hay Prestamos Con Esa Fecha");
        }

        for (int i = 0; i < listaporfechas.size(); i++) {
            Object[] ob = new Object[9];
            
            
            double prestado = listaporfechas.get(i).getTotalpagar();
            double devolver = listaporfechas.get(i).getMontoprestado();
            double gananciaprestamo = gandao.GananciaPorPrestamo(prestado , devolver);
            totalganado =totalganado + gananciaprestamo;
           
            ob[0] = listaporfechas.get(i).getId_prestamo();
            ob[1] = listaporfechas.get(i).getEstado();
            ob[2] = listaporfechas.get(i).getFecha_inicio();
            ob[3] = listaporfechas.get(i).getFormapago();
            ob[4] = listaporfechas.get(i).getMontoprestado();
            ob[5] = listaporfechas.get(i).getIntereses();
            ob[6] = listaporfechas.get(i).getCantidadcuotas();
            ob[7] = listaporfechas.get(i).getTotalpagar();
            ob[8] = gananciaprestamo;

            modelo.addRow(ob);

        }
        tablaresumen.setModel(modelo);
        TotalGanado.setText("$"+Double.toString(totalganado));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnbuscar = new javax.swing.JButton();
        fechafin = new com.toedter.calendar.JDateChooser();
        fechainicio = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaresumen = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TotalGanado = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Ganancia1.png"))); // NOI18N
        jLabel1.setText("Resumen general");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(204, 204, 255));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DESDE");

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("HASTA");

        btnbuscar.setBackground(new java.awt.Color(153, 51, 0));
        btnbuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/buscar4.png"))); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.setBorder(null);
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechafin, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3))
                    .addComponent(fechainicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechafin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        tablaresumen.setAutoCreateRowSorter(true);
        tablaresumen.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        tablaresumen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro prestamo", "Estado", "Fecha Registro", "Forma Pago", "Monto a devolver", "Intereses", "cantidad de cuotas", "Monto prestado", "Ganancia por prestamo"
            }
        ));
        tablaresumen.setGridColor(new java.awt.Color(102, 102, 255));
        tablaresumen.setRowHeight(20);
        jScrollPane1.setViewportView(tablaresumen);

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/EXEL1.png"))); // NOI18N
        jLabel2.setText("Exportar");

        jLabel7.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabel7.setText("TOTAL GANADO:");

        TotalGanado.setFont(new java.awt.Font("Lucida Sans", 0, 36)); // NOI18N
        TotalGanado.setForeground(new java.awt.Color(102, 102, 255));
        TotalGanado.setText("$300.000");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(0, 1035, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(27, 27, 27)
                .addComponent(TotalGanado, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TotalGanado))
                .addGap(149, 149, 149))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        limpiartabla() ;
        BuscarPrestamosPorFecha();
      
    }//GEN-LAST:event_btnbuscarActionPerformed
    void listarprestamos() {

        modelo = (DefaultTableModel) tablaresumen.getModel();
        Object[] ob = new Object[8];
        for (int i = 0; i < listaprestamos.size(); i++) {

            ob[0] = listaprestamos.get(i).getId_prestamo();
            ob[1] = listaprestamos.get(i).getEstado();
            ob[2] = listaprestamos.get(i).getFecha_inicio();
            ob[3] = listaprestamos.get(i).getFormapago();
            ob[4] = listaprestamos.get(i).getMontoprestado();
            ob[5] = listaprestamos.get(i).getIntereses();
            ob[6] = listaprestamos.get(i).getCantidadcuotas();
            ob[7] = listaprestamos.get(i).getTotalpagar();

            modelo.addRow(ob);

        }
        tablaresumen.setModel(modelo);
    }

    void limpiartabla() {

        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TotalGanado;
    private javax.swing.JButton btnbuscar;
    private com.toedter.calendar.JDateChooser fechafin;
    private com.toedter.calendar.JDateChooser fechainicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaresumen;
    // End of variables declaration//GEN-END:variables
}
