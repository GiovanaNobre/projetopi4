package com.example.aluguel.alugueclasse;

public class Carro {

    String modelo;
    String marca;
    String telefone;

    public Carro(String marca, String telefone, String modelo) {
        this.marca = marca;
        this.telefone = telefone;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
