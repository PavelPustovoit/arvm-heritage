package ua.org.arvmheritage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.org.arvmheritage.model.AutorsEntity;

import java.util.Optional;

@Repository
public interface AutorsRepository extends JpaRepository<AutorsEntity, Integer> {
    @Override
    Optional<AutorsEntity> findById(Integer integer);
}
