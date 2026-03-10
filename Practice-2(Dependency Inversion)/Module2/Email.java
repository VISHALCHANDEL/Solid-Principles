public class Email implements NotificationService{

    public void send(String message){
        System.out.println("Email is sent successfully : "+ message);
    }
    
}
