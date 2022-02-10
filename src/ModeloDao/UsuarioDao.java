/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDao;

import Modelo.Conexion;
import Modelo.EntidadUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



/**
 *
 * @author santi
 */
public class UsuarioDao {
    
    PreparedStatement ps;
    ResultSet rs;    
    EntidadUsuario usuario = new EntidadUsuario();
    Conexion acceso=new Conexion();
    Connection con;
    
    public EntidadUsuario ValidarUsuario( String nombre,String contrase){
        
        String sql = " select * from usuario where nombre=? and contrase=?";
        try {
            con = acceso.Conectar();
            ps=con.prepareStatement(sql );
            ps.setString(1, nombre);
            ps.setString(2, contrase);
            rs = ps.executeQuery();
            while (rs.next()) {
               usuario.setId(rs.getInt(1));
               usuario.setNombre(rs.getString(3));
               usuario.setDni(rs.getString(2));
               usuario.setContrase(rs.getString(5));
               usuario.setApellido(rs.getString(4));
            }
        } catch (Exception e) {
        }
    
        return usuario;
    }
    
    
    
}
