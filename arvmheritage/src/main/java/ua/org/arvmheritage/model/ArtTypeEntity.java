package ua.org.arvmheritage.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ART_TYPE", schema = "db_arvm", catalog = "")
public class ArtTypeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_worktype")
    private int idWorktype;
    @Basic
    @Column(name = "active")
    private boolean active;

    public int getIdWorktype() {
        return idWorktype;
    }

    public void setIdWorktype(int idWorktype) {
        this.idWorktype = idWorktype;
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
        ArtTypeEntity that = (ArtTypeEntity) o;
        return idWorktype == that.idWorktype && active == that.active;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idWorktype, active);
    }
}
