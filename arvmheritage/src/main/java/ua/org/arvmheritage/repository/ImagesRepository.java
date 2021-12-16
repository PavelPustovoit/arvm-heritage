package ua.org.arvmheritage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.org.arvmheritage.model.ImagesEntity;

import java.util.Optional;

@Repository
public interface ImagesRepository extends JpaRepository<ImagesEntity, Integer> {
    @Override
    Optional<ImagesEntity> findById(Integer integer);
}
