package ua.org.arvmheritage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.org.arvmheritage.model.ArtTextsTranslEntity;

import java.util.Optional;

@Repository
public interface ArtTextsTranslRepository extends JpaRepository<ArtTextsTranslEntity, Integer> {
    @Override
    Optional<ArtTextsTranslEntity> findById(Integer integer);
}
