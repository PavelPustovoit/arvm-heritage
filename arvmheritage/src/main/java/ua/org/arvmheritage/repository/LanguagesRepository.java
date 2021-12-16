package ua.org.arvmheritage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.org.arvmheritage.model.LanguagesEntity;

import java.util.Optional;

@Repository
public interface LanguagesRepository extends JpaRepository<LanguagesEntity, Integer> {
    @Override
    Optional<LanguagesEntity> findById(Integer integer);
}
