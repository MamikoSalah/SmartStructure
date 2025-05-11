package com.computernetwork.controller;

import com.computernetwork.entity.Device;

import java.util.List;

public interface IDeviceController {

    List<Device> getAllDevice();

    Device saveDevice(Device device);

}
