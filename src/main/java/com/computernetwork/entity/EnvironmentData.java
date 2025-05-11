package com.computernetwork.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "environment_data")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnvironmentData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "device_id")
    private Device device;

    @Column(name = "data_type")
    @Enumerated(EnumType.STRING)
    private DataType dataType;

    @Column(name = "environment_value")
    private Double environmentValue;

    @Column(name = "measurment_time")
    private LocalDateTime measurmentTime;

    public enum DataType{
        TEMPERATURE,
        HUMIDITY,
        SMOKE
    }
}
