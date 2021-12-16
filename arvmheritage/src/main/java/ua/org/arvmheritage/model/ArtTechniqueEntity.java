package ua.org.arvmheritage.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ART_TECHNIQUE", schema = "db_arvm", catalog = "")
public class ArtTechniqueEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_art_technique")
    private int idArtTechnique;
    @Basic
    @Column(name = "active")
    private boolean active;

    public int getIdArtTechnique() {
        return idArtTechnique;
    }

    public void setIdArtTechnique(int idArtTechnique) {
        this.idArtTechnique = idArtTechnique;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArtTechniqueEntity that = (ArtTechniqueEntity) o;
        return idArtTechnique == that.idArtTechnique && active == that.active;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idArtTechnique, active);
    }
}
