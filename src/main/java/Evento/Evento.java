package Evento;

import Personas.*;
import Archivos.*;
import java.io.*;

import java.util.ArrayList;
import java.util.Date;

public class Evento {
    private String nombreEvento;
    private Date fechaEvento;
    private String lugarEvento;
    private String[][] nroEntradas;
    private ArrayList<Artista> artistas;

    public Evento(String nombreEvento, Date fechaEvento, String lugarEvento, String[][] nroEntradas) {
        this.nombreEvento = nombreEvento;
        this.fechaEvento = fechaEvento;
        this.lugarEvento = lugarEvento;
        this.nroEntradas = nroEntradas;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public Date getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getLugarEvento() {
        return lugarEvento;
    }

    public void setLugarEvento(String lugarEvento) {
        this.lugarEvento = lugarEvento;
    }

    public String[][] getNroEntradas() {
        return nroEntradas;
    }

    public void setNroEntradas(String[][] nroEntradas) {
        this.nroEntradas = nroEntradas;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }
    public void agregarArtista(Artista artista){
        ArrayList<Artista> artistas = new ArrayList<>();
        if (!artistas.contains(artista)){
            artistas.add(artista);
        }else {System.out.println("Artista ya registrado");}

    }
    public void agregarEvento(Evento evento){
        if (gestorArchivo.leerEvento(evento) ){
            gestorArchivo.registrarEvento(evento);
        }else {System.out.println("Artista ya registrado");}
    }

    public String toString(){
        return nombreEvento + "," + fechaEvento + "," + lugarEvento;
    }
}
