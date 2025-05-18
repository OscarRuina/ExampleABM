package com.unla.example.repositories;

import com.unla.example.models.entities.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IExampleRepository extends JpaRepository<Example, Integer> {

    //Search Example with softDeleted = False
    Page<Example> findAllBySoftDeletedFalse(Pageable pageable);

    //Search Example with softDeleted = False by ID
    Optional<Example> findByIdAndSoftDeletedFalse(Integer id);
}