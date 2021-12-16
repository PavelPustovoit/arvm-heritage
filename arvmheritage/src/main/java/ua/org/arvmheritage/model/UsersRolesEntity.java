package ua.org.arvmheritage.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "USERS_ROLES", schema = "db_arvm", catalog = "")
public class UsersRolesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_user_role")
    private int idUserRole;
    @Basic
    @Column(name = "id_role")
    private int idRole;
    @Basic
    @Column(name = "id_user")
    private int idUser;

    public int getIdUserRole() {
        return idUserRole;
    }

    public void setIdUserRole(int idUserRole) {
        this.idUserRole = idUserRole;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersRolesEntity that = (UsersRolesEntity) o;
        return idUserRole == that.idUserRole && idRole == that.idRole && idUser == that.idUser;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUserRole, idRole, idUser);
    }
}
