/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDao;

import Modelo.CRUD;
import Modelo.Cliente;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao implements CRUD {

    PreparedStatement ps;
    ResultSet rs;
    Cliente cli = new Cliente();
    Conexion acceso = new Conexion();
    Connection con;

    public Cliente BuscarCliente(String dni) {
        Cliente c = new Cliente();
        String sql = "Select * from cliente where dni=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            rs = ps.executeQuery();
            while (rs.next()) {
                c.setId(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setDireccion(rs.getString(4));
                c.setDni(rs.getString(5));
                c.setEmail(rs.getString(6));
                c.setTelefono(rs.getString(7));

            }
        } catch (Exception e) {

        }

        return c;
    }
    
    public Cliente BuscarClientePorId(int id) {
        Cliente c = new Cliente();
        String sql = "Select * from cliente where id_cliente=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                c.setId(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setDireccion(rs.getString(4));
                c.setDni(rs.getString(5));
                c.setEmail(rs.getString(6));
                c.setTelefono(rs.getString(7));

            }
        } catch (Exception e) {

        }

        return c;
    }

    public String IdCliente() {
        String sql = "select max(id_cliente) from cliente";
        String id = "";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                id = Integer.toString(rs.getInt(1));

            }
        } catch (Exception e) {
        }

        return id;
    }

    public int GuardarCliente(Cliente cliente) {
        String sql = "insert into cliente(nombre , apellido ,direccion,dni , email , telefono)"
                + "values(?,?,?,?,?,?)";
        int r = 0;
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);

            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setString(3, cliente.getDireccion());
            ps.setString(4, cliente.getDni());
            ps.setString(5, cliente.getEmail());
            ps.setString(6, cliente.getTelefono());
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("Error al Guardar el cliente:" + e);
        }

        return r;

    }

    @Override
    public List Listar() {
        List<Cliente> lista = new ArrayList<>();
        String sql = "Select * from cliente";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setDireccion(rs.getString(4));
                c.setDni(rs.getString(5));
                c.setEmail(rs.getString(6));
                c.setTelefono(rs.getString(7));
                lista.add(c);
            }
        } catch (Exception e) {

        }

        return lista;
    }

}
