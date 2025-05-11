package com.computernetwork.controller.impl;

import com.computernetwork.controller.IDeviceController;
import com.computernetwork.entity.Device;
import com.computernetwork.service.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/devices")
public class DeviceControllerImpl implements IDeviceController {

    @Autowired
    private IDeviceService deviceService;


    @Override
    @GetMapping("/list")
    public List<Device> getAllDevice() {
        return deviceService.getAllDevice();
    }

    @Override
    @GetMapping("/list/{id}")
    public Device getDeviceById(@PathVariable("id") Integer id) {
        return deviceService.getDeviceById(id);
    }

    @Override
    @GetMapping("/list/filter")
    public List<Device> getDeviceByBuildingAndFloorAndType(String buildingName, Integer floorNumber, @RequestParam(required = false) String sensorType) {
        return deviceService.getDeviceByBuildingAndFloorAndType(buildingName, floorNumber, sensorType);
    }

    @Override
    @GetMapping("/list/{sensorType}")
    public List<Device> getDeviceByType(@PathVariable("sensorType") String sensorType) {
        return deviceService.getDeviceByType(sensorType);
    }

    @Override
    @PostMapping("/save")
    public Device saveDevice(@RequestBody Device device) {
        return deviceService.saveDevice(device);
    }


    @Override
    @DeleteMapping("/delete/{id}")
    public void deleteDeviceById(@PathVariable(name = "id") Integer id) {
        deviceService.deleteDeviceById(id);

    }

}
