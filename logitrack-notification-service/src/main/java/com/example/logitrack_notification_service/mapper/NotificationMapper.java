package com.example.logitrack_notification_service.mapper;

import com.example.logitrack_notification_service.dto.NotificationRequest;
import com.example.logitrack_notification_service.dto.NotificationResponse;
import com.example.logitrack_notification_service.entity.Notification;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NotificationMapper {
Notification ToEntity(NotificationRequest dto);
NotificationResponse ToDto(Notification entity);
}