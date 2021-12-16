package ua.org.arvmheritage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.org.arvmheritage.model.AutorTranslEntity;

import java.util.Optional;

@Repository
public interface AutorTranslRepository extends JpaRepository<AutorTranslEntity, Integer> {
    @Override
    Optional<AutorTranslEntity> findById(Integer integer);
}
