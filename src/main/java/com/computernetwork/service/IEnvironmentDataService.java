package com.computernetwork.service;

import com.computernetwork.entity.EnvironmentData;

import java.util.List;
import java.util.Optional;

public interface IEnvironmentDataService {

    EnvironmentData saveEnvironmentData(EnvironmentData environmentData);

    Optional<EnvironmentData> getEnvironmentDataById(Integer id);

    List<EnvironmentData> getAllEnvironmentData();

    List<EnvironmentData> getByDeviceId(Integer deviceId);
}
