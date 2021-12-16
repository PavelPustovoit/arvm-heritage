package ua.org.arvmheritage.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "LANGUAGES", schema = "db_arvm", catalog = "")
public class LanguagesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_lang")
    private short idLang;
    @Basic
    @Column(name = "lang")
    private String lang;
    @Basic
    @Column(name = "active")
    private boolean active;

    public short getIdLang() {
        return idLang;
    }

    public void setIdLang(short idLang) {
        this.idLang = idLang;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
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
        LanguagesEntity that = (LanguagesEntity) o;
        return idLang == that.idLang && active == that.active && Objects.equals(lang, that.lang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLang, lang, active);
    }
}
