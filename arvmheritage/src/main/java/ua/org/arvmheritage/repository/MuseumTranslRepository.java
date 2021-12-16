package ua.org.arvmheritage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.org.arvmheritage.model.MuseumTranslEntity;

import java.util.Optional;

@Repository
public interface MuseumTranslRepository extends JpaRepository<MuseumTranslEntity, Integer> {
    @Override
    Optional<MuseumTranslEntity> findById(Integer integer);
}
