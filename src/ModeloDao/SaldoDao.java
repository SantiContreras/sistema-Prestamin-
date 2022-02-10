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
    
    public double CalcularSaldoDeudor( double cantidadprestada , double cantidadacreditada) {
       double saldodeudor = 0;
       
       saldodeudor = cantidadprestada - cantidadacreditada;
       
       
       return saldodeudor;
    }
    
    public double CalcularSalgoAcreedor( double montopago) {
       double saldoacreedor = 0 ;
       
       saldoacreedor = saldoacreedor + montopago;
       
       return saldoacreedor;
    }
    
    public int ActualizarSaldo( double saldodeu , double saldoacre ,int id) {
          String sql ="update saldocliente set montodeudor=? , montoacreedor=? where id_cliente=?";
        
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
           
            ps.setDouble(1, saldodeu );
             ps.setDouble(2, saldoacre );
            ps.setInt(3, id);
           
            
            
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
            while(rs.next()) {
              
              saldocli.setSaldoacreedor(rs.getDouble(2));
              saldocli.setSalgodeudor(rs.getDouble(1));
            }
        } catch (Exception e) {
        }
        
        return saldocli;
    }
    
    
}
