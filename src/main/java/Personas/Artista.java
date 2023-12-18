package Personas;

public class Artista {
    private String nombreArtista;
    private String gnroMusical;

    public Artista(String nombreArtista, String gnroMusical) {
        this.nombreArtista = nombreArtista;
        this.gnroMusical = gnroMusical;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public String getGnroMusical() {
        return gnroMusical;
    }

    public void setGnroMusical(String gnroMusical) {
        this.gnroMusical = gnroMusical;
    }

    @Override
    public String toString() {
        return  nombreArtista +
                "," + gnroMusical;

    }
}
