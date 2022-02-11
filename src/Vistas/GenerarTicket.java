/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Modelo.Cliente;
import Modelo.ClienteTicket;
import Modelo.Cuota;
import Modelo.Prestamo;
import Modelo.SaldoCliente;
import ModeloDao.ClienteDao;
import ModeloDao.CuotaDao;
import ModeloDao.PrestamoDao;
import ModeloDao.SaldoDao;
import configuracion.ColorearCelda;
import configuracion.ColorearFilas;
import configuracion.ColorearHeaderCuotaTikect;
import configuracion.ColorearHeaderResumenCuenta;
import configuracion.Fecha;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author santi
 */
public class GenerarTicket extends javax.swing.JInternalFrame {

    //DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo3 = new DefaultTableModel();
    ClienteDao clidao = new ClienteDao();
    Prestamo prestamo = new Prestamo();
    CuotaDao cuodao = new CuotaDao();
    SaldoDao saldodao = new SaldoDao();
    PrestamoDao predao = new PrestamoDao();
    List<Cuota> lista;
    List<Cliente> listaclientes = clidao.Listar();
    List<ClienteTicket> clientestick = new ArrayList();
    ColorearHeaderResumenCuenta CHRC = new ColorearHeaderResumenCuenta();
    ColorearHeaderCuotaTikect ColorHeaderTicket = new ColorearHeaderCuotaTikect();
    TableRowSorter trs;
    int id;
    String nombre;
    String apellido;
    String telefono;
    double montocuota;
    String importeprestado;
    ColorearFilas colorear = new ColorearFilas();
    String columnas[] = {"nroprestamo", "id cuota", "monto", "fecha pago", "estado", "nrocuota", "accion"};
    boolean ColumnasEditables[] = {false, false, false, false, false, false, true};
    Class tipo[] = new Class[]{java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,
        java.lang.Object.class, java.lang.Object.class,
        java.lang.Boolean.class};
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel() {
        public boolean isCellEditable(int row, int col) {
            return ColumnasEditables[col];
        }

        public Class getColumnClass(int index) {
            return tipo[index];
        }
    };

