package com.example.ProyectoDBD9.models;

public class Compra {
    private int id_compra;
    private int subtotal;
    private String metodo_pago;
    private int id_carro;

    //Constructores
    public Compra() {}
    public Compra(int id_compra, int subtotal, String metodo_pago, int id_carro) {
        this.id_compra = id_compra;
        this.subtotal = subtotal;
        this.metodo_pago = metodo_pago;
        this.id_carro = id_carro;
    }

    //Getters and Setters

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public int getId_carro() {
        return id_carro;
    }

    public void setId_carro(int id_carro) {
        this.id_carro = id_carro;
    }
}
