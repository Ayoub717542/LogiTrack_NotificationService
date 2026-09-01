package com.example.logitrack_notification_service.dto;

import com.example.logitrack_notification_service.enums.NotificationType;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class NotificationResponse {
    private Long id;
    private String message;
    private NotificationType type;
    private Long orderId;
    private LocalDate dateCreation;
    private boolean read;
}
