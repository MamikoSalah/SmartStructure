package com.computernetwork.controller.impl;

import com.computernetwork.controller.IDeviceController;
import com.computernetwork.entity.Device;
import com.computernetwork.service.IDeviceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/devices")
public class DeviceControllerImpl implements IDeviceController {

    private IDeviceService deviceService;


    @Override
    @GetMapping
    public List<Device> getAllDevice() {
        return deviceService.getAllDevice();
    }

    @Override
    @PostMapping
    public Device saveDevice(Device device) {
        return deviceService.saveDevice(device);
    }

}
