/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author santi
 */
public class Prestamo {

    int id_prestamo;
    int id_cliente;
    Date fecha_inicio;
    double totalpagar;
   

  
    double montoprestado;
    double intereses;
    int cantidadcuotas;
    String estado;
    String formapago;

   

    public Prestamo() {
    }

    public Prestamo(int id_prestamo, int id_cliente, Date fecha_inicio, double totalpagar, double montoprestado, double intereses, int cantidadcuotas, String estado , String formapago ) {
        this.id_prestamo = id_prestamo;
        this.id_cliente = id_cliente;
        this.fecha_inicio = fecha_inicio;
        this.totalpagar = totalpagar;
        this.montoprestado = montoprestado;
        this.intereses = intereses;
        this.cantidadcuotas = cantidadcuotas;
        this.estado = estado;
        this.formapago = formapago;
        
    }

    public int getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(int id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Double getTotalpagar() {
        return totalpagar;
    }

    public void setTotalpagar(double totalpagar) {
        this.totalpagar = totalpagar;
    }

    public double getMontoprestado() {
        return montoprestado;
    }

    public void setMontoprestado(double montoprestado) {
        this.montoprestado = montoprestado;
    }

    public double getIntereses() {
        return intereses;
    }

    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }

    public int getCantidadcuotas() {
        return cantidadcuotas;
    }

    public void setCantidadcuotas(int cantidadcuotas) {
        this.cantidadcuotas = cantidadcuotas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
     public String getFormapago() {
        return formapago;
    }

    public void setFormapago(String formapago) {
        this.formapago = formapago;
    }
    
  
    
    
}
