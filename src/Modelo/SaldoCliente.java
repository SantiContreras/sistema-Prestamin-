/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author santi
 */
public class SaldoCliente {
    int idcliente;
    
    double salgodeudor;
    double saldoacreedor;
    double saldomoroso;

    public SaldoCliente() {
    }

    public SaldoCliente(int idcliente,  double salgodeudor, double saldoacreedor, double saldomoroso) {
        this.idcliente = idcliente;
       
        this.salgodeudor = salgodeudor;
        this.saldoacreedor = saldoacreedor;
        this.saldomoroso = saldomoroso;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

  

   

    public double getSalgodeudor() {
        return salgodeudor;
    }

    public void setSalgodeudor(double salgodeudor) {
        this.salgodeudor = salgodeudor;
    }

    public double getSaldoacreedor() {
        return saldoacreedor;
    }

    public void setSaldoacreedor(double saldoacreedor) {
        this.saldoacreedor = saldoacreedor;
    }

    public double getSaldomoroso() {
        return saldomoroso;
    }

    public void setSaldomoroso(double saldomoroso) {
        this.saldomoroso = saldomoroso;
    }
    
}
