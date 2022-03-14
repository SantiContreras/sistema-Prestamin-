/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/prestamin4";
    String user="santi";
    String pass="12345";
    //String url="jdbc:mysql://mysql-70975-0.cloudclusters.net:17927/Pruebas";
    //String user="admin";
    //String pass="dYhylNbY";
    //String url="jdbc:mysql://mysql-70989-0.cloudclusters.net:19079/Pruebas";
    //String user="admin";
    //String pass="C4wjtfuv";
    public Connection Conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
            System.out.println("Conexion exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error al Conectar a BD:"+e);
        }      
        return con;
        
    }
}