import Archivos.*;
import Personas.*;
import Evento.*;
import java.util.Date;
public class Test {
    public static void main(String[] args){
        String[][] nroEntrada = new String[3][110];
        Date d1 = new Date(23,8,21);
        Evento e1 = new Evento("u2", d1,"temuco",nroEntrada);

         gestorArchivo.registrarEvento(e1);
    }
}
