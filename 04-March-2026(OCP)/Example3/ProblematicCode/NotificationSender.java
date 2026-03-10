import java.util.List;

public class NotificationSender {
    public void sendNotifications(List<NotificationType>notificationTypes, String message){
    for(NotificationType notificationType:notificationTypes)
    {
        switch(notificationType){
            case SMS:
                notificationType.sendSMSNotification(message);
                break;
            case EMAIL:
                notificationType.
                sendEmailNotification(message);
                break;
            case PUSH:
                notificationType.
                sendPushNotification(message);
                break;
            case WHATSAPP:
                notificationType.
                sendWhatsAppNotification(message);
        }
    
}

}
}
// OCP- Open closed principle

//A class should be open for extension but closed for modifications

// This class will be modfied everytime 
//we introduce or remove any type of notification. This is a clear violation of ocp. This is a clear violation of ocp