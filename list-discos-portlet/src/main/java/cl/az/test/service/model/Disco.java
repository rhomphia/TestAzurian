package cl.az.test.service.model;

import java.util.Date;

public class Disco {
    private long discoId;

    private String nombre;

    private String autor;

    private Date fechaLanzamiento;

    private int ranking;

    private boolean flagActivo;

    public Disco() {

    }

    public Disco(int discoId, String nombre, String autor, Date fechaLanzamiento, int ranking, boolean flagActivo) {
        this.setDiscoId(discoId);
        this.setNombre(nombre);
        this.setAutor(autor);
        this.setFechaLanzamiento(fechaLanzamiento);
        this.setRanking(ranking);
        this.setFlagActivo(flagActivo);
    }


    public long getDiscoId() {
        return discoId;
    }

    public void setDiscoId(long discoId) {
        this.discoId = discoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public boolean getFlagActivo() {
        return flagActivo;
    }

    public void setFlagActivo(boolean flagActivo) {
        this.flagActivo = flagActivo;
    }
}