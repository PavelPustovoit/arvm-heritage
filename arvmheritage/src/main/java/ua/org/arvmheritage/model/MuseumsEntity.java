package ua.org.arvmheritage.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "MUSEUMS", schema = "db_arvm", catalog = "")
public class MuseumsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_museum")
    private int idMuseum;
    @Basic
    @Column(name = "active")
    private boolean active;

    public int getIdMuseum() {
        return idMuseum;
    }

    public void setIdMuseum(int idMuseum) {
        this.idMuseum = idMuseum;
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
        MuseumsEntity that = (MuseumsEntity) o;
        return idMuseum == that.idMuseum && active == that.active;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMuseum, active);
    }
}
