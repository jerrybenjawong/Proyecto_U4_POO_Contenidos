package main;

import controller.ContenidoController;
import view.ConsolaView;

public class Main {
    public static void main(String[] args) {
        ContenidoController controller = new ContenidoController();
        ConsolaView vista = new ConsolaView(controller);
        vista.iniciar();
    }
}