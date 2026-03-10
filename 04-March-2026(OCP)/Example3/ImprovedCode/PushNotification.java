package ImprovedCode;

public class PushNotification implements Notification {
    
    public void sendMessage(String message){
        System.out.println("Sending push notification: " + message);
    }
    
}
