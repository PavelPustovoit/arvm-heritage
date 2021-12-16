package ua.org.arvmheritage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.org.arvmheritage.model.UsersRolesEntity;

import java.util.Optional;

@Repository
public interface UsersRolesRepository extends JpaRepository<UsersRolesEntity, Integer> {
    @Override
    Optional<UsersRolesEntity> findById(Integer integer);
}
