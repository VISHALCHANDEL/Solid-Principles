public class Main {

    public static void main(String[] args) {
        NotificationManager manager  = new NotificationManager(new SMS());
        manager.sendNotification("Hello, Vishal is speaking from this side");
    }
}