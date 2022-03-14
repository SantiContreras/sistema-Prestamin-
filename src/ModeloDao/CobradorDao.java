/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDao;

import Modelo.Cliente;
import Modelo.ClienteTicket;
import Modelo.Conexion;
import Modelo.Cuota;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class CobradorDao {

    PreparedStatement ps;
    ResultSet rs;
    Cliente cli = new Cliente();
    Cuota cuota = new Cuota();
    Conexion acceso = new Conexion();
    Connection con;
    int r = 0;

    public Double PorcentajeCobrador(String desde, String hasta) {
        double total = 0;
        
        
        String sql = "select SUM(cu.montocuota) from cuota cu , prestamo p , cliente c , saldocliente s where cu.id_prestamo = p.id_prestamo and p.id_cliente = c.id_cliente and c.id_cliente=s.id_cliente and cu.fechapago>=?"
                + " and cu.fechapago <=? and cu.estado_cuota=\"PENDIENTE\"";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, desde);
            ps.setString(2, hasta);

            rs = ps.executeQuery();

            total = (((rs.getDouble(1))));

        } catch (Exception e) {
        }

        return total;
    }

}
