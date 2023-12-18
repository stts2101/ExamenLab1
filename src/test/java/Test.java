import Archivos.*;
import Personas.*;
import Evento.*;

import java.util.ArrayList;
import java.util.Date;
import java.io.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Test {
    public static void main(String[] args) throws IOException {
        String[][] nroEntrada = new String[3][110];
        Date d1 = new Date(23, 8, 21);
        Evento e1 = new Evento("u2", d1, "temuco", nroEntrada);
        Artista a1 = new Artista("bon","rock");
        ArrayList<Artista> artistas = new ArrayList<>();
        e1.setArtistas(artistas);
         // gestorArchivo.registrarEvento(e1)

        // gestorArchivo.leerEvento(e1);
    }
}
