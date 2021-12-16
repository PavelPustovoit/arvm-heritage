package ua.org.arvmheritage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.org.arvmheritage.model.ArtTechniqueEntity;

import java.util.Optional;
@Repository
public interface ArtTechniqueRepositiry extends JpaRepository<ArtTechniqueEntity, Integer> {
    Optional<ArtTechniqueEntity> findById(Integer integer);
}
