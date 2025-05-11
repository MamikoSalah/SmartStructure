package com.computernetwork.controller.impl;

import com.computernetwork.controller.IEnvironmentDataController;
import com.computernetwork.entity.EnvironmentData;
import com.computernetwork.service.IEnvironmentDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/environment-data")
public class EnvironmentControllerImpl implements IEnvironmentDataController {

    @Autowired
    private IEnvironmentDataService environmentDataService;

    @Override
    @PostMapping("/save")
    public EnvironmentData saveEnvironmentData(@RequestBody EnvironmentData environmentData) {
        return environmentDataService.saveEnvironmentData(environmentData);
    }

    @Override
    @GetMapping("/list/{id}")
    public Optional<EnvironmentData> getEnvironmentDataById(@PathVariable(name = "id") Integer id) {
        return environmentDataService.getEnvironmentDataById(id);
    }

    @Override
    @GetMapping("/list")
    public List<EnvironmentData> getAllEnvironmentData() {
        return environmentDataService.getAllEnvironmentData();
    }

    @Override
    @GetMapping("/device/{id}")
    public List<EnvironmentData> getByDeviceId(@PathVariable(name = "id") Integer deviceId) {
        return environmentDataService.getByDeviceId(deviceId);
    }
}
