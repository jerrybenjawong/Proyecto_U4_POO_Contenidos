package model;

public class Investigador {
    private String nombre;
    private String campo;

    public Investigador(String nombre, String campo) {
        this.nombre = nombre;
        this.campo = campo;
    }

    public String getNombre() { return nombre; }
    public String getCampo() { return campo; }

    public String toCSV() {
        return "Investigador," + nombre + "," + campo;
    }
}