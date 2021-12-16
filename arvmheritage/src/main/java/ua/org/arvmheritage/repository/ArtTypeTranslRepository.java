package ua.org.arvmheritage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.org.arvmheritage.model.ArtTypeTranslEntity;

import java.util.Optional;

@Repository
public interface ArtTypeTranslRepository extends JpaRepository<ArtTypeTranslEntity, Integer> {
    @Override
    Optional<ArtTypeTranslEntity> findById(Integer integer);
}
