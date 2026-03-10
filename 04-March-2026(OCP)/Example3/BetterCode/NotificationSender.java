package BetterCode;

import java.util.List;

public class NotificationSender {
    
      public void sendNotifications(List<String>notificationTypes, String message){
    for(String notificationType:notificationTypes)
    {
        switch(notificationType){
            case "SMS":
                SMSNotification smsNotification = new SMSNotification();
                smsNotification.sendSMSNotification(message);
                break;
            case "EMAIL":
                EmailNotification notification = new EmailNotification();
                notification.sendEmailNotification(message);
                break;
            case "PUSH":
                PushNotification pushNotification = new PushNotification();
                pushNotification.sendPushNotification(message);
                break;
           
        }
    
}

}
}
// OCP- Open closed principle
// A class should be open for extension but closed for modifications
