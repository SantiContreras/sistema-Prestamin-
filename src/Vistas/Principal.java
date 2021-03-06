/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

/**
 *
 * @author santi
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        /*
        };*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Iconos/ImagenFondo8.jpg"));
        Image image = icon.getImage();
        VentanaPrincipal = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        jMenuBar1 = new javax.swing.JMenuBar();
        NuevoPrestamo = new javax.swing.JMenu();
        NewPrestamo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        RegistrarCobro2 = new javax.swing.JMenuItem();
        EstadoGanancia = new javax.swing.JMenu();
        Ganancia = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        tickects = new javax.swing.JMenuItem();
        HistoriaPago = new javax.swing.JMenu();
        HistorialDePago = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        VentanaPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout VentanaPrincipalLayout = new javax.swing.GroupLayout(VentanaPrincipal);
        VentanaPrincipal.setLayout(VentanaPrincipalLayout);
        VentanaPrincipalLayout.setHorizontalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1486, Short.MAX_VALUE)
        );
        VentanaPrincipalLayout.setVerticalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 717, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 255));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        NuevoPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/RegistroCobro1.png"))); // NOI18N
        NuevoPrestamo.setText("Prestamo");
        NuevoPrestamo.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        NuevoPrestamo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NuevoPrestamo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        NuevoPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoPrestamoActionPerformed(evt);
            }
        });

        NewPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/add4.png"))); // NOI18N
        NewPrestamo.setText("Nuevo Prestamo");
        NewPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPrestamoActionPerformed(evt);
            }
        });
        NuevoPrestamo.add(NewPrestamo);

        jMenuBar1.add(NuevoPrestamo);

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Pago3.png"))); // NOI18N
        jMenu2.setText("Cobro");
        jMenu2.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jMenu2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        RegistrarCobro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/registro5.png"))); // NOI18N
        RegistrarCobro2.setText("Registrar Cobro 2");
        RegistrarCobro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarCobro2ActionPerformed(evt);
            }
        });
        jMenu2.add(RegistrarCobro2);

        jMenuBar1.add(jMenu2);

        EstadoGanancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Ganancia1.png"))); // NOI18N
        EstadoGanancia.setText("Estado Ganacias");
        EstadoGanancia.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        EstadoGanancia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EstadoGanancia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Ganancia.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        Ganancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ganancias2.png"))); // NOI18N
        Ganancia.setText("Resumen General");
        Ganancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GananciaActionPerformed(evt);
            }
        });
        EstadoGanancia.add(Ganancia);

        jMenuBar1.add(EstadoGanancia);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/clientes2.png"))); // NOI18N
        jMenu4.setText("Clientes");
        jMenu4.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jMenu4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItem3.setText("ver clientes");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ticket2.png"))); // NOI18N
        jMenu5.setText("Tickets");
        jMenu5.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jMenu5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        tickects.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ticket3.png"))); // NOI18N
        tickects.setText("Generar tickets");
        tickects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tickectsActionPerformed(evt);
            }
        });
        jMenu5.add(tickects);

        jMenuBar1.add(jMenu5);

        HistoriaPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/historial1.png"))); // NOI18N
        HistoriaPago.setText("Historial de prestamos");
        HistoriaPago.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        HistoriaPago.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HistoriaPago.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        HistoriaPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoriaPagoActionPerformed(evt);
            }
        });

        HistorialDePago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/historialPago1.png"))); // NOI18N
        HistorialDePago.setText("HistorialDePago");
        HistorialDePago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialDePagoActionPerformed(evt);
            }
        });
        HistoriaPago.add(HistorialDePago);

        jMenuBar1.add(HistoriaPago);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(VentanaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(VentanaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 703, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoPrestamoActionPerformed
        NuevoPrestamo np = new NuevoPrestamo();
        CentrarVentana(np);
    }//GEN-LAST:event_NuevoPrestamoActionPerformed

    private void NewPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPrestamoActionPerformed
        NuevoPrestamo np = new NuevoPrestamo();
        CentrarVentana(np);
    }//GEN-LAST:event_NewPrestamoActionPerformed

    private void HistoriaPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoriaPagoActionPerformed

    }//GEN-LAST:event_HistoriaPagoActionPerformed

    private void HistorialDePagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialDePagoActionPerformed
        HistorialDePrestamo2 historial = new HistorialDePrestamo2();
        CentrarVentana(historial);
    }//GEN-LAST:event_HistorialDePagoActionPerformed

    private void GananciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GananciaActionPerformed
        ResumenGanancia ganancia = new ResumenGanancia();
        CentrarVentana(ganancia);
    }//GEN-LAST:event_GananciaActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void RegistrarCobro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarCobro2ActionPerformed
        RegistrarCobro2 cobro2 = new RegistrarCobro2();
        CentrarVentana(cobro2);
    }//GEN-LAST:event_RegistrarCobro2ActionPerformed

    private void tickectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tickectsActionPerformed
        GenerarTicket tickect = new GenerarTicket();
        CentrarVentana(tickect);
    }//GEN-LAST:event_tickectsActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ClientesAccion cliaccion = new ClientesAccion();
        CentrarVentana(cliaccion);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    void CentrarVentana(JInternalFrame frame) {
        VentanaPrincipal.add(frame);
        Dimension dimension = VentanaPrincipal.getSize();
        Dimension Dframe = frame.getSize();
        frame.setLocation((dimension.width - Dframe.width) / 4, (dimension.height - Dframe.height) / 6);
        frame.show();

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu EstadoGanancia;
    private javax.swing.JMenuItem Ganancia;
    private javax.swing.JMenu HistoriaPago;
    private javax.swing.JMenuItem HistorialDePago;
    private javax.swing.JMenuItem NewPrestamo;
    private javax.swing.JMenu NuevoPrestamo;
    private javax.swing.JMenuItem RegistrarCobro2;
    private javax.swing.JDesktopPane VentanaPrincipal;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem tickects;
    // End of variables declaration//GEN-END:variables
}
