package com.example.logitrack_notification_service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Notification
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;

    @Enumerated(EnumType.STRING)
    private String type;

    private LocalDate dateCreation;
    private boolean read;
    private Long orderId;
}
