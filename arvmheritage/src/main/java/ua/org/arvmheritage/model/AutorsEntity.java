package ua.org.arvmheritage.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "AUTORS", schema = "db_arvm", catalog = "")
public class AutorsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_autor")
    private int idAutor;
    @Basic
    @Column(name = "active")
    private Boolean active;

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AutorsEntity that = (AutorsEntity) o;
        return idAutor == that.idAutor && Objects.equals(active, that.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAutor, active);
    }
}
