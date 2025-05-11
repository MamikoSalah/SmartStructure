package com.computernetwork.repository;

import com.computernetwork.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer> {

    List<Device> findByBuildingAndFloorAndType(String buildingName, Integer floorNumber, String sensorType);

    List<Device> findByBuildingAndFloor(String buildingName, Integer floorNumber);

    List<Device> findByType(String sensorType);

    List<Device> findByBuilding(String building);

    List<Device> findByFloor(Integer floorNumber);

    List<Device> findByStatus(String status);


}
