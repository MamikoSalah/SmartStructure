package com.computernetwork.service.impl;

import com.computernetwork.entity.Device;
import com.computernetwork.repository.DeviceRepository;
import com.computernetwork.service.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceServiceImpl implements IDeviceService {

    @Autowired
    private DeviceRepository deviceRepository;


    @Override
    public List<Device> getAllDevice() {
        return deviceRepository.findAll();
    }

    @Override
    public Device saveDevice(Device device) {
        return deviceRepository.save(device);
    }

    @Override
    public Device getDeviceById(Integer id) {
        return deviceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Device> getDeviceByBuildingAndFloorAndType(String buildingName, Integer floorNumber, String sensorType) {

        if (buildingName != null && floorNumber != null && sensorType != null){
            return deviceRepository.findByBuildingAndFloorAndType(buildingName, floorNumber, sensorType);
        } else if (buildingName != null && floorNumber != null && sensorType == null) {
            return deviceRepository.findByBuildingAndFloor(buildingName, floorNumber);
        }else if (buildingName != null && floorNumber == null && sensorType == null){
            return deviceRepository.findByBuilding(buildingName);
        }else {
            return null;
        }
    }

    @Override
    public List<Device> getDeviceByType(String sensorType) {
        return deviceRepository.findByType(sensorType);
    }

    @Override
    public void deleteDeviceById(Integer id) {
        deviceRepository.deleteById(id);
    }

}
