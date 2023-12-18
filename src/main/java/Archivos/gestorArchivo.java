package Archivos;
import Evento.*;
import Personas.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;


public class gestorArchivo {

    public static void leerEvento(Evento evento) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("Eventos.txt"))) {
            String textoArchivo;
            while ((textoArchivo = br.readLine()) != null) {
                String[] data = textoArchivo.split(",");
                evento.getArtistas().add(new Artista(data[0], data[1]));
            }
        } catch (IOException e) {
            throw new IOException("Error al leer el archivo", e);
        }
    }

    public static boolean registrarEvento(Evento evento) {
        String direccionArchivo = "Eventos.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(direccionArchivo, true))) {
            if (new File(direccionArchivo).exists()) {
                bw.newLine();
            }
            bw.write(evento.toString());
            return true;
        } catch (IOException e) {
            System.out.println("Error al ingresar nuevo Evento");
            return false;
        }
    }
    public static boolean registrarArtista(Artista artista) {
        String direccionArchivo = "Artistas.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(direccionArchivo, true))) {
            if (new File(direccionArchivo).exists()) {
                bw.newLine();
            }
            bw.write(artista.toString());
            return true;
        } catch (IOException e) {
            System.out.println("Error al ingresar nuevo Artista");
            return false;
        }
    }




}