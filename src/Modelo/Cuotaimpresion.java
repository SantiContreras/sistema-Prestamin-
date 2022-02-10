/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author santi
 */
public class Cuotaimpresion {
    String nroprestamo;
    String monto;
    String nrocuota;
    String fechainicioprestamo;

    public Cuotaimpresion() {
    }

    public Cuotaimpresion(String nroprestamo, String monto, String nrocuota, String fechainicioprestamo) {
        this.nroprestamo = nroprestamo;
        this.monto = monto;
        this.nrocuota = nrocuota;
        this.fechainicioprestamo = fechainicioprestamo;
    }

    public String getNroprestamo() {
        return nroprestamo;
    }

    public void setNroprestamo(String nroprestamo) {
        this.nroprestamo = nroprestamo;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getNrocuota() {
        return nrocuota;
    }

    public void setNrocuota(String nrocuota) {
        this.nrocuota = nrocuota;
    }

    public String getFechainicioprestamo() {
        return fechainicioprestamo;
    }

    public void setFechainicioprestamo(String fechainicioprestamo) {
        this.fechainicioprestamo = fechainicioprestamo;
    }
    
    
    
}
