package cl.az.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "az_Disco")
public class Disco{

    @Id
    @Column(name = "discoId")
    private long discoId;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "autor")
    private String autor;

    @Column(name = "fechaLanzamiento")
    private Date fechaLanzamiento;

    @Column(name = "ranking")
    private int ranking;

    @Column(name = "flagActivo")
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