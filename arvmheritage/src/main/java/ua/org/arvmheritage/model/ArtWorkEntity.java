package ua.org.arvmheritage.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ART_WORK", schema = "db_arvm", catalog = "")
public class ArtWorkEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_art_work")
    private int idArtWork;
    @Basic
    @Column(name = "high")
    private double high;
    @Basic
    @Column(name = "width")
    private double width;
    @Basic
    @Column(name = "depth")
    private Double depth;
    @Basic
    @Column(name = "date_create")
    private Date dateCreate;
    @Basic
    @Column(name = "id_museum")
    private int idMuseum;
    @Basic
    @Column(name = "user_id")
    private int userId;
    @Basic
    @Column(name = "id_art_technique")
    private int idArtTechnique;
    @Basic
    @Column(name = "id_worktype")
    private int idWorktype;
    @Basic
    @Column(name = "dt_ins")
    private Timestamp dtIns;

    public int getIdArtWork() {
        return idArtWork;
    }

    public void setIdArtWork(int idArtWork) {
        this.idArtWork = idArtWork;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Double getDepth() {
        return depth;
    }

    public void setDepth(Double depth) {
        this.depth = depth;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public int getIdMuseum() {
        return idMuseum;
    }

    public void setIdMuseum(int idMuseum) {
        this.idMuseum = idMuseum;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getIdArtTechnique() {
        return idArtTechnique;
    }

    public void setIdArtTechnique(int idArtTechnique) {
        this.idArtTechnique = idArtTechnique;
    }

    public int getIdWorktype() {
        return idWorktype;
    }

    public void setIdWorktype(int idWorktype) {
        this.idWorktype = idWorktype;
    }

    public Timestamp getDtIns() {
        return dtIns;
    }

    public void setDtIns(Timestamp dtIns) {
        this.dtIns = dtIns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArtWorkEntity that = (ArtWorkEntity) o;
        return idArtWork == that.idArtWork && Double.compare(that.high, high) == 0 && Double.compare(that.width, width) == 0 && idMuseum == that.idMuseum && userId == that.userId && idArtTechnique == that.idArtTechnique && idWorktype == that.idWorktype && Objects.equals(depth, that.depth) && Objects.equals(dateCreate, that.dateCreate) && Objects.equals(dtIns, that.dtIns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idArtWork, high, width, depth, dateCreate, idMuseum, userId, idArtTechnique, idWorktype, dtIns);
    }
}
