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
public class VehiculoSedan extends Vehiculo {
    private String tipoConducion;//si es derportivo combencional
    private Double capacidadTanque;

    public VehiculoSedan(String tipoConducion, double capacidadTanque, String marca, String numerChasis, Motor motor, String traccion, int cnatPuertas, int cantAsientos, Color color, String modelo, int anioFabricacion) {
        super(marca, numerChasis, motor, traccion, cnatPuertas, cantAsientos, color, modelo, anioFabricacion);
        this.tipoConducion = tipoConducion;
        this.capacidadTanque = capacidadTanque;
    }
    
}
