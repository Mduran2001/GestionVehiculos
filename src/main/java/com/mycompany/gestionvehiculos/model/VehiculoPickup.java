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
public class VehiculoPickup extends Vehiculo {
    private boolean tieneDoble;
    private int capacidadCarga;
    private Double alturaCajon;
    private Double longitudCajon;
    private String tipoCabina;
    private String tipoCajon;
//Super sin nada es el constructor de la clase, pero aca vemos que este constructor
    //es el constructor con el papa
    public VehiculoPickup(String marca, String numerChasis, Motor motor) {
        super(marca, numerChasis, motor);
    }

    public VehiculoPickup(boolean tieneDoble, int capacidadCarga, Double alturaCajon, Double longitudCajon, String tipoCabina, String tipoCajon, String marca, String numerChasis, Motor motor, String traccion, int cnatPuertas, int cantAsientos, Color color, String modelo, int anioFabricacion) {
        super(marca, numerChasis, motor, traccion, cnatPuertas, cantAsientos, color, modelo, anioFabricacion);
        this.tieneDoble = tieneDoble;
        this.capacidadCarga = capacidadCarga;
        this.alturaCajon = alturaCajon;
        this.longitudCajon = longitudCajon;
        this.tipoCabina = tipoCabina;
        this.tipoCajon = tipoCajon;
    }

    public String getTipoCajon() {
        return tipoCajon;
    }

    public void setTipoCajon(String tipoCajon) {
        this.tipoCajon = tipoCajon;
    }

    public boolean isTieneDoble() {
        return tieneDoble;
    }

    public void setTieneDoble(boolean tieneDoble) {
        this.tieneDoble = tieneDoble;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public Double getAlturaCajon() {
        return alturaCajon;
    }

    public void setAlturaCajon(Double alturaCajon) {
        this.alturaCajon = alturaCajon;
    }

    public Double getLongitudCajon() {
        return longitudCajon;
    }

    public void setLongitudCajon(Double longitudCajon) {
        this.longitudCajon = longitudCajon;
    }

    public String getTipoCabina() {
        return tipoCabina;
    }

    public void setTipoCabina(String tipoCabina) {
        this.tipoCabina = tipoCabina;
    }
    
    
}
