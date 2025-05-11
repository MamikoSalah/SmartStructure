package com.computernetwork.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "device")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "device_name", nullable = false)
    private String deviceName;

    @Column(name = "building_name", nullable = false)
    private String buildingName;

    @Column(name = "floor_number", nullable = false)
    private String floorNumber;

    @Column(name = "room_number")
    private String roomNumber;

    @Column(name = "sensor_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private DeviceSensorType sensorType;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private DeviceStatus status;

    public enum DeviceSensorType {
        TEMPERATURE,
        HUMIDITY_RATE,
        SMOKE
    }

    public enum DeviceStatus {
        ACTIVE,
        INACTIVE
    }

}
