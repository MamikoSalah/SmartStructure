package com.computernetwork.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "user_last_name", nullable = false)
    private String userLastName;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(unique = true, name = "phone", nullable = false)
    private String phone;

    @Column(unique = true, name = "email", nullable = false)
    private String email;

    @Column(name = "building_name", nullable = false)
    private String buildingName;

    @Column(name = "floor_number", nullable = false)
    private String floorNumber;

    @Column(name = "room_number")
    private String roomNumber;



}
