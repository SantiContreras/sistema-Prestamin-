/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDao;

import Modelo.Cliente;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author santi
 */
public class GananciaDao {

    PreparedStatement ps;
    ResultSet rs;
    Cliente cli = new Cliente();
    Conexion acceso = new Conexion();
    Connection con;
    public int r = 0;
    
    public double GananciaPorPrestamo(Double prestado , Double devolvido) {
     double total = 0;
     
     total = devolvido - prestado;
     
     return total;
    
    }

}
