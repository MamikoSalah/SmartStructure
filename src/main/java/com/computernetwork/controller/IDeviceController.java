package com.computernetwork.controller;

import com.computernetwork.entity.Device;

import java.util.List;

public interface IDeviceController {

    Device saveDevice(Device device);

    void deleteDeviceById(Integer id);

    List<Device> getAllDevice();

    Device getDeviceById(Integer id);

    List<Device> getDeviceByBuildingAndFloorAndType(String buildingName, Integer floorNumber, String sensorType);

    List<Device> getDeviceByType(String sensorType);
}
