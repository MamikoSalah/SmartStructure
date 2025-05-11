package com.computernetwork.repository;

import com.computernetwork.entity.EnvironmentData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnvironmentDataRepository extends JpaRepository<EnvironmentData, Integer> {
    List<EnvironmentData> findByDeviceId(Integer deviceId);
}
