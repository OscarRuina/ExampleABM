package com.unla.example.repositories;

import com.unla.example.models.entities.RoleEntity;
import com.unla.example.models.enums.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRoleRepository extends JpaRepository<RoleEntity, Integer> {

    Optional<RoleEntity> findById(Integer integer);

    Optional<RoleEntity> findByType(RoleType type);
}