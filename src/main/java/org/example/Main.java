package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import controlador.Clientecontroller;
import vista.Vista;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void main() {
        Vista v = new Vista();
        Clientecontroller c = new Clientecontroller(v);
        v.setVisible(true);
        v.setLocationRelativeTo(null);

    }
}
