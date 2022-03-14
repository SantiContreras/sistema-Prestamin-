/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Modelo.Cliente;
import Modelo.Cuota;
import Modelo.Prestamo;
import Modelo.SaldoCliente;
import ModeloDao.ClienteDao;
import ModeloDao.CuotaDao;
import ModeloDao.PrestamoDao;
import ModeloDao.SaldoDao;
import configuracion.ColorearCelda;
import configuracion.ColorearFilas;
import configuracion.ColorearHeader;
import configuracion.Fecha;
import configuracion.TablaRender;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.RowFilter;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.data.empty.EmptyDataAdapter;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author santi
 */
public class RegistrarCobro2 extends javax.swing.JInternalFrame {

    //TablaRender renderer = new TablaRender();
    //JCheckBox check = new JCheckBox();
    //DefaultCellEditor defaultcelleditor = new DefaultCellEditor(check);
    ClienteDao clidao = new ClienteDao();
    Prestamo prestamo = new Prestamo();
    CuotaDao cuodao = new CuotaDao();
    SaldoDao saldodao = new SaldoDao();
    PrestamoDao predao = new PrestamoDao();
    Double montoabonado; // es el dinero real  que entrego al cobrador 
    Double saldocuota; // diferencia de la cuota promedio y lo que el cliente pago 
    Double atraso; // acucumulacion de atrasos de los clientes
    String direccion;
    int idprestamo;
    String nombre;
    String apellido;
    boolean verificarestado;
    List<Cliente> listita = new ArrayList<>();
    List<Cliente> lista = clidao.Listar();
    String columnas[] = {"nro prestamo", "id cuota", "monto", "abonado", "saldo cuota","atraso", "fecha pago", "estado", "nrocuota", "accion"};
    boolean ColumnasEditables[] = {false, false, false, false,false, false, false, false, false, true};
    Class tipo[] = new Class[]{java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,
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
    ColorearHeader CH = new ColorearHeader();
    ColorearFilas colorear = new ColorearFilas();
    //ColorearCelda CC = new ColorearCelda();
    TableRowSorter trs;
    int id;
    int idcuota;
    String dni;
    Double capital;

    public RegistrarCobro2() {
        initComponents();
        listar();
        Fecha fec = new Fecha(); //instanciamos la clase fecha y obtenemos en forma de string
        String fecact = fec.Fecha();

        LabelFecha.setText(fecact);
        // listarcuotas();

        tablaclientes.getTableHeader().setDefaultRenderer(CH);
        //tablaclientes.setDefaultRenderer(tablacuotas.getColumnClass(0), colorear);

        tablacuotas.getTableHeader().setDefaultRenderer(CH);
        tablacuotas.setDefaultRenderer(tablacuotas.getColumnClass(0), colorear);

        modelo2.setColumnIdentifiers(columnas);
        tablacuotas.setModel(modelo2);
        

    }

    void listar() {

        modelo = (DefaultTableModel) tablaclientes.getModel();
        Object[] objeto = new Object[3];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getNombre();
            objeto[1] = lista.get(i).getApellido();
            objeto[2] = lista.get(i).getId();
            //objeto[3] = lista.get(i).getTelefono();
            //objeto[4] = lista.get(i).getId();
            modelo.addRow(objeto);

        }
        tablaclientes.setModel(modelo);
    }

