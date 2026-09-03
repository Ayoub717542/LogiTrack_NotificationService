
package com.example.logitrack_notification_service.service;

import com.example.logitrack_notification_service.dto.NotificationRequest;
import com.example.logitrack_notification_service.dto.NotificationResponse;
import com.example.logitrack_notification_service.entity.Notification;
import com.example.logitrack_notification_service.mapper.NotificationMapper;
import com.example.logitrack_notification_service.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NotificationService{
    private final NotificationRepository notificationRepository;
    private final NotificationMapper notificationMapper;

    public NotificationResponse createNotification(NotificationRequest request) {

        Notification notification = notificationMapper.toEntity(request);

        notification.setDateCreation(LocalDate.now());
        notification.set_read(false);
        Notification savedNotification = notificationRepository.save(notification);

        return notificationMapper.toDto(savedNotification);
    }

    public List<NotificationResponse> notification() {
         return notificationRepository.findAll()
                 .stream()
                 .map(notification -> notificationMapper.toDto(notification) )
                 .toList();
    }

    public NotificationResponse notificationById(Long id) {
       Notification notification = notificationRepository.findById(id).orElseThrow(() -> new RuntimeException("Id not found"));
        return notificationMapper.toDto(notification);
    }

    public List<NotificationResponse> notificationsByOrderId(Long id) {
             return notificationRepository.findByOrderId(id)
                     .stream().map(notificationMapper::toDto)
                     .toList();
    }

}
