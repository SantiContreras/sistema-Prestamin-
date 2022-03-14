/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDao;

import Modelo.Cliente;
import Modelo.ClienteTicket;
import Modelo.Conexion;
import Modelo.Cuota;
import Modelo.Prestamo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class CuotaDao {

    PreparedStatement ps;
    ResultSet rs;
    Cliente cli = new Cliente();
    Cuota cuota = new Cuota();
    Conexion acceso = new Conexion();
    Connection con;
    int r = 0;

    public int GuardarCuota(Cuota cuota) {
        String sql = "insert into cuota(id_prestamo,montocuota,fechapago,estado_cuota,numero_cuota) values(?,?,?,?,?)";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);

            ps.setInt(1, cuota.getIdprestamo());
            ps.setDouble(2, cuota.getMonto());
            ps.setDate(3, (Date) cuota.getFechapago());
            ps.setString(4, cuota.getEstadocuota());
            ps.setInt(5, cuota.getNumero_cuota());
            r = ps.executeUpdate();

        } catch (Exception e) {
            System.err.println("Error al Guardar la cuota:" + e);
        }

        return r;
    }

    public List BuscarCuotas(int id) {
        List<Cuota> lista = new ArrayList<>();
        String sql = "select c.id_cuota ,c.id_prestamo,c.montocuota ,c.abonado,c.saldocuota,c.atraso,c.fechapago,c.estado_cuota,c.numero_cuota    \n"
                + "from  cuota c , prestamo p \n"
                + "where p.id_prestamo = c.id_prestamo and p.id_cliente=?;";

        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cuota c = new Cuota();
                c.setIdcuota(rs.getInt(1));
                c.setIdprestamo(rs.getInt(2));
                c.setMonto(rs.getDouble(3));
                c.setAbonado(rs.getDouble(4));
                c.setSaldocuota(rs.getDouble(5));
                c.setAtraso(rs.getDouble(6));
                c.setFechapago(rs.getDate(7));
                c.setEstadocuota(rs.getString(8));
                c.setNumero_cuota(rs.getInt(9));
                lista.add(c);
            }

        } catch (Exception e) {
        }
        return lista;
    }

    public double CalcularCuotaSemanal(int cantidad, double montoprestado) {
        double totalcuota = 0;
        double interes = 0;
        DecimalFormat df = new DecimalFormat("#0.00");

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

        totalcuota = (interes * montoprestado) / cantidad;
        totalcuota = Math.round(totalcuota * 100d) / 100;

        return totalcuota;

    }

    public double asignarinteresessemanales(int cantidad) {
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

        return interes;

    }

    public double asignarinteresesmenuales(int cantidad) {
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

        return interes;
    }

    public double CalcularCuotaMensual(int cantidad, double montoprestado) {
        double interes = 0;
        double total = 0;
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

        total = (interes * montoprestado) / cantidad;

        return total;
    }

    public int ActualizarCuotar(String estado, double abonado, double cuosaldo, double atraso, int id) {
        String sql = "update cuota set estado_cuota =? ,abonado=? , saldocuota=?, atraso=? where id_cuota=?";

        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);

            ps.setInt(5, id);
            ps.setString(1, estado);
            ps.setDouble(2, abonado);
            ps.setDouble(3, cuosaldo);
            ps.setDouble(4, atraso);

            r = ps.executeUpdate();
        } catch (Exception e) {
        }

        return r;
    }

    public double calcularsalgomoroso(double monto) {
        double saldo = 0;

        return saldo;
    }

    public double calculartotalpagar(double montocuota, double saldomoroso) {
        double total = 0;

        total = montocuota + saldomoroso;

        return total;
    }

    public List BuscarCuotasPorRangos(String desde, String hasta) {
        List<ClienteTicket> lista = new ArrayList<>();
        String sql = "select  DISTINCT c.nombre , c.apellido ,c.direccion,c.telefono, s.montoacreedor , s.montodeudor , s.montomoroso , cu.fechapago ,cu.montocuota ,cu.numero_cuota,p.totalpagar from cuota cu , prestamo p , cliente c , saldocliente s where cu.id_prestamo = p.id_prestamo and p.id_cliente = c.id_cliente and c.id_cliente=s.id_cliente and cu.fechapago>=?"
                + " and cu.fechapago <=? and cu.estado_cuota=\"PENDIENTE\"";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, desde);
            ps.setString(2, hasta);

            rs = ps.executeQuery();
            while (rs.next()) {
                ClienteTicket cliticket = new ClienteTicket();
                cliticket.setNombre(rs.getString(1));
                cliticket.setApellido(rs.getString(2));
                cliticket.setDireccion(rs.getString(3));
                cliticket.setTelefono(rs.getString(4));
                cliticket.setSaldopagado(rs.getString(5));
                cliticket.setSaldodebe(rs.getString(6));
                cliticket.setSaldomoroso(rs.getString(7));
                cliticket.setFechalimitepago(rs.getString(8));
                cliticket.setMontocuota(rs.getString(9));
                cliticket.setNrocuota(rs.getString(10));
                cliticket.setImporteprestado(rs.getString(11));
                lista.add(cliticket);

            }
        } catch (Exception e) {
        }

        return lista;
    }

    public int ActualizarCuotaMalCargarga(double abonado, double saldocuota, String estado, int id) {

        String sql = "update cuota set abonado=? , saldocuota=?,estado_cuota =?  where id_cuota=?";

        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setDouble(1, abonado);
            ps.setDouble(2, saldocuota);
            ps.setString(3, estado);

            ps.setInt(4, id);

            r = ps.executeUpdate();
        } catch (Exception e) {
        }

        return r;
    }

    public int CantidadCuotas(int id) {
        String sql = "SELECT MAX(c.numero_cuota) from cuota c where c.id_prestamo=?";
        int cantidad = 0;
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            cantidad = (rs.getInt(1));

        } catch (Exception e) {
        }

        return cantidad;

    }

    public List BuscarCuotasAtradas(String desde) {
        List<ClienteTicket> lista = new ArrayList<>();
        String sql = "select  DISTINCT c.nombre , c.apellido ,c.direccion,c.telefono, s.montoacreedor , s.montodeudor , s.montomoroso , cu.fechapago ,cu.montocuota ,cu.numero_cuota,p.totalpagar from cuota cu , prestamo p , cliente c , saldocliente s where cu.id_prestamo = p.id_prestamo and p.id_cliente = c.id_cliente and c.id_cliente=s.id_cliente and cu.fechapago<=? and cu.estado_cuota=\"VENCIDA\" and s.montomoroso>0";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, desde);

            rs = ps.executeQuery();
            while (rs.next()) {
                ClienteTicket cliticket = new ClienteTicket();
                cliticket.setNombre(rs.getString(1));
                cliticket.setApellido(rs.getString(2));
                cliticket.setDireccion(rs.getString(3));
                cliticket.setTelefono(rs.getString(4));
                cliticket.setSaldopagado(rs.getString(5));
                cliticket.setSaldodebe(rs.getString(6));
                cliticket.setSaldomoroso(rs.getString(7));
                cliticket.setFechalimitepago(rs.getString(8));
                cliticket.setMontocuota(rs.getString(9));
                cliticket.setNrocuota(rs.getString(10));
                cliticket.setImporteprestado(rs.getString(11));
                lista.add(cliticket);

            }
        } catch (Exception e) {
        }

        return lista;
    }

}
