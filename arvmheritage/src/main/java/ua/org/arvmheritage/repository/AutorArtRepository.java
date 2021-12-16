package ua.org.arvmheritage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.org.arvmheritage.model.AutorArtEntity;

import java.util.Optional;

@Repository
public interface AutorArtRepository extends JpaRepository<AutorArtEntity, Integer> {
    @Override
    Optional<AutorArtEntity> findById(Integer integer);
}
