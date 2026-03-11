public enum NotificationType{
    SMS, EMAIL, PUSH, WHATSAPP;

    public void sendSMSNotification(String message){
        // Code to send SMS notification
        System.out.println("Sending SMS notification: " + message);
    }

    public void sendEmailNotification(String message){
        // Code to send Email notification
        System.out.println("Sending Email notification: " + message);
    }

    public void sendPushNotification(String message){
        // Code to send Push notification
        System.out.println("Sending Push notification: " + message);
    }

    public void sendWhatsAppNotification(String message){
        // Code to send WhatsApp notification
        System.out.println("Sending WhatsApp notification: " + message);
    }
}