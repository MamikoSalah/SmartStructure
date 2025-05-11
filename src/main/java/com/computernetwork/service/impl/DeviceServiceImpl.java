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
    public List<Device> getTriggeredDevice() {
        return deviceRepository.findByStatus("TRIGGERED");
    }

}
