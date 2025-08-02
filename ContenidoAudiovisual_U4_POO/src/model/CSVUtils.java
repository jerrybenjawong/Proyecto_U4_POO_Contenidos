package model;

import java.io.*;
import java.util.*;

public class CSVUtils {

    public static List<ContenidoAudiovisual> leerContenido(String path) throws IOException {
        List<ContenidoAudiovisual> lista = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(path));
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(",");
            switch (datos[0]) {
                case "Pelicula":
                    lista.add(new Pelicula(datos[1], Integer.parseInt(datos[2]), datos[3], datos[4]));
                    break;
                case "Documental":
                    lista.add(new Documental(datos[1], Integer.parseInt(datos[2]), datos[3], datos[4]));
                    break;
                case "SerieTV":
                    lista.add(new SerieTV(datos[1], Integer.parseInt(datos[2]), datos[3], Integer.parseInt(datos[4])));
                    break;
                case "Novela":
                    lista.add(new Novela(datos[1], Integer.parseInt(datos[2]), datos[3], datos[4]));
                    break;
            }
        }
        br.close();
        return lista;
    }

    public static void guardarContenido(String path, List<ContenidoAudiovisual> lista) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        for (ContenidoAudiovisual c : lista) {
            bw.write(c.toCSV());
            bw.newLine();
        }
        bw.close();
    }
}