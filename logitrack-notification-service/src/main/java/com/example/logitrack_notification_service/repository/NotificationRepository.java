package com.example.logitrack_notification_service.repository;

import com.example.logitrack_notification_service.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface NotificationRepository extends JpaRepository<Notification,Long> {
    List<Notification> findByOrderId(Long orderId);
    Optional<Notification> findById(Long Id);
}
