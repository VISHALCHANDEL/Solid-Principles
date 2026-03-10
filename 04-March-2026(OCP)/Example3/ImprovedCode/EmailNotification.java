package ImprovedCode;

public class EmailNotification implements Notification {
    
    public void sendMessage(String message){
        System.out.println("Sending email notification: " + message);
    }
}
