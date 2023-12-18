package Personas;

public class Asistente {
    private String nombreAsistente;
    private String emailAsistente;
    private String fonoAsistente;
    private String gnroPreferido;

    public Asistente(String nombreAsistente, String emailAsistente, String fonoAsistente, String gnroPreferido) {
        this.nombreAsistente = nombreAsistente;
        this.emailAsistente = emailAsistente;
        this.fonoAsistente = fonoAsistente;
        this.gnroPreferido = gnroPreferido;
    }

    public String getNombreAsistente() {
        return nombreAsistente;
    }

    public void setNombreAsistente(String nombreAsistente) {
        this.nombreAsistente = nombreAsistente;
    }

    public String getEmailAsistente() {
        return emailAsistente;
    }

    public void setEmailAsistente(String emailAsistente) {
        this.emailAsistente = emailAsistente;
    }

    public String getFonoAsistente() {
        return fonoAsistente;
    }

    public void setFonoAsistente(String fonoAsistente) {
        this.fonoAsistente = fonoAsistente;
    }

    public String getGnroPreferido() {
        return gnroPreferido;
    }

    public void setGnroPreferido(String gnroPreferido) {
        this.gnroPreferido = gnroPreferido;
    }

}
