public class SMSService implements SMSNotification {
    public void sendSMS(String message){
        System.out.println("SMS sent: "+message);
    }
}
