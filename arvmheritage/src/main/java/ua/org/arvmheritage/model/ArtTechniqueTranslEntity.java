package ua.org.arvmheritage.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ART_TECHIQUE_TRANSL", schema = "db_arvm", catalog = "")
public class ArtTechniqueTranslEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_art_techique_transl")
    private int idArtTechniqueTransl;
    @Basic
    @Column(name = "id_art_technique")
    private int idArtTechnique;
    @Basic
    @Column(name = "id_lang")
    private short idLang;
    @Basic
    @Column(name = "art_techique")
    private String artTechique;

    public int getIdArtTechniqueTransl() {
        return idArtTechniqueTransl;
    }

    public void setIdArtTechniqueTransl(int idArtTechniqueTransl) {
        this.idArtTechniqueTransl = idArtTechniqueTransl;
    }

    public int getIdArtTechnique() {
        return idArtTechnique;
    }

    public void setIdArtTechnique(int idArtTechnique) {
        this.idArtTechnique = idArtTechnique;
    }

    public short getIdLang() {
        return idLang;
    }

    public void setIdLang(short idLang) {
        this.idLang = idLang;
    }

    public String getArtTechique() {
        return artTechique;
    }

    public void setArtTechique(String artTechique) {
        this.artTechique = artTechique;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArtTechniqueTranslEntity that = (ArtTechniqueTranslEntity) o;
        return idArtTechniqueTransl == that.idArtTechniqueTransl && idArtTechnique == that.idArtTechnique && idLang == that.idLang && Objects.equals(artTechique, that.artTechique);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idArtTechniqueTransl, idArtTechnique, idLang, artTechique);
    }
}