    /* void listarcuotas() {
        List<Cuota> lista = cuodao.BuscarCuotas();
        modelo2 = (DefaultTableModel) tablacuotas.getModel();
        Object[] objeto = new Object[6];
        

        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getIdcuota();
            objeto[1] = lista.get(i).getIdprestamo();
            objeto[2] = lista.get(i).getMonto();
            objeto[3] = lista.get(i).getFechapago();
            objeto[4] = lista.get(i).getEstadocuota();
            objeto[5] = lista.get(i).getNumero_cuota();
            

            modelo2.addRow(objeto);

        }
        tablacuotas.setModel(modelo2);
    }
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaclientes = new javax.swing.JTable();
        printclintes = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtfiltro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        LabelFecha = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablacuotas = new ColorearCelda();
        checkSeleccioanrTodo = new javax.swing.JCheckBox();
        ValorPagadoCliente = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        pagaratraso = new javax.swing.JButton();
        Aviso = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nroprestamo = new javax.swing.JLabel();
        capitalprestado = new javax.swing.JLabel();
        cantidadcuotas = new javax.swing.JLabel();
        capitalpagar = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        EstadoPrestamo = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nada = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        resumenpago_salgores = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        resumenpago_moncuo = new javax.swing.JLabel();
        resumen_cuota = new javax.swing.JLabel();
        resumenpago_fechapago = new javax.swing.JLabel();
        resumenpago_saldodudor = new javax.swing.JLabel();
        resumenpago_nomcli = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        saldopagado = new javax.swing.JLabel();
        EstadoCuota = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        atrasocliente = new javax.swing.JLabel();
        totalabonado = new javax.swing.JLabel();
        LeyendaSaldo = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        BtnImprimir = new javax.swing.JButton();
        btnpagar = new javax.swing.JButton();
        ModificarPago = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/RegistroPago1.png"))); // NOI18N
        jLabel1.setText("Registrar Cobro");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("CLIENTES"));

        tablaclientes.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        tablaclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "APELLIDO", "ID"
            }
        ));
        tablaclientes.setRowHeight(24);
        tablaclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaclientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaclientes);

        printclintes.setText("imprimir clientes");
        printclintes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printclintesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addComponent(printclintes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(170, Short.MAX_VALUE)
                        .addComponent(printclintes))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N

        txtfiltro.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtfiltro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 1, true));
        txtfiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfiltroKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabel2.setText("FECHA:");

        LabelFecha.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        LabelFecha.setText("25/10/2021");

        jComboBox1.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOMBRE", "APELLIDO", "DNI" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(LabelFecha)
                .addGap(148, 148, 148))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LabelFecha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1)
                    .addComponent(txtfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("RESUMEN DE CUENTA"));

        tablacuotas.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        tablacuotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", "", "", "", ""
            }
        ));
        tablacuotas.setRowHeight(24);
        jScrollPane2.setViewportView(tablacuotas);

        checkSeleccioanrTodo.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        checkSeleccioanrTodo.setText("seleccionar todo");
        checkSeleccioanrTodo.setEnabled(false);
        checkSeleccioanrTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSeleccioanrTodoActionPerformed(evt);
            }
        });

        ValorPagadoCliente.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        ValorPagadoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        ValorPagadoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorPagadoClienteActionPerformed(evt);
            }
        });

        jLabel16.setText("Ingrese valor:");

        pagaratraso.setText("Pagar atraso en ultima cuota");
        pagaratraso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagaratrasoActionPerformed(evt);
            }
        });

        Aviso.setText("jLabel18");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(ValorPagadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(checkSeleccioanrTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pagaratraso)
                        .addGap(31, 31, 31)
                        .addComponent(Aviso, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(ValorPagadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkSeleccioanrTodo)
                    .addComponent(pagaratraso)
                    .addComponent(Aviso))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("INFORMACION PRESTAMO"));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel4.setText("NRO PRESTAMO:");

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel5.setText("CAPITAL PRESTADO:");

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel6.setText("CANTIDAD CUOTAS:");

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel7.setText("TOTAL A DEVOLVER:");

        nroprestamo.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        nroprestamo.setForeground(new java.awt.Color(0, 51, 153));

        capitalprestado.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        capitalprestado.setForeground(new java.awt.Color(0, 51, 153));

        cantidadcuotas.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        cantidadcuotas.setForeground(new java.awt.Color(0, 51, 153));

        capitalpagar.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        capitalpagar.setForeground(new java.awt.Color(0, 51, 153));

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel8.setText("ESTADO PRESTAMO:");

        EstadoPrestamo.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        EstadoPrestamo.setForeground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(capitalpagar)
                            .addComponent(cantidadcuotas)
                            .addComponent(capitalprestado)
                            .addComponent(nroprestamo)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(EstadoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nroprestamo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(capitalprestado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cantidadcuotas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(capitalpagar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(EstadoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DETALLE DE PAGO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI", 0, 12))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel12.setText("Estado :");

        jLabel13.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel13.setText("monto cuota:");

        nada.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        nada.setText("nro cuota: ");

        jLabel15.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel15.setText("fecha pago:");

        resumenpago_salgores.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        resumenpago_salgores.setText("saldo restante:");

        jLabel17.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel17.setText("nombre cliente:");

        resumenpago_moncuo.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        resumenpago_moncuo.setForeground(new java.awt.Color(0, 51, 153));

        resumen_cuota.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        resumen_cuota.setForeground(new java.awt.Color(0, 51, 153));

        resumenpago_fechapago.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        resumenpago_fechapago.setForeground(new java.awt.Color(0, 51, 153));

        resumenpago_saldodudor.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        resumenpago_saldodudor.setForeground(new java.awt.Color(0, 51, 153));

        resumenpago_nomcli.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        resumenpago_nomcli.setForeground(new java.awt.Color(0, 51, 153));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel3.setText("Saldo Pagado:");

        saldopagado.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        saldopagado.setForeground(new java.awt.Color(51, 102, 0));

        EstadoCuota.setText(" ");

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel9.setText("Atraso:");

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel11.setText("Abonado:   $");

        jLabel14.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N

        atrasocliente.setText("jLabel18");

        totalabonado.setText("jLabel19");

        LeyendaSaldo.setText("jLabel18");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resumenpago_nomcli))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resumenpago_fechapago))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resumenpago_moncuo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EstadoCuota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(resumenpago_salgores)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resumenpago_saldodudor)
                            .addComponent(saldopagado)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel14))
                                            .addComponent(jLabel10)))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(atrasocliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LeyendaSaldo))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(nada)
                                .addGap(18, 18, 18)
                                .addComponent(resumen_cuota, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel11)))
                        .addGap(18, 18, 18)
                        .addComponent(totalabonado)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resumen_cuota, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(nada)
                        .addComponent(EstadoCuota))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(totalabonado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(resumenpago_moncuo)
                    .addComponent(resumenpago_salgores)
                    .addComponent(resumenpago_saldodudor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(resumenpago_fechapago)
                        .addComponent(jLabel3)
                        .addComponent(saldopagado)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(resumenpago_nomcli)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(atrasocliente)
                    .addComponent(LeyendaSaldo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ACCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI", 0, 11))); // NOI18N

        BtnImprimir.setBackground(new java.awt.Color(153, 198, 108));
        BtnImprimir.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        BtnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/imprimir3.png"))); // NOI18N
        BtnImprimir.setText("imprimir");
        BtnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnImprimirActionPerformed(evt);
            }
        });

        btnpagar.setFont(new java.awt.Font("Leelawadee UI", 0, 10)); // NOI18N
        btnpagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cash1.png"))); // NOI18N
        btnpagar.setText("PAGAR");
        btnpagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpagarActionPerformed(evt);
            }
        });

        ModificarPago.setText("ANULA PAGO");
        ModificarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BtnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ModificarPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnpagar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnImprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ModificarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnpagar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaclientesMouseClicked
        //int seleccionar = tablaclientes.rowAtPoint(evt.getPoint());
        limpiartablacuota();
        int seleccionar = tablaclientes.getSelectedRow();
        id = Integer.parseInt((tablaclientes.getValueAt(seleccionar, 2).toString()));
        //direccion = (tablaclientes.getValueAt(seleccionar, 3).toString());
        //dni = (String) tablaclientes.getValueAt(seleccionar, 2);
        modelo2 = (DefaultTableModel) tablacuotas.getModel();
        Cliente cliente = clidao.BuscarClientePorId( id);
        nombre = cliente.getNombre();
        apellido = cliente.getApellido();
        List<Cuota> lista = cuodao.BuscarCuotas(id);
       
      
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El cliente no posee prestamos vigente");
        }
        Object[] objeto = new Object[10];

        for (int i = 0; i < lista.size(); i++) {
            
            
                    
            objeto[0] = lista.get(i).getIdprestamo();
            objeto[1] = lista.get(i).getIdcuota();
            objeto[2] = lista.get(i).getMonto();
            objeto[3] = lista.get(i).getAbonado();
            objeto[4] = lista.get(i).getSaldocuota();
            objeto[5] = lista.get(i).getAtraso();
            objeto[6] = lista.get(i).getFechapago();

            objeto[7] = lista.get(i).getEstadocuota();
            objeto[8] = lista.get(i).getNumero_cuota();
            objeto[9] = checkSeleccioanrTodo.isSelected(); // paso un valor voleano para la sellecion
            if(objeto[7].equals("VENCIDA")) {
              verificarestado = true;
            } else{
                verificarestado = false;
            }
            
            modelo2.addRow(objeto);

        }
        
        if (verificarestado == true) {
         btnpagar.setEnabled(false);
        }else{
           btnpagar.setEnabled(true);
        }

        tablacuotas.setModel(modelo2);
        //obtenemos el valor de la cuota promedio que debe pagar el cliente
        ValorPagadoCliente.setText(tablacuotas.getValueAt(1, 2).toString());

        obtenerinfoprestamo();


    }//GEN-LAST:event_tablaclientesMouseClicked

    private void txtfiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfiltroKeyTyped

        /* txtfiltro.addKeyListener(new KeyAdapter() {

            public void KeyReleased(final KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter(txtfiltro.getText(), 1));
            }
        }
        );

        trs = new TableRowSorter(tablaclientes.getModel());
        tablaclientes.setRowSorter(trs);*/
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
        obtenerinfoprestamo();
    }//GEN-LAST:event_txtfiltroKeyTyped

    private void btnpagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpagarActionPerformed
        String Reportes = "";
        int maximocuota=0;
        JTextArea area = new JTextArea();
        if (Seleccionados(9)) {
            for (int i = 0; i < tablacuotas.getRowCount(); i++) {
                boolean sel = (boolean) tablacuotas.getValueAt(i, 9);
                if (sel) {
                    Reportes += "Codigo prestamo :   " + tablacuotas.getValueAt(i, 0) + "      Monto Cuota : " + tablacuotas.getValueAt(i, 2)
                            + "     Fecha pago : " + tablacuotas.getValueAt(i, 6) + "\n";
                    //resumenpago_nropres.setText(Integer.toString((int) tablacuotas.getValueAt(i, 0)));
                    
                    resumenpago_moncuo.setText(Double.toString((double) tablacuotas.getValueAt(i, 2)));
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");
                     int numerocuota = (int) tablacuotas.getValueAt(i, 8); // para comprar el numero de cuota
                    var fecha = dateFormat.format(tablacuotas.getValueAt(i, 6));
                    resumenpago_fechapago.setText(fecha);
                    resumen_cuota.setText(Integer.toString((int) tablacuotas.getValueAt(i, 8)));
                   
                    resumenpago_nomcli.setText(nombre + " " + apellido);

                    //buscamos los saldos
                    SaldoCliente saldocliente = saldodao.BuscarSaldo(id);
                    //double salgo_ac = saldodao.CalcularSalgoAcreedor((double) tablacuotas.getValueAt(i, 2));
                    //double capiprestado = Double.parseDouble(capitalprestado.getText());
                    double pagadoporelcliente = Double.parseDouble(ValorPagadoCliente.getText());
                    double sm = saldocliente.getSaldomoroso();
                    double sa = saldocliente.getSaldoacreedor();

                    double montocu = (double) tablacuotas.getValueAt(i, 2);
                    double saldo_ac = saldodao.CalcularSalgoAcreedor(sa, pagadoporelcliente);
                    double saldo_debe = capital - saldo_ac;
                    double morosidad = saldodao.CalcularAtraso(montocu, pagadoporelcliente, sm); //calcula si paga de mas o de menos el saldo moroso
                    double saldo_m = morosidad;
                    resumenpago_saldodudor.setText(Double.toString(saldo_debe));
                    saldopagado.setText(Double.toString(saldo_ac));
                    saldodao.ActualizarSaldo(saldo_debe, saldo_ac, saldo_m, id);
                    idcuota = (int) tablacuotas.getValueAt(i, 1);
                    atrasocliente.setText(Double.toString(saldo_m));// trae el saldo atrasado acumulado
                    totalabonado.setText(ValorPagadoCliente.getText());
                    montoabonado = pagadoporelcliente;
                    saldocuota = montocu - pagadoporelcliente;
                    atraso = saldo_m;

                    if (pagadoporelcliente < montocu && saldo_m > 0) {
                        EstadoCuota.setText("ATRASADA");
                    } else 
                    if(saldo_m<=0){
                        EstadoCuota.setText("PAGADA");
                       
                    }
                    
                    if(saldo_m<0) {
                       LeyendaSaldo.setText("(A FAVOR DEL CLIENTE)");
                        LeyendaSaldo.setBackground(Color.red);
                    }
                     
                    //pregunto si es la ultima cuota del cliente y hago las actualizaciones
                     maximocuota = (cuodao.CantidadCuotas(Integer.parseInt(nroprestamo.getText())));

                    if (Integer.parseInt(cantidadcuotas.getText()) == numerocuota) {
                        if (saldo_m > 0) {
                            EstadoCuota.setText("VENCIDA");
                            Aviso.setText("El cliente tiene atrasos,pagar con la funcion pagar atrasos");
                        }
                    }

                }
            }
            area.setText(Reportes);
            JOptionPane.showMessageDialog(this, area);
            cuodao.ActualizarCuotar(EstadoCuota.getText(), montoabonado, saldocuota,atraso, idcuota);
            JOptionPane.showMessageDialog(this, " Se pago la cuota con exito!!");

        } else {
            JOptionPane.showMessageDialog(null, "Antes de obtener los datos, debe de seleccionar por lo menos a un checkbox",
                    "Mensaje", JOptionPane.WARNING_MESSAGE);
        }

        FinalizacionPrestamo();
    }//GEN-LAST:event_btnpagarActionPerformed

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

    private void BtnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnImprimirActionPerformed
        try {
            JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\santi\\Documents\\NetBeansProjects\\Prestamin\\src\\Reportes\\ResumenPago.jasper");
            Map parametro = new HashMap();
            parametro.put("nombre", resumenpago_nomcli.getText());
            parametro.put("telefono", direccion);
            parametro.put("montocuota", resumenpago_moncuo.getText());
            parametro.put("fechalimitepago", resumenpago_fechapago.getText());
            parametro.put("nrocuota", resumen_cuota.getText());
            parametro.put("montopagado", saldopagado.getText());
            parametro.put("montodebe", resumenpago_saldodudor.getText());
            parametro.put("EstadoCuota", EstadoCuota.getText());
            parametro.put("EstadoCuenta", EstadoPrestamo.getText());
            parametro.put("abonado", totalabonado.getText());
            parametro.put("atraso", atrasocliente.getText());

            parametro.put("fondoimagen", "C:\\Users\\santi\\Documents\\NetBeansProjects\\Prestamin\\src\\Iconos\\Prestamin2.png");
            JasperPrint pirnt = JasperFillManager.fillReport(reporte, parametro, new JREmptyDataSource());
            JasperViewer.viewReport(pirnt, false);
        } catch (JRException ex) {
            Logger.getLogger(RegistrarCobro2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnImprimirActionPerformed

    private void printclintesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printclintesActionPerformed
        try {
            JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\santi\\Documents\\NetBeansProjects\\Prestamin\\src\\Reportes\\ReporteClientes.jasper");
            Map parametro = new HashMap();
            //Map parametro2 = new HashMap();
            parametro.put("nroprestamo", nroprestamo.getText());
            parametro.put("capitalprestado", capitalprestado.getText());
            parametro.put("saldodebe", resumenpago_saldodudor.getText());
            parametro.put("fondoimagen", "C:\\Users\\santi\\Documents\\NetBeansProjects\\Prestamin\\src\\Iconos\\Prestamin2.png");
            //parametro2.put("capital prestado", capitalprestado.getText());
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, new JRBeanCollectionDataSource(lista));
            JasperViewer.viewReport(jprint, false);
        } catch (JRException ex) {
            // Logger.getLogger(ConsultasClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_printclintesActionPerformed

    private void ValorPagadoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorPagadoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorPagadoClienteActionPerformed

    private void ModificarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarPagoActionPerformed
        if (Seleccionados(9)) {
            for (int i = 0; i < tablacuotas.getRowCount(); i++) {
                boolean sel = (boolean) tablacuotas.getValueAt(i, 9);
                if (sel) {

                    SaldoCliente saldocliente = saldodao.BuscarSaldo(id);

                    double pagadoporelcliente = Double.parseDouble(ValorPagadoCliente.getText());
                    double sm = saldocliente.getSaldomoroso();
                    double sa = saldocliente.getSaldoacreedor();
                    double sd = saldocliente.getSalgodeudor();

                    double abonado = (double) tablacuotas.getValueAt(i, 3);
                    double saldocuota = (double) tablacuotas.getValueAt(i, 4);
                    double montocuota = (double) tablacuotas.getValueAt(i, 2);
                    double nuevo_sm = 0;
                    int idcuota = (int) tablacuotas.getValueAt(i, 1);

                    if (sm > 0) {
                        nuevo_sm = sm - saldocuota;
                    } else if (sm <= 0) {
                        nuevo_sm = sm - saldocuota;
                    }
                    double nuevo_sa = sa - abonado;
                    double nuevo_sb = sd + abonado;

                    saldodao.ActualizarSaldo(nuevo_sb, nuevo_sa, nuevo_sm, id);

                    String estado = "PENDIENTE";
                    cuodao.ActualizarCuotaMalCargarga(0, 0, estado, idcuota);

                    saldopagado.setText(Double.toString(nuevo_sa));
                    atrasocliente.setText(Double.toString(nuevo_sm));
                    resumenpago_saldodudor.setText(Double.toString(nuevo_sb));

                }
            }
            //area.setText(Reportes);
            //JOptionPane.showMessageDialog(this, area);

            JOptionPane.showMessageDialog(this, " Se modifico la cuota EXITOSAMENTE!!");

        }
    }//GEN-LAST:event_ModificarPagoActionPerformed

    private void pagaratrasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagaratrasoActionPerformed
        if (Seleccionados(9)) {
            for (int i = 0; i < tablacuotas.getRowCount(); i++) {
                boolean sel = (boolean) tablacuotas.getValueAt(i, 9);
                if (sel) {
                    //Reportes += "Codigo prestamo :   " + tablacuotas.getValueAt(i, 0) + "      Monto Cuota : " + tablacuotas.getValueAt(i, 2)
                    //        + "     Fecha pago : " + tablacuotas.getValueAt(i, 5) + "\n";
                    //resumenpago_nropres.setText(Integer.toString((int) tablacuotas.getValueAt(i, 0)));
                    
                    resumenpago_moncuo.setText(Double.toString((double) tablacuotas.getValueAt(i, 2)));
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");
                     int numerocuota = (int) tablacuotas.getValueAt(i, 8); // para comprar el numero de cuota
                    var fecha = dateFormat.format(tablacuotas.getValueAt(i, 5));
                    resumenpago_fechapago.setText(fecha);
                    resumen_cuota.setText(Integer.toString((int) tablacuotas.getValueAt(i, 8)));
                    
                    resumenpago_nomcli.setText(nombre + " " + apellido);

                    //buscamos los saldos
                    SaldoCliente saldocliente = saldodao.BuscarSaldo(id);
                    //double salgo_ac = saldodao.CalcularSalgoAcreedor((double) tablacuotas.getValueAt(i, 2));
                    //double capiprestado = Double.parseDouble(capitalprestado.getText());
                    double pagadoporelcliente = Double.parseDouble(ValorPagadoCliente.getText());
                    double sm = saldocliente.getSaldomoroso();
                    double sa = saldocliente.getSaldoacreedor();

                    //double montocu = (double) tablacuotas.getValueAt(i, 2);
                    double saldo_ac = saldodao.CalcularSalgoAcreedor(sa, pagadoporelcliente);
                    double saldo_debe = capital - saldo_ac;
                    //double morosidad = saldodao.CalcularAtraso(montocu, pagadoporelcliente, sm); //calcula si paga de mas o de menos el saldo moroso
                    double saldo_m = sm - pagadoporelcliente;
                    resumenpago_saldodudor.setText(Double.toString(saldo_debe));
                    saldopagado.setText(Double.toString(saldo_ac));
                    saldodao.ActualizarSaldo(saldo_debe, saldo_ac, saldo_m, id);
                    idcuota = (int) tablacuotas.getValueAt(i, 1);
                    atrasocliente.setText(Double.toString(saldo_m));// trae el saldo atrasado acumulado
                    totalabonado.setText(ValorPagadoCliente.getText());
                    montoabonado = pagadoporelcliente;
                    saldocuota = sm - pagadoporelcliente;
                    atraso = saldocuota;

                  if(saldo_m > 0) {
                      EstadoCuota.setText("VENCIDA");
                  }
                  
                  if(saldo_m<=0){
                      EstadoCuota.setText("PAGADA");
                  }
                     
                    //pregunto si es la ultima cuota del cliente y hago las actualizaciones
                     //maximocuota = (cuodao.CantidadCuotas(Integer.parseInt(nroprestamo.getText())));

                  

                }
            }
            //area.setText(Reportes);
            //JOptionPane.showMessageDialog(this, area);
            cuodao.ActualizarCuotar(EstadoCuota.getText(), montoabonado, saldocuota,atraso, idcuota);
            JOptionPane.showMessageDialog(this, " Se Pago atraso, vuelva a dar click en el cliente para actualizar!!");
            FinalizacionPrestamo();
        }
    }//GEN-LAST:event_pagaratrasoActionPerformed

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

    public void filtro() {
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + txtfiltro.getText(), jComboBox1.getSelectedIndex()));
    }

    void limpiartablacuota() {
        for (int i = 0; i < modelo2.getRowCount(); i++) {
            modelo2.removeRow(i);
            i = i - 1;
        }
    }

    void obtenerinfoprestamo() {
        prestamo = predao.infoprestamo(id);
        nroprestamo.setText(Integer.toString(prestamo.getId_prestamo()));
        capitalprestado.setText(Double.toString(prestamo.getMontoprestado()));
        capitalpagar.setText(Double.toString(prestamo.getTotalpagar()));
        cantidadcuotas.setText(Integer.toString(prestamo.getCantidadcuotas()));
        EstadoPrestamo.setText(prestamo.getEstado());
        capital = prestamo.getTotalpagar();
    }

    void FinalizacionPrestamo() {
        SaldoCliente saldocli = new SaldoCliente();
        saldocli = saldodao.BuscarSaldo(id);

        double saldodebe = saldocli.getSalgodeudor();
        double saldomoroso = saldocli.getSaldomoroso();

        if (saldodebe <= 0 && saldomoroso <= 0) {
            predao.ActualizarEstadoPrestamo(id);
            EstadoPrestamo.setText("CANCELADO");
            idprestamo = Integer.parseInt(nroprestamo.getText());
            predao.EliminarPrestamo(idprestamo);
            JOptionPane.showMessageDialog(this, "El cliente ha finalizado el pago del prestamo");
            predao.ActualizarDespuesDeEliminacionAutomatica();
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Aviso;
    private javax.swing.JButton BtnImprimir;
    private javax.swing.JLabel EstadoCuota;
    private javax.swing.JLabel EstadoPrestamo;
    private javax.swing.JLabel LabelFecha;
    private javax.swing.JLabel LeyendaSaldo;
    private javax.swing.JButton ModificarPago;
    private javax.swing.JTextField ValorPagadoCliente;
    private javax.swing.JLabel atrasocliente;
    private javax.swing.JButton btnpagar;
    private javax.swing.JLabel cantidadcuotas;
    private javax.swing.JLabel capitalpagar;
    private javax.swing.JLabel capitalprestado;
    private javax.swing.JCheckBox checkSeleccioanrTodo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nada;
    private javax.swing.JLabel nroprestamo;
    private javax.swing.JButton pagaratraso;
    private javax.swing.JButton printclintes;
    private javax.swing.JLabel resumen_cuota;
    private javax.swing.JLabel resumenpago_fechapago;
    private javax.swing.JLabel resumenpago_moncuo;
    private javax.swing.JLabel resumenpago_nomcli;
    private javax.swing.JLabel resumenpago_saldodudor;
    private javax.swing.JLabel resumenpago_salgores;
    private javax.swing.JLabel saldopagado;
    private javax.swing.JTable tablaclientes;
    private javax.swing.JTable tablacuotas;
    private javax.swing.JLabel totalabonado;
    private javax.swing.JTextField txtfiltro;
    // End of variables declaration//GEN-END:variables
}
