/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gestionvehiculos;

import com.mycompany.gestionvehiculos.model.*;
import com.mycompany.gestionvehiculos.view.VehiculoPickupGUI;
import javax.swing.SwingUtilities;
/**
 *
 * @author mario
 */
public class GestionVehiculos {

    public static void main(String[] args) {
        final int CANTIDAD_PUERTAS = 4;

        Motor miMotor = new Motor(4, TipoCombustible.diesel);
        Vehiculo vehiculo1 = new Vehiculo("Isuzu", "DHFK2399235239htg9h43g", miMotor);
        System.out.println(vehiculo1.toString());
        System.out.println("Vehiculos creados:" + Vehiculo.getCantidadVehiculos());
        System.out.println("--------------------------------");

        Vehiculo vehiculo2 = new Vehiculo("Hyundai", "DHFK2399235239h3b643g", miMotor);
        System.out.println(vehiculo2.toString());
        System.out.println("Vehiculos creados:" + Vehiculo.getCantidadVehiculos());
        System.out.println("--------------------------------");

        
        SwingUtilities.invokeLater(()->{
            new VehiculoPickupGUI();
        });
    }
}