    public GenerarTicket() {
        initComponents();
        listar();
        tablaclientes.getTableHeader().setDefaultRenderer(CHRC);
        tablacuotas.getTableHeader().setDefaultRenderer(ColorHeaderTicket);
        tablaticket.getTableHeader().setDefaultRenderer(ColorHeaderTicket);

        tablacuotas.setDefaultRenderer(tablacuotas.getColumnClass(0), colorear);
        Fecha fec = new Fecha(); //instanciamos la clase fecha y obtenemos en forma de string
        String fecact = fec.Fecha();

        fechahoy.setText(fecact);
        modelo2.setColumnIdentifiers(columnas);
        tablacuotas.setModel(modelo2);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fechahoy = new javax.swing.JLabel();
        nada = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaclientes = new javax.swing.JTable();
        txtfiltro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablacuotas = new  ColorearCelda();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaticket = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnImprimirTicket = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        checkSeleccioanrTodo = new javax.swing.JCheckBox();

        setClosable(true);
        setMaximizable(true);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 255));
        jLabel1.setText("Tickets");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 255));
        jLabel4.setText("FECHA:");

        fechahoy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fechahoy.setForeground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(437, 437, 437)
                .addComponent(jLabel4)
                .addGap(41, 41, 41)
                .addComponent(fechahoy)
                .addGap(0, 274, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(fechahoy))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        nada.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        tablaclientes.setBackground(new java.awt.Color(204, 255, 204));
        tablaclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro cliente", "nombre ", "apellido ", "telefono"
            }
        ));
        tablaclientes.setCellSelectionEnabled(true);
        tablaclientes.setDragEnabled(true);
        tablaclientes.setRowHeight(24);
        tablaclientes.setShowGrid(true);
        tablaclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaclientesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaclientes);

        txtfiltro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfiltro.setForeground(new java.awt.Color(102, 102, 255));
        txtfiltro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        txtfiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfiltroKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout nadaLayout = new javax.swing.GroupLayout(nada);
        nada.setLayout(nadaLayout);
        nadaLayout.setHorizontalGroup(
            nadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nadaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtfiltro, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nadaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(207, 207, 207))
        );
        nadaLayout.setVerticalGroup(
            nadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nadaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        tablacuotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        tablacuotas.setRowHeight(22);
        jScrollPane1.setViewportView(tablacuotas);

        tablaticket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nombre", "apellido", "saldo pagado", "saldo moroso", "saldo debe", "total ", "fecha limite pago", "nro cuota", "monto cuota"
            }
        ));
        jScrollPane2.setViewportView(tablaticket);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Lista de clientes para cobrar");

        btnImprimirTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Print_icon-icons.com_73705.png"))); // NOI18N
        btnImprimirTicket.setText("imprimir");
        btnImprimirTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirTicketActionPerformed(evt);
            }
        });

        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar4.png"))); // NOI18N
        btneliminar.setText("eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImprimirTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(417, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImprimirTicket)
                    .addComponent(btneliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnagregar.setBackground(new java.awt.Color(0, 144, 74));
        btnagregar.setForeground(new java.awt.Color(204, 204, 204));
        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/anadir1.png"))); // NOI18N
        btnagregar.setText("agregar");
        btnagregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Cuotas");

        checkSeleccioanrTodo.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        checkSeleccioanrTodo.setText("seleccionar todo");
        checkSeleccioanrTodo.setEnabled(false);
        checkSeleccioanrTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSeleccioanrTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nada, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(411, 411, 411)
                    .addComponent(checkSeleccioanrTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(455, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnagregar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addComponent(nada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(269, 269, 269)
                    .addComponent(checkSeleccioanrTodo)
                    .addContainerGap(298, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        String Reportes = "";
        JTextArea area = new JTextArea();
        if (Seleccionados(6)) {
            for (int i = 0; i < tablacuotas.getRowCount(); i++) {
                boolean sel = (boolean) tablacuotas.getValueAt(i, 6);
                if (sel) {
                    Reportes += "Codigo prestamo :   " + tablacuotas.getValueAt(i, 0) + "      Monto Cuota : " + tablacuotas.getValueAt(i, 2)
                            + "     Fecha pago : " + tablacuotas.getValueAt(i, 3) + "\n";
                    //resumenpago_nropres.setText(Integer.toString((int) tablacuotas.getValueAt(i, 0)));

                    //buscamos los saldos
                    SaldoCliente saldocliente = saldodao.BuscarSaldo(id);
                    //double salgo_ac = saldodao.CalcularSalgoAcreedor((double) tablacuotas.getValueAt(i, 2));
                    //double capiprestado = Double.parseDouble(capitalprestado.getText());
                    double sa = saldocliente.getSaldoacreedor();
                    double sd = saldocliente.getSalgodeudor();
                    double sm = saldocliente.getSaldomoroso();
                    montocuota = (double) tablacuotas.getValueAt(i, 2);
                    Double total = cuodao.calculartotalpagar(montocuota, sm);

                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");

                    var fechalimitepago = dateFormat.format(tablacuotas.getValueAt(i, 3));

                    int nrocuota = (int) tablacuotas.getValueAt(i, 4);

                    modelo3 = (DefaultTableModel) tablaticket.getModel();
                    
                    prestamo = predao.infoprestamo(id);
                    importeprestado = Double.toString(prestamo.getMontoprestado());
                    //creamos cliente ticket para la lista de impresion
                    ClienteTicket cli_ticket = new ClienteTicket();
                    cli_ticket.setNombre(nombre);
                    cli_ticket.setApellido(apellido);
                    cli_ticket.setTelefono(telefono);
                    cli_ticket.setSaldopagado(Double.toString(sa));
                    cli_ticket.setSaldomoroso(Double.toString(sm));
                    cli_ticket.setSaldodebe(Double.toString(sd));
                    cli_ticket.setImporteprestado(importeprestado);

                    cli_ticket.setMontocuota(Double.toString(montocuota));
                    cli_ticket.setNrocuota(Integer.toString(nrocuota));
                    cli_ticket.setFechalimitepago(fechalimitepago);
                    cli_ticket.setTotal(Double.toString(total));
                    
                    
                    clientestick.add(cli_ticket);

                    Object[] ob = new Object[9];
                    ob[0] = nombre;
                    ob[1] = apellido;
                    ob[2] = sa;
                    ob[3] = sm;
                    ob[4] = sd;
                    ob[5] = total;
                    ob[6] = fechalimitepago;
                    ob[7] = nrocuota;
                    ob[8] = montocuota;
                    modelo3.addRow(ob);

                    tablaticket.setModel(modelo3);

                }
            }
            area.setText(Reportes);
            JOptionPane.showMessageDialog(this, area);

            JOptionPane.showMessageDialog(this, "Agregado a la lista");

        } else {
            JOptionPane.showMessageDialog(null, "Antes de obtener los datos, debe de seleccionar por lo menos a un checkbox",
                    "Mensaje", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnagregarActionPerformed

    private void txtfiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfiltroKeyTyped
        txtfiltro.addKeyListener(new KeyAdapter() {
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
    }//GEN-LAST:event_txtfiltroKeyTyped

    void lipiartablacuotas() {
        for (int i = 0; i < modelo2.getRowCount(); i++) {
            modelo2.removeRow(i);
            i = i - 1;
        }
    }
    private void tablaclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaclientesMouseClicked
        lipiartablacuotas();
        int seleccionar = tablaclientes.getSelectedRow();
        id = Integer.parseInt((tablaclientes.getValueAt(seleccionar, 0).toString()));
        nombre = tablaclientes.getValueAt(seleccionar, 1).toString();
        apellido = tablaclientes.getValueAt(seleccionar, 2).toString();
        telefono = tablaclientes.getValueAt(seleccionar, 3).toString();
        modelo2 = (DefaultTableModel) tablacuotas.getModel();

        lista = cuodao.BuscarCuotas(id);
        Object[] objeto = new Object[7];

        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getIdprestamo();
            objeto[1] = lista.get(i).getIdcuota();
            objeto[2] = lista.get(i).getMonto();
            objeto[3] = lista.get(i).getFechapago();
            objeto[4] = lista.get(i).getNumero_cuota();
            objeto[5] = lista.get(i).getEstadocuota();
            objeto[6] = checkSeleccioanrTodo.isSelected(); // si o si pasar el valor booleano

            modelo2.addRow(objeto);

        }

        tablacuotas.setModel(modelo2);
    }//GEN-LAST:event_tablaclientesMouseClicked

    private void checkSeleccioanrTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSeleccioanrTodoActionPerformed
        if (checkSeleccioanrTodo.isSelected()) {
            checkSeleccioanrTodo.setText("Deseleccionar Todo");
            for (int i = 0; i < tablacuotas.getRowCount(); i++) {
                tablacuotas.setValueAt(true, i, 6);
            }
        } else {
            checkSeleccioanrTodo.setText("Seleccionar Todo");
            for (int i = 0; i < tablacuotas.getRowCount(); i++) {
                tablacuotas.setValueAt(false, i, 6);
            }
        }
    }//GEN-LAST:event_checkSeleccioanrTodoActionPerformed

    private void btnImprimirTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirTicketActionPerformed
        try {
            JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\santi\\Documents\\NetBeansProjects\\Prestamin\\src\\Reportes\\GenerarTicket.jasper");
            Map parametro = new HashMap();
            //parametro.put("nombre", nombre);
            //parametro.put("apellido", apellido);
            //parametro.put("telefono", telefono);
            parametro.put("fechaemision", fechahoy.getText());

            parametro.put("fondoimagen", "C:\\Users\\santi\\Documents\\NetBeansProjects\\Prestamin\\src\\Iconos\\Prestamin2.png");
            JasperPrint pirnt = JasperFillManager.fillReport(reporte, parametro, new JRBeanCollectionDataSource(clientestick));
            JasperViewer.viewReport(pirnt, false);
        } catch (JRException ex) {
            Logger.getLogger(RegistrarCobro2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnImprimirTicketActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        int selec = tablaticket.getSelectedRow();
        clientestick.remove(selec);
        modelo3.removeRow(selec);
    }//GEN-LAST:event_btneliminarActionPerformed

    public void filtro() {
        int columnanombre = 1;
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + txtfiltro.getText(), columnanombre));
    }

    void listar() {
        modelo = (DefaultTableModel) tablaclientes.getModel();
        Object[] objeto = new Object[4];
        for (int i = 0; i < listaclientes.size(); i++) {
            objeto[1] = listaclientes.get(i).getNombre();
            objeto[2] = listaclientes.get(i).getApellido();
            objeto[3] = listaclientes.get(i).getTelefono();
            objeto[0] = listaclientes.get(i).getId();

            modelo.addRow(objeto);

        }
        tablaclientes.setModel(modelo);
    }

    private boolean Seleccionados(int pos) {
        int contador = 0;
        boolean bandera = true;

        for (int i = 0; i < tablacuotas.getRowCount(); i++) {
            boolean seleccion = (boolean) (tablacuotas.getValueAt(i, pos));
            if (seleccion) {
                contador++;
            }
        }
        if (contador == 0) {
            bandera = false;
        }
        return bandera;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimirTicket;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JCheckBox checkSeleccioanrTodo;
    private javax.swing.JLabel fechahoy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel nada;
    private javax.swing.JTable tablaclientes;
    private javax.swing.JTable tablacuotas;
    private javax.swing.JTable tablaticket;
    private javax.swing.JTextField txtfiltro;
    // End of variables declaration//GEN-END:variables
}
