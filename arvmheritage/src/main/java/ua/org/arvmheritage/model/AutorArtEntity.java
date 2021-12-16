package ua.org.arvmheritage.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "AUTOR_ART", schema = "db_arvm", catalog = "")
public class AutorArtEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_autor_art")
    private int idAutorArt;
    @Basic
    @Column(name = "art_work_id")
    private int artWorkId;
    @Basic
    @Column(name = "autor_id")
    private int autorId;

    public int getIdAutorArt() {
        return idAutorArt;
    }

    public void setIdAutorArt(int idAutorArt) {
        this.idAutorArt = idAutorArt;
    }

    public int getArtWorkId() {
        return artWorkId;
    }

    public void setArtWorkId(int artWorkId) {
        this.artWorkId = artWorkId;
    }

    public int getAutorId() {
        return autorId;
    }

    public void setAutorId(int autorId) {
        this.autorId = autorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AutorArtEntity that = (AutorArtEntity) o;
        return idAutorArt == that.idAutorArt && artWorkId == that.artWorkId && autorId == that.autorId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAutorArt, artWorkId, autorId);
    }
}
