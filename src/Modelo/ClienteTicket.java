/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author santi
 */
public class ClienteTicket {
    String importeprestado;
    String nombre;
    String apellido;
    String telefono;
    String direccion;

    
    String saldopagado;
    String saldodebe;
    String saldomoroso;
    String total;
    String montocuota;
    String fechalimitepago;
    String nrocuota;

    public ClienteTicket() {
    }

    public String getImporteprestado() {
        return importeprestado;
    }

    public void setImporteprestado(String importeprestado) {
        this.importeprestado = importeprestado;
    }
    

    public ClienteTicket(String nombre, String apellido, String telefono, String saldopagado, String saldodebe, String saldomoroso, String total, String montocuota, String fechalimitepago, String nrocuota , String importeprestado,String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.saldopagado = saldopagado;
        this.saldodebe = saldodebe;
        this.saldomoroso = saldomoroso;
        this.total = total;
        this.montocuota = montocuota;
        this.fechalimitepago = fechalimitepago;
        this.nrocuota = nrocuota;
        this.importeprestado = importeprestado;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSaldopagado() {
        return saldopagado;
    }

    public void setSaldopagado(String saldopagado) {
        this.saldopagado = saldopagado;
    }

    public String getSaldodebe() {
        return saldodebe;
    }

    public void setSaldodebe(String saldodebe) {
        this.saldodebe = saldodebe;
    }

    public String getSaldomoroso() {
        return saldomoroso;
    }

    public void setSaldomoroso(String saldomoroso) {
        this.saldomoroso = saldomoroso;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getMontocuota() {
        return montocuota;
    }

    public void setMontocuota(String montocuota) {
        this.montocuota = montocuota;
    }

    public String getFechalimitepago() {
        return fechalimitepago;
    }

    public void setFechalimitepago(String fechalimitepago) {
        this.fechalimitepago = fechalimitepago;
    }

    public String getNrocuota() {
        return nrocuota;
    }

    public void setNrocuota(String nrocuota) {
        this.nrocuota = nrocuota;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
