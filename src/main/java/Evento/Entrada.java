package Evento;

import Archivos.gestorArchivo;
import Personas.Asistente;

import java.util.ArrayList;

public class Entrada {
    private double precioEntrada;
    private String tipoEntrada;
    private String eventoEntrada;
    private ArrayList<Asistente> asistentes;

    public Entrada(double precioEntrada, String tipoEntrada, String eventoEntrada) {
        this.precioEntrada = precioEntrada;
        this.tipoEntrada = tipoEntrada;
        this.eventoEntrada = eventoEntrada;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getEventoEntrada() {
        return eventoEntrada;
    }

    public void setEventoEntrada(String eventoEntrada) {
        this.eventoEntrada = eventoEntrada;
    }

    public ArrayList<Asistente> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(ArrayList<Asistente> asistentes) {
        this.asistentes = asistentes;
    }
    public void agregarAsistente(Asistente asistente){
        ArrayList<Asistente> asistentes = new ArrayList<>();
        if (!asistentes.contains(asistente) ){
            asistentes.add(asistente);
        }else {System.out.println("Asistente ya registrado");}
    }
    public void agregarEventoEntrada(Entrada entrada){
        ArrayList<Asistente> entradas = new ArrayList<>();
        if (!entradas.contains(entrada) ){
            entradas.add(entrada);
        }else {System.out.println("Entrada ya registrado");}
    }
}
