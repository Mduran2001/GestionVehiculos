/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionvehiculos.model;

/**
 *
 * @author mario
 */
public class Motor {
    private int cilindros;
    private TipoCombustible combustible;

    public Motor() {
    }

    public Motor(int cilindros, TipoCombustible combustible) {
        this.cilindros = cilindros;
        this.combustible = combustible;
    }

    public TipoCombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(TipoCombustible combustible) {
        this.combustible = combustible;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motor{");
        sb.append("cilindros=").append(cilindros);
        sb.append(", combustible=").append(combustible);
        sb.append('}');
        return sb.toString();
    }
    
    
}
