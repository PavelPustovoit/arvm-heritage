package ua.org.arvmheritage.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ART_TEXTS_TRANSL", schema = "db_arvm", catalog = "")
public class ArtTextsTranslEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_art_text")
    private long idArtText;
    @Basic
    @Column(name = "art_id")
    private int artId;
    @Basic
    @Column(name = "lang_id")
    private short langId;
    @Basic
    @Column(name = "art_name")
    private String artName;
    @Basic
    @Column(name = "description")
    private String description;

    public long getIdArtText() {
        return idArtText;
    }

    public void setIdArtText(long idArtText) {
        this.idArtText = idArtText;
    }

    public int getArtId() {
        return artId;
    }

    public void setArtId(int artId) {
        this.artId = artId;
    }

    public short getLangId() {
        return langId;
    }

    public void setLangId(short langId) {
        this.langId = langId;
    }

    public String getArtName() {
        return artName;
    }

    public void setArtName(String artName) {
        this.artName = artName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArtTextsTranslEntity that = (ArtTextsTranslEntity) o;
        return idArtText == that.idArtText && artId == that.artId && langId == that.langId && Objects.equals(artName, that.artName) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idArtText, artId, langId, artName, description);
    }
}
