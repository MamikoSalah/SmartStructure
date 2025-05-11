package com.computernetwork.repository;

import com.computernetwork.entity.EnvironmentData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvironmentDataRepository extends JpaRepository<EnvironmentData, Integer> {
}
