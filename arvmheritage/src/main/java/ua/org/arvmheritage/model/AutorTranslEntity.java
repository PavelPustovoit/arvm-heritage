package ua.org.arvmheritage.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "AUTOR_TRANSL", schema = "db_arvm", catalog = "")
public class AutorTranslEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_autor_transl")
    private int idAutorTransl;
    @Basic
    @Column(name = "id_autor")
    private int idAutor;
    @Basic
    @Column(name = "id_lang")
    private short idLang;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "surname")
    private String surname;

    public int getIdAutorTransl() {
        return idAutorTransl;
    }

    public void setIdAutorTransl(int idAutorTransl) {
        this.idAutorTransl = idAutorTransl;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public short getIdLang() {
        return idLang;
    }

    public void setIdLang(short idLang) {
        this.idLang = idLang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AutorTranslEntity that = (AutorTranslEntity) o;
        return idAutorTransl == that.idAutorTransl && idAutor == that.idAutor && idLang == that.idLang && Objects.equals(name, that.name) && Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAutorTransl, idAutor, idLang, name, surname);
    }
}
