/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;


public class Cuota {
    int idcuota;
    int idprestamo;
    double monto;
    double abonado;
    double saldocuota;
    double atraso;
    Date fechapago;
    String estadocuota;
    int numero_cuota;

    public Cuota() {
    }

    public Cuota(int idcuota, int idprestamo, double monto, Date fechapago, String estadocuota, int numero_cuota, double abonado,double saldocuota,double atraso) {
        this.idcuota = idcuota;
        this.idprestamo = idprestamo;
        this.monto = monto;
        this.fechapago = fechapago;
        this.estadocuota = estadocuota;
        this.numero_cuota = numero_cuota;
        this.abonado = abonado;
        this.saldocuota=saldocuota;
        this.atraso = atraso;
    }

    public double getSaldocuota() {
        return saldocuota;
    }

    public double getAtraso() {
        return atraso;
    }

    public void setAtraso(double atraso) {
        this.atraso = atraso;
    }
    

    public void setSaldocuota(double saldocuota) {
        this.saldocuota = saldocuota;
    }

    public double getAbonado() {
        return abonado;
    }

    public void setAbonado(double abonado) {
        this.abonado = abonado;
    }

    public int getIdcuota() {
        return idcuota;
    }

    public void setIdcuota(int idcuota) {
        this.idcuota = idcuota;
    }

    public int getIdprestamo() {
        return idprestamo;
    }

    public void setIdprestamo(int idprestamo) {
        this.idprestamo = idprestamo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFechapago() {
        return fechapago;
    }

    public void setFechapago(Date fechapago) {
        this.fechapago = fechapago;
    }

    public String getEstadocuota() {
        return estadocuota;
    }

    public void setEstadocuota(String estadocuota) {
        this.estadocuota = estadocuota;
    }

    public int getNumero_cuota() {
        return numero_cuota;
    }

    public void setNumero_cuota(int numero_cuota) {
        this.numero_cuota = numero_cuota;
    }
   
    
}
