public class SMS implements NotificationService 
{
   public void send(String message){
    System.out.println("Message is through SMS: " + message);;
   }
}
