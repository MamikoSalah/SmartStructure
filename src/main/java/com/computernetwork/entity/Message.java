package com.computernetwork.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "message")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "message_content")
    private String messageContent;

    @Column(name = "sent_at")
    private Timestamp sentAt;

    @ManyToOne
    @JoinColumn(name = "receiver")
    private User receiver;
}
