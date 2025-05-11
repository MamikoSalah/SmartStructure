package com.computernetwork.service;

import com.computernetwork.entity.Device;

import java.util.List;
import java.util.Optional;

public interface IDeviceService {

    Device saveDevice(Device device);

    void deleteDeviceById(Integer id);

    List<Device> getAllDevice();

    Device getDeviceById(Integer id);

    List<Device> getDeviceByBuildingAndFloorAndType(String buildingName, Integer floorNumber, String sensorType);

    List<Device> getDeviceByType(String sensorType);











}
