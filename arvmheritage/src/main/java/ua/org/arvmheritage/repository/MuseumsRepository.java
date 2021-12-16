package ua.org.arvmheritage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.org.arvmheritage.model.MuseumsEntity;

import java.util.Optional;

@Repository
public interface MuseumsRepository extends JpaRepository<MuseumsEntity, Integer> {
    @Override
    Optional<MuseumsEntity> findById(Integer integer);
}
