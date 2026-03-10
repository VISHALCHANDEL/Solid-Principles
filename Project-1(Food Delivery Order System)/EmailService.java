public class EmailService implements EmailNotification {
    public void sendEmail(String message){
        System.out.println("Email sent: "+message);
    }
    
}
