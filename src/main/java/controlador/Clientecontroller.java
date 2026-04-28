/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import vista.Vista;
import modelo.Cliente;

/**
 *
 * @author Camilo G
 */
public class Clientecontroller {

    private Vista vistaNombre;
    private Cliente clienteModelo;

    //constructor
    public Clientecontroller(Vista vista, Cliente Cliente) {

        vistaNombre = vista;
        clienteModelo = Cliente;

        vistaNombre.calcularBoton.addActionListener(this::calcularIMC);
    }

    // el que inicia la vista
    public void Iniciar() {
        vistaNombre.setVisible(true);
        vistaNombre.setLocationRelativeTo(null);
    }

    private void calcularIMC(ActionEvent e) {
        String nombre = vistaNombre.nombreInput.getText();
        double peso = Double.parseDouble(vistaNombre.pesoInput.getText());
        int altura = Integer.parseInt(vistaNombre.alturaInput.getText());
        
        Cliente nuevoUsuario = new Cliente(nombre, peso, altura);
        
        double resultadoIMC = nuevoUsuario.imc();
        
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\n" + "Peso: " + peso + "\n"+ "Altura: " + altura +
                "\n"+ "-------------------------------" +"\n" + "IMC: " + resultadoIMC + "\n" );
       

    }
}
