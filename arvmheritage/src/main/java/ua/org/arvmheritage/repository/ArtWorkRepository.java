package ua.org.arvmheritage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.org.arvmheritage.model.ArtWorkEntity;

import java.util.Optional;

@Repository
public interface ArtWorkRepository extends JpaRepository<ArtWorkEntity, Integer> {
    Optional<ArtWorkEntity> findById(Integer integer);
}
