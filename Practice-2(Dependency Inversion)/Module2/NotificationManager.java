public class NotificationManager {
    private NotificationService service;

    NotificationManager(NotificationService service){
        this.service = service;
    }
    void sendNotification(String message){
        service.send(message);
    }

 }
