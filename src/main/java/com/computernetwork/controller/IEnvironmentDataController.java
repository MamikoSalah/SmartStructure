package com.computernetwork.controller;

import com.computernetwork.entity.EnvironmentData;

import java.util.List;
import java.util.Optional;

public interface IEnvironmentDataController {
    EnvironmentData saveEnvironmentData(EnvironmentData environmentData);

    Optional<EnvironmentData> getEnvironmentDataById(Integer id);

    List<EnvironmentData> getAllEnvironmentData();

    List<EnvironmentData> getByDeviceId(Integer deviceId);
}
