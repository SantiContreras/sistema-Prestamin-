/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDao;

import Modelo.Cliente;
import Modelo.Conexion;
import Modelo.Cuota;
import Modelo.SaldoCliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author santi
 */
public class SaldoDao {

    PreparedStatement ps;
    ResultSet rs;
    Cliente cli = new Cliente();
    Cuota cuota = new Cuota();
    Conexion acceso = new Conexion();
    Connection con;
    int r = 0;
    SaldoCliente saldocli = new SaldoCliente();

    public double CalcularSaldoDeudor(double cantidadprestada, double cantidadacreditada) {
        double saldodeudor = 0;

        saldodeudor = cantidadprestada - cantidadacreditada;

        return saldodeudor;
    }

    public double CalcularSalgoAcreedor(double montopago, double saldoacre) {
        double saldoacreedor = 0;

        saldoacreedor = saldoacre + montopago;

        return saldoacreedor;
    }

    public double CalcularAtraso(double montocuo, double abonocli , double sm) {
        double atraso = 0;
        if (abonocli == montocuo) {
            atraso = sm;
        } 
        if(abonocli > montocuo) {
          if(sm > 0) {
             double actual = abonocli - montocuo;
             atraso = sm - actual ;
          } 
          
          if(sm <= 0){
            atraso = montocuo - abonocli ;
            atraso = atraso + sm;
        }
        } else {
           double actual = montocuo - abonocli ;
           atraso = actual + sm;
        }
        

        return atraso;
    }

    public int ActualizarSaldo(double saldodeu, double saldoacre, double saldomo, int id) {
        String sql = "update saldocliente set montodeudor=? , montoacreedor=? ,montomoroso=? where id_cliente=?";

        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);

            ps.setDouble(1, saldodeu);
            ps.setDouble(2, saldoacre);
            ps.setDouble(3, saldomo);
            ps.setInt(4, id);

            r = ps.executeUpdate();
        } catch (Exception e) {
        }

        return r;
    }

    public SaldoCliente BuscarSaldo(int id) {
        String sql = " SELECT montodeudor , montoacreedor , montomoroso from saldocliente  where id_cliente= ?";
        SaldoCliente saldocli = new SaldoCliente();
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {

                saldocli.setSaldoacreedor(rs.getDouble(2));
                saldocli.setSalgodeudor(rs.getDouble(1));
                saldocli.setSaldomoroso(rs.getDouble(3));
            }
        } catch (Exception e) {
        }

        return saldocli;
    }
    
    public int InsertarSaldoCliente(SaldoCliente saldocli){
        String sql = "INSERT INTO saldocliente (id_cliente,  montodeudor, montoacreedor, montomoroso) VALUES (?,  ?, ?, ?)";
        
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);

            ps.setInt(1, saldocli.getIdcliente());
      
            ps.setDouble(3 ,saldocli.getSaldoacreedor());
            ps.setDouble(2, saldocli.getSalgodeudor());
            ps.setDouble(4, saldocli.getSaldomoroso());
           
            r = ps.executeUpdate();

        } catch (Exception e) {
            System.err.println("Error al Guardar la el saldo del cliente:" + e);
        }
        
        return r;
    }

}
