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
public class VehiculoSUV extends Vehiculo {
    private boolean tieneDoble;
    private Double capacidadTanque;

    public VehiculoSUV(boolean tieneDoble, Double capacidadTanque, String marca, String numerChasis, Motor motor, String traccion, int cnatPuertas, int cantAsientos, Color color, String modelo, int anioFabricacion) {
        super(marca, numerChasis, motor, traccion, cnatPuertas, cantAsientos, color, modelo, anioFabricacion);
        this.tieneDoble = tieneDoble;
        this.capacidadTanque = capacidadTanque;
    }

   
      
    }
    
    

