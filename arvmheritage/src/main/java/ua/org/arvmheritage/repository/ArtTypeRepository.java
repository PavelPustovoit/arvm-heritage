package ua.org.arvmheritage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.org.arvmheritage.model.ArtTypeEntity;

import java.util.Optional;

@Repository
public interface ArtTypeRepository extends JpaRepository<ArtTypeEntity, Integer> {
    @Override
    Optional<ArtTypeEntity> findById(Integer integer);
}
