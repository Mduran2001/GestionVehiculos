/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionvehiculos.view;

import javax.swing.JFrame;
import com.mycompany.gestionvehiculos.model.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EmptyBorder;


/**
 *
 * @author mario
 */
public class VehiculoPickupGUI extends JFrame {
    public static final long serialVersionUID = 1L; //es el codigo que se carga una unica vez en la memoria y se se puede utilizar en todas las instancias de vehiculo 
    //Estos colores se buscan en internet como RGB de Java Swing 
    private static final Color COLOR_FONDO = new Color (245,247,250);
    private static final Color COLOR_CABECERA = new Color (33,37,41);
    private static final Color COLOR_PANEL =  Color.WHITE;
    
    public List<VehiculoPickup> listaPickups = new ArrayList<>();
    public int indSeleccionado =-1;
    
    //Componentes para tomar datos de Motor
    public JTextField txtCilindros;
    public JComboBox<TipoCombustible> cmbTipoCombustible;
    
    //Componentes de Vehiculo
    public JTextField txtMarca, txtnumeroChasis, txttraccion, txtcantPuertas, txtcantAsientos, txtmodelo, txtanioFabricacion;
    public JColorChooser jcColor;// este permite escoger un color
    
    //Componentes de pickup
    public JRadioButton jrDoble;
    public JTextField txtcapacidadCarga, txtalturaCajon, txtlongitudCajon, txttipoCabina, txttipoCajon;
    
    public DefaultTableModel ModeloPickup;
    public JTable TablaPickup;
    
    public JButton btnGuardar, btnActualizar, btnEliminar;
    
    public VehiculoPickupGUI(){
        super("Registro Pickup");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().setBackground(COLOR_FONDO);
        setMinimumSize(new Dimension(1120,760));
        
        add(crearPanelCabecera(), BorderLayout.NORTH);
        
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    private JPanel crearPanelCabecera(){
        JPanel panel = new JPanel(new BorderLayout(8,4));
        panel.setBackground(COLOR_CABECERA);
        panel.setBorder(new EmptyBorder(14,20,14,20));
        
        JLabel lblTitulo = new JLabel("Registro de Pickup");
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        
        JLabel lblSubTitulo = new JLabel("Registre, edite y elimine pickups desde una sola pantalla");
        lblSubTitulo.setForeground(Color.WHITE);
        lblSubTitulo.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,14));
        
        panel.add(lblTitulo, BorderLayout.NORTH);
        panel.add(lblSubTitulo, BorderLayout.SOUTH);
        return panel;
        
    }
}
