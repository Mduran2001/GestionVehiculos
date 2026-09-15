/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionvehiculos.model;

import java.awt.Color;


/**
 *
 * @author mario
 */
public class Vehiculo {

    private String marca;
    private String numerChasis;
    private Motor motor;
    private String traccion;
    private int cantPuertas;
    private int cantAsientos;
    private Color color;
    private String modelo;
    private int anioFabricacion;
    private static int cantidadVehiculos = 0;

    public Vehiculo(String marca, String numerChasis, Motor motor, String traccion, int cnatPuertas, int cantAsientos, Color color, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.numerChasis = numerChasis;
        this.motor = motor;
        this.traccion = traccion;
        this.cantPuertas = cnatPuertas;
        this.cantAsientos = cantAsientos;
        this.color = color;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;

        cantidadVehiculos++;
    }

    public Vehiculo(String marca, String numerChasis, Motor motor) {
        this.marca = marca;
        this.numerChasis = numerChasis;
        this.motor = motor;
        cantidadVehiculos++;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumerChasis() {
        return numerChasis;
    }

    public void setNumerChasis(String numerChasis) {
        this.numerChasis = numerChasis;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public static int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public static void setCantidadVehiculos(int aCantidadVehiculos) {
        cantidadVehiculos = aCantidadVehiculos;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public int getCnatPuertas() {
        return cantPuertas;
    }

    public void setCnatPuertas(int cnatPuertas) {
        this.cantPuertas = cnatPuertas;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append("marca=").append(marca);
        sb.append(", numerChasis=").append(numerChasis);
        sb.append(", motor=").append(motor);
        sb.append(", traccion=").append(traccion);
        sb.append(", cnatPuertas=").append(cantPuertas);
        sb.append(", cantAsientos=").append(cantAsientos);
        sb.append(", color=").append(color);
        sb.append(", modelo=").append(modelo);
        sb.append(", anioFabricacion=").append(anioFabricacion);
        sb.append('}');
        return sb.toString();
    }

}
