package ua.org.arvmheritage.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "MUSEUM_TRANSL", schema = "db_arvm", catalog = "")
public class MuseumTranslEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_museum_transl")
    private int idMuseumTransl;
    @Basic
    @Column(name = "museum_id")
    private int museumId;
    @Basic
    @Column(name = "lang_id")
    private short langId;
    @Basic
    @Column(name = "name_museum")
    private String nameMuseum;

    public int getIdMuseumTransl() {
        return idMuseumTransl;
    }

    public void setIdMuseumTransl(int idMuseumTransl) {
        this.idMuseumTransl = idMuseumTransl;
    }

    public int getMuseumId() {
        return museumId;
    }

    public void setMuseumId(int museumId) {
        this.museumId = museumId;
    }

    public short getLangId() {
        return langId;
    }

    public void setLangId(short langId) {
        this.langId = langId;
    }

    public String getNameMuseum() {
        return nameMuseum;
    }

    public void setNameMuseum(String nameMuseum) {
        this.nameMuseum = nameMuseum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MuseumTranslEntity that = (MuseumTranslEntity) o;
        return idMuseumTransl == that.idMuseumTransl && museumId == that.museumId && langId == that.langId && Objects.equals(nameMuseum, that.nameMuseum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMuseumTransl, museumId, langId, nameMuseum);
    }
}
