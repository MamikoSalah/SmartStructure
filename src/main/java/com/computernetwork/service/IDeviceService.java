package com.computernetwork.service;

import com.computernetwork.entity.Device;

import java.util.List;

public interface IDeviceService {

    List<Device> getAllDevice();

    Device saveDevice(Device device);

    List<Device> getTriggeredDevice();




}
