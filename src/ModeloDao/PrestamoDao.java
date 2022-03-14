/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDao;

import Modelo.Cliente;
import Modelo.Conexion;
import Modelo.Prestamo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PrestamoDao {

    PreparedStatement ps;
    ResultSet rs;
    Cliente cli = new Cliente();
    Conexion acceso = new Conexion();
    Connection con;
    public int r = 0;

    public String GenerarSerie() {
        String sql = "Select Max(id_prestamo) from prestamo";
        String serie = "";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                serie = Integer.toString(rs.getInt(1));
            }
        } catch (Exception e) {
        }

        return serie;
    }

    public int GuardarPrestamo(Prestamo prestamo) {
        String sql = "insert into prestamo(id_cliente ,fechaInicio,totalpagar,monto,intereses,cantidad_cuotas,estado_prestamo,formapago)"
                + "values(?,?,?,?,?,?,?,?)";
        int r = 0;
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);

            ps.setInt(1, prestamo.getId_cliente());
            ps.setDate(2, (Date) prestamo.getFecha_inicio());
            ps.setDouble(3, prestamo.getTotalpagar());
            ps.setDouble(4, prestamo.getMontoprestado());
            ps.setDouble(5, prestamo.getIntereses());
            ps.setInt(6, prestamo.getCantidadcuotas());
            ps.setString(7, prestamo.getEstado());
            ps.setString(8, prestamo.getFormapago());
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("Error al Guardar el prestamo:" + e);
        }

        return r;

    }

    public double TotalPagarSemanal(int cantidad, double montoprestado) {
        double total = 0;
        double interes = 0;
        switch (cantidad) {

            case 4:
                interes = 1.20;
                break;
            case 6:
                interes = 1.35;
                break;
            case 8:
                interes = 1.45;
                break;
            case 10:
                interes = 1.55;
                break;
            case 12:
                interes = 1.65;
                break;
            case 14:
                interes = 1.73;
                break;
            case 16:
                interes = 1.81;
                break;
            case 18:
                interes = 1.89;
                break;
            case 20:
                interes = 1.97;
                break;
            case 22:
                interes = 2.05;
                break;
            case 24:
                interes = 2.13;
                break;
            case 26:
                interes = 2.21;
                break;
            case 28:
                interes = 2.29;
                break;
            case 30:
                interes = 2.37;
                break;
            case 32:
                interes = 2.45;
                break;
            case 34:
                interes = 2.53;
                break;
            case 36:
                interes = 2.61;
                break;
            case 38:
                interes = 2.69;
                break;
            case 40:
                interes = 2.77;
                break;
            case 42:
                interes = 2.85;
                break;
            case 44:
                interes = 2.93;
                break;
            case 46:
                interes = 3.01;
                break;
            case 48:
                interes = 3.09;
                break;

        }

        total = (montoprestado * interes);

        return total;
    }

    public double TotalPagarMensual(int cantidad, double montoprestado) {

        double total = 0;
        double interes = 0;
        switch (cantidad) {

            case 2:
                interes = 1.30;
                break;
            case 3:
                interes = 1.45;
                break;
            case 4:
                interes = 1.60;
                break;
            case 5:
                interes = 1.75;
                break;
            case 6:
                interes = 1.90;
                break;
            case 7:
                interes = 2.05;
                break;
            case 8:
                interes = 2.20;
                break;
            case 9:
                interes = 2.35;
                break;
            case 10:
                interes = 2.50;
                break;
            case 11:
                interes = 2.65;
                break;
            case 12:
                interes = 2.80;
                break;

        }

        total = (montoprestado * interes);

        return total;
    }

    public Prestamo infoprestamo(int id) {
        String sql = "SELECT p.id_prestamo ,p.totalpagar , p.monto , p.cantidad_cuotas , p.estado_prestamo , p.fechaInicio , p.formapago FROM prestamo p ,cliente c where p.id_cliente =?";
        Prestamo p = new Prestamo();
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {

                p.setId_prestamo(rs.getInt(1));
                p.setTotalpagar(rs.getDouble(2));
                p.setMontoprestado(rs.getDouble(3));

                p.setCantidadcuotas(rs.getInt(4));
                p.setEstado(rs.getString(5));
                p.setFecha_inicio(rs.getDate(6));
                p.setFormapago(rs.getString(7));
            }
        } catch (Exception e) {
        }

        return p;
    }

    public List BuscarPrestamo() {

        List<Prestamo> lista = new ArrayList<>();
        String sql = "select * from prestamo";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
          
            rs = ps.executeQuery();
            while (rs.next()) {
                Prestamo pre = new Prestamo();
                pre.setId_prestamo(rs.getInt(1));
                pre.setId_cliente(rs.getInt(2));
                pre.setFecha_inicio(rs.getDate(3));
                pre.setMontoprestado(rs.getDouble(4));
                pre.setTotalpagar(rs.getDouble(5));
                pre.setIntereses(rs.getDouble(6));
                pre.setCantidadcuotas(rs.getInt(7));
                pre.setEstado(rs.getString(8));
               
                pre.setFormapago(rs.getString(9));
                lista.add(pre);
            }
        } catch (Exception e) {
        }
        return lista;

    }
    
    public List BuscarPrestamoRangoFecha(String desde , String hasta) {

        List<Prestamo> lista = new ArrayList<>();
        String sql = "select * from prestamo WHERE fechaInicio >=? and fechaInicio <= ?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, desde);
            ps.setString(2, hasta);
          
            rs = ps.executeQuery();
            while (rs.next()) {
                Prestamo pre = new Prestamo();
                pre.setId_prestamo(rs.getInt(1));
                pre.setId_cliente(rs.getInt(2));
                pre.setFecha_inicio(rs.getDate(3));
                pre.setMontoprestado(rs.getDouble(4));
                pre.setTotalpagar(rs.getDouble(5));
                pre.setIntereses(rs.getDouble(6));
                pre.setCantidadcuotas(rs.getInt(7));
                pre.setEstado(rs.getString(8));
               
                pre.setFormapago(rs.getString(9));
                lista.add(pre);
            }
        } catch (Exception e) {}
           
        return lista;

    }
    
    public void EliminarPrestamo(int id) {
        
        String sql ="DELETE FROM prestamo WHERE  id_prestamo = ?";
            try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
         
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
            
            
    }
    
    public int ActualizarEstadoPrestamo( int id) {
        int r=0;
        String sql = "UPDATE prestamo set estado_prestamo=\"CANCELADO\" WHERE id_prestamo=?;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            
          
           
             
            r = ps.executeUpdate();
        } catch (Exception e) {
            
        }
        return r;
    }
    
    public int ActualizarDespuesDeEliminacionAutomatica() {
        String sql ="INSERT into prestamo(id_cliente,fechaInicio,totalpagar,monto,intereses,cantidad_cuotas,estado_prestamo,formapago) \n" +
"VALUES(80,\"2021-03-01\",0,0,1.2,4,\"cancelado\",\"semanal\");";
       int r = 0;
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);

       
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("Error al Guardar el prestamo:" + e);
        }

        return r;
    
    }


}
