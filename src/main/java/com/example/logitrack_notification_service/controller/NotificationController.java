
package com.example.logitrack_notification_service.controller;

import com.example.logitrack_notification_service.dto.NotificationRequest;
import com.example.logitrack_notification_service.dto.NotificationResponse;
import com.example.logitrack_notification_service.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@Controller
@RequestMapping("api/notification")
public class NotificationController {
    private final NotificationService notificationService;

    @PostMapping("/addNotification")
    public ResponseEntity<NotificationResponse> addNotification(@RequestBody NotificationRequest notificationRequest){
        return  ResponseEntity.ok(notificationService.createNotification(notificationRequest));
    }
    @GetMapping("/notifications")
    public ResponseEntity<List<NotificationResponse>> notifications(){
        return  ResponseEntity.ok(notificationService.notification());
    }
    @GetMapping("/notifications/{id}")
    public ResponseEntity<NotificationResponse> notificationsById(@PathVariable Long id ){
        return  ResponseEntity.ok(notificationService.notificationById(id));
    }
    @GetMapping("/notifications/order/{orderId}")
    public ResponseEntity<List<NotificationResponse>> notificationsByOrderId(@PathVariable Long id ){
        return  ResponseEntity.ok(notificationService.notificationsByOrderId(id));
    }





}
