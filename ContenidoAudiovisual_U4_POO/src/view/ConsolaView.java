package view;

import controller.ContenidoController;
import model.*;

import java.util.Scanner;

public class ConsolaView {
    private final ContenidoController controller;
    private final Scanner scanner;

    public ConsolaView(ContenidoController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            System.out.println("=== MENÚ ===");
            System.out.println("1. Cargar contenidos desde archivo");
            System.out.println("2. Mostrar contenidos");
            System.out.println("3. Agregar contenido");
            System.out.println("4. Guardar contenidos en archivo");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> cargar();
                case 2 -> mostrar();
                case 3 -> agregarContenido();
                case 4 -> guardar();
                case 0 -> salir = true;
                default -> System.out.println("Opción inválida.");
            }
        }
    }

    private void cargar() {
        System.out.print("Ruta del archivo CSV: ");
        String ruta = scanner.nextLine();
        controller.cargarDesdeArchivo(ruta);
        System.out.println("Contenidos cargados.");
    }

    private void guardar() {
        System.out.print("Ruta para guardar CSV: ");
        String ruta = scanner.nextLine();
        controller.guardarEnArchivo(ruta);
        System.out.println("Contenidos guardados.");
    }

    private void mostrar() {
        var lista = controller.getContenidos();
        if (lista == null || lista.isEmpty()) {
            System.out.println("No hay contenidos para mostrar.");
            return;
        }
        for (ContenidoAudiovisual c : lista) {
            System.out.println(c.toCSV());
        }
    }

    private void agregarContenido() {
        System.out.println("¿Qué tipo de contenido deseas agregar?");
        System.out.println("1. Película");
        System.out.println("2. Documental");
        System.out.println("3. Serie de TV");
        System.out.println("4. Novela");
        System.out.print("Opción: ");
        int opcion = Integer.parseInt(scanner.nextLine());

        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Año: ");
        int anio = Integer.parseInt(scanner.nextLine());
        System.out.print("Género: ");
        String genero = scanner.nextLine();

        switch (opcion) {
            case 1 -> {
                System.out.print("Director: ");
                String director = scanner.nextLine();
                Pelicula pelicula = new Pelicula(titulo, anio, genero, director);
                controller.agregarContenido(pelicula);
                System.out.println("Película agregada.");
            }
            case 2 -> {
                System.out.print("Tema: ");
                String tema = scanner.nextLine();
                Documental doc = new Documental(titulo, anio, genero, tema);
                controller.agregarContenido(doc);
                System.out.println("Documental agregado.");
            }
            case 3 -> {
                System.out.print("Número de temporadas: ");
                int temporadas = Integer.parseInt(scanner.nextLine());
                SerieTV serie = new SerieTV(titulo, anio, genero, temporadas);
                controller.agregarContenido(serie);
                System.out.println("Serie de TV agregada.");
            }
            case 4 -> {
                System.out.print("Autor: ");
                String autor = scanner.nextLine();
                Novela novela = new Novela(titulo, anio, genero, autor);
                controller.agregarContenido(novela);
                System.out.println("Novela agregada.");
            }
            default -> System.out.println("Opción inválida.");
        }
    }
}
