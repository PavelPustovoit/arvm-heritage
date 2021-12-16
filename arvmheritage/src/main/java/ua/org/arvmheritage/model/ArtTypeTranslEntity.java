package ua.org.arvmheritage.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ART_TYPE_TRANSL", schema = "db_arvm", catalog = "")
public class ArtTypeTranslEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_art_type_transl")
    private int idArtTypeTransl;
    @Basic
    @Column(name = "worktype_id")
    private int worktypeId;
    @Basic
    @Column(name = "lang_id")
    private short langId;
    @Basic
    @Column(name = "art_type")
    private String artType;

    public int getIdArtTypeTransl() {
        return idArtTypeTransl;
    }

    public void setIdArtTypeTransl(int idArtTypeTransl) {
        this.idArtTypeTransl = idArtTypeTransl;
    }

    public int getWorktypeId() {
        return worktypeId;
    }

    public void setWorktypeId(int worktypeId) {
        this.worktypeId = worktypeId;
    }

    public short getLangId() {
        return langId;
    }

    public void setLangId(short langId) {
        this.langId = langId;
    }

    public String getArtType() {
        return artType;
    }

    public void setArtType(String artType) {
        this.artType = artType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArtTypeTranslEntity that = (ArtTypeTranslEntity) o;
        return idArtTypeTransl == that.idArtTypeTransl && worktypeId == that.worktypeId && langId == that.langId && Objects.equals(artType, that.artType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idArtTypeTransl, worktypeId, langId, artType);
    }
}
