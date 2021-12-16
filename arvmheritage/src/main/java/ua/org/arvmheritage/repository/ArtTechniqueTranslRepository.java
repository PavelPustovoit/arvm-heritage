package ua.org.arvmheritage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.org.arvmheritage.model.ArtTechniqueTranslEntity;

import java.util.Optional;
@Repository
public interface ArtTechniqueTranslRepository extends JpaRepository<ArtTechniqueTranslEntity, Integer> {

    //Optional<ArtTechniqueTranslEntity> findById(Integer id);
}
