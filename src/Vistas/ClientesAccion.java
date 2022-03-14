/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Modelo.Cliente;
import ModeloDao.ClienteDao;
import ModeloDao.PrestamoDao;
import configuracion.ColorearHeaderCuotaTikect;
import configuracion.ColorearHeaderResumenCuenta;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author santi
 */
public class ClientesAccion extends javax.swing.JInternalFrame {

    ClienteDao clidao = new ClienteDao();
    List<Cliente> listaclientes = clidao.Listar();
    DefaultTableModel modelo = new DefaultTableModel();
    ColorearHeaderCuotaTikect ColorCli = new ColorearHeaderCuotaTikect();
    TableRowSorter trs;
    PrestamoDao presdao = new PrestamoDao();

    public ClientesAccion() {
        initComponents();
        listar();
        seriecliente();
        tablaclientes.getTableHeader().setDefaultRenderer(ColorCli);

    }

    void listar() {
        modelo = (DefaultTableModel) tablaclientes.getModel();
        Object[] objeto = new Object[8];
        for (int i = 0; i < listaclientes.size(); i++) {
            objeto[0] = listaclientes.get(i).getId();
            objeto[1] = listaclientes.get(i).getNombre();
            objeto[2] = listaclientes.get(i).getApellido();

            objeto[3] = listaclientes.get(i).getDireccion();
            objeto[4] = listaclientes.get(i).getDni();
            objeto[5] = listaclientes.get(i).getEmail();
            objeto[6] = listaclientes.get(i).getTelefono();
            objeto[7] = listaclientes.get(i).getEstado();

            modelo.addRow(objeto);
        }
        tablaclientes.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnrocliente = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txtestado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        ADDCLIENTE = new javax.swing.JButton();
        MODIFICARCLIENTE = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaclientes = new javax.swing.JTable();
        FILTRARCLIENTE = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CLIENTES");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Datos del cliente");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("nro cliente");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("nombre");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("apellido");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("telefono");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Correo");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("estado");

        txtnrocliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtnombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtapellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txttelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtdireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtcorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtestado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("direccion");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Dni");

