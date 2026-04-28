package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import controlador.Clientecontroller;
import modelo.Cliente;
import vista.Vista;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void main() {
        Vista v = new Vista();
        Cliente modelo = new Cliente();
        
        Clientecontroller c = new Clientecontroller(v, modelo);
        v.setVisible(true);
        v.setLocationRelativeTo(null);

    }
}
