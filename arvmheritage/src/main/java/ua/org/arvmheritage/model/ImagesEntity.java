package ua.org.arvmheritage.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "IMAGES", schema = "db_arvm", catalog = "")
public class ImagesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_image")
    private int idImage;
    @Basic
    @Column(name = "art_work_id")
    private int artWorkId;
    @Basic
    @Column(name = "path_image")
    private String pathImage;

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public int getArtWorkId() {
        return artWorkId;
    }

    public void setArtWorkId(int artWorkId) {
        this.artWorkId = artWorkId;
    }

    public String getPathImage() {
        return pathImage;
    }

    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImagesEntity that = (ImagesEntity) o;
        return idImage == that.idImage && artWorkId == that.artWorkId && Objects.equals(pathImage, that.pathImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idImage, artWorkId, pathImage);
    }
}
