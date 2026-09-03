package com.example.logitrack_notification_service.entity;

import com.example.logitrack_notification_service.enums.NotificationType;
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
    private NotificationType type;

    private LocalDate dateCreation;
    private boolean is_read;
    private Long orderId;
}
