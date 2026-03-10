package ProblematicCode;

public abstract class CreditCard {
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private String cvv;

    // Getters and setters

    public abstract void swipeAndPay();
    public abstract void doRefund();
    public abstract void onlinePayment();
    public abstract void tapAndPay();
    public abstract void upiPayment();
    public abstract void intlPayment();
}

// Problem 1. is that upi is only supported for rupay credit card
// Later  govt mandate for all kinds for credit card
// Do refund is not supported for diners credit card
//Problem 2. Rupay card does not support internation payment and amex diner and mastercard expects pin 

// This design is not extendable because some features are common and some are not common for all credit cards. 

//Violates ISP->No forceful behaviour
//it states that if any particular child is not intended to be having a particular behaviour of the parent, then it should not be forced to implement that behaviour.