        txtdni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttelefono)
                                    .addComponent(txtdireccion)
                                    .addComponent(txtcorreo)
                                    .addComponent(txtnrocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombre)
                                    .addComponent(txtapellido)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdni)
                                    .addComponent(txtestado))))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnrocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        ADDCLIENTE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ADDCLIENTE.setText("AGREGAR");
        ADDCLIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDCLIENTEActionPerformed(evt);
            }
        });

        MODIFICARCLIENTE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MODIFICARCLIENTE.setText("MODIFICAR");
        MODIFICARCLIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODIFICARCLIENTEActionPerformed(evt);
            }
        });

        tablaclientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nro cliente", "nombre", "apellido", "direccion", "dni", "email", "telefono", "estado"
            }
        ));
        tablaclientes.setRowHeight(23);
        tablaclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaclientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaclientes);

        FILTRARCLIENTE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FILTRARCLIENTE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        FILTRARCLIENTE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FILTRARCLIENTEKeyTyped(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nrocliente", "nombre", "apellido", "direccion", "dni", "email", "telefono", "estado" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ADDCLIENTE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MODIFICARCLIENTE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(FILTRARCLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FILTRARCLIENTE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADDCLIENTE)
                    .addComponent(MODIFICARCLIENTE))
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FILTRARCLIENTEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FILTRARCLIENTEKeyTyped
        FILTRARCLIENTE.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(final KeyEvent e) {
                // Llamamos al método encargado de realizar el filtro
                filtro();
            }
        });
        // Inicializamos el objeto trsfiltro de la clase TableRowSorter con
        // el modelo de la tabla, que para nuestro caso es tabladatos
        trs = new TableRowSorter(modelo);
        // Añadimos al Jtable el filtro trsfiltro
        tablaclientes.setRowSorter(trs);
    }//GEN-LAST:event_FILTRARCLIENTEKeyTyped

    private void tablaclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaclientesMouseClicked

        int seleccionar = tablaclientes.getSelectedRow();
        int id = Integer.parseInt((tablaclientes.getValueAt(seleccionar, 0).toString()));
        String nombre = tablaclientes.getValueAt(seleccionar, 1).toString();
        String apellido = tablaclientes.getValueAt(seleccionar, 2).toString();
         String direccion = tablaclientes.getValueAt(seleccionar, 3).toString();
        String dni = tablaclientes.getValueAt(seleccionar, 4).toString();
        String correo =tablaclientes.getValueAt(seleccionar, 5).toString();
        String telefono = tablaclientes.getValueAt(seleccionar,6).toString();
       
        String estado = tablaclientes.getValueAt(seleccionar, 7).toString();
        txtnrocliente.setText(Integer.toString(id));
        txtnombre.setText(nombre);
        txtapellido.setText(apellido);
        txttelefono.setText(telefono);
        txtdireccion.setText(direccion);
        txtestado.setText(estado);
        txtcorreo.setText(correo);
        txtdni.setText(dni);

    }//GEN-LAST:event_tablaclientesMouseClicked

    void BorrarCampos() {
        txtnrocliente.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txttelefono.setText("");
        txtdireccion.setText("");
        txtestado.setText("");
        txtdni.setText("");
        txtcorreo.setText("");
    }
    private void ADDCLIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDCLIENTEActionPerformed
        Cliente cli = new Cliente();
        String nombre = txtnombre.getText();
        String apellido = txtapellido.getText();
        String telefono = txttelefono.getText();
        String direccion = txtdireccion.getText();
        String dni = txtdni.getText();
        String correo = txtcorreo.getText();
        String estado = txtestado.getText();

        cli.setNombre(nombre);
        cli.setApellido(apellido);
        cli.setTelefono(telefono);
        cli.setDireccion(direccion);
        cli.setEmail(correo);
        cli.setDni(dni);
        cli.setEstado(estado);

        clidao.GuardarCliente(cli);
        JOptionPane.showMessageDialog(this, "El cliente se a guardado con exito");
        LimpiarTabla();

        BorrarCampos();
        listar2();
        seriecliente();


    }//GEN-LAST:event_ADDCLIENTEActionPerformed

    private void MODIFICARCLIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODIFICARCLIENTEActionPerformed
        Cliente cli = new Cliente();
        String nombre = txtnombre.getText();
        String apellido = txtapellido.getText();
        String telefono = txttelefono.getText();
        String direccion = txtdireccion.getText();
        String dni = txtdni.getText();
        String correo = txtcorreo.getText();
        String estado = txtestado.getText();
        int id = Integer.parseInt(txtnrocliente.getText());

        cli.setNombre(nombre);
        cli.setApellido(apellido);
        cli.setTelefono(telefono);
        cli.setDireccion(direccion);
        cli.setEmail(correo);
        cli.setDni(dni);
        cli.setEstado(estado);
        cli.setId(id);
        clidao.actualizarcliente(cli);
        LimpiarTabla();

        BorrarCampos();
        listar2();
        seriecliente();

        JOptionPane.showMessageDialog(this, "CLIENTE ACTUALIZADO");
    }//GEN-LAST:event_MODIFICARCLIENTEActionPerformed
    public void filtro() {
        int columnanombre = 1;
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + FILTRARCLIENTE.getText(),jComboBox1.getSelectedIndex()));
    }

    void LimpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    void listar2() {
        List<Cliente> listaclientes2 = clidao.Listar();
        modelo = (DefaultTableModel) tablaclientes.getModel();
        Object[] objeto = new Object[8];
        for (int i = 0; i < listaclientes2.size(); i++) {
            objeto[0] = listaclientes2.get(i).getId();
            objeto[1] = listaclientes2.get(i).getNombre();
            objeto[2] = listaclientes2.get(i).getApellido();

            objeto[3] = listaclientes2.get(i).getDireccion();
            objeto[4] = listaclientes2.get(i).getDni();
            objeto[5] = listaclientes2.get(i).getEmail();
            objeto[6] = listaclientes2.get(i).getTelefono();
            objeto[7] = listaclientes2.get(i).getEstado();

            modelo.addRow(objeto);
        }
    }

    void seriecliente() {
        String serie = clidao.IdCliente();

        if (serie == null) {
            txtnrocliente.setText("0000" + 1);
        } else {
            int inc = Integer.parseInt(serie) + 1;
            txtnrocliente.setText(Integer.toString(inc));
            txtnrocliente.setForeground(Color.blue);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDCLIENTE;
    private javax.swing.JTextField FILTRARCLIENTE;
    private javax.swing.JButton MODIFICARCLIENTE;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaclientes;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtestado;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnrocliente;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
