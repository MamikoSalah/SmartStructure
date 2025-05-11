package com.computernetwork.service.impl;

import com.computernetwork.entity.EnvironmentData;
import com.computernetwork.repository.EnvironmentDataRepository;
import com.computernetwork.service.IEnvironmentDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnvironmentDataServiceImpl implements IEnvironmentDataService {

    @Autowired
    private EnvironmentDataRepository environmentDataRepository;

    @Override
    public EnvironmentData saveEnvironmentData(EnvironmentData environmentData) {
        return environmentDataRepository.save(environmentData);
    }

    @Override
    public Optional<EnvironmentData> getEnvironmentDataById(Integer id) {
        return environmentDataRepository.findById(id);
    }

    @Override
    public List<EnvironmentData> getAllEnvironmentData() {
        return environmentDataRepository.findAll();
    }

    @Override
    public List<EnvironmentData> getByDeviceId(Integer deviceId) {
        return environmentDataRepository.findByDeviceId(deviceId);
    }
}
