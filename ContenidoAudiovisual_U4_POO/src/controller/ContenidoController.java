package controller;

import model.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ContenidoController {
    private List<ContenidoAudiovisual> contenidos;

    // ✅ Constructor que inicializa la lista
    public ContenidoController() {
        this.contenidos = new ArrayList<>();
    }

    public void cargarDesdeArchivo(String ruta) {
        try {
            contenidos = CSVUtils.leerContenido(ruta);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public void guardarEnArchivo(String ruta) {
        try {
            CSVUtils.guardarContenido(ruta, contenidos);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public void agregarContenido(ContenidoAudiovisual contenido) {
        contenidos.add(contenido);
    }

    public List<ContenidoAudiovisual> getContenidos() {
        return contenidos;
    }
}