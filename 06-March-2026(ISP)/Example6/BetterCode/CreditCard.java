package BetterCode;

public abstract class CreditCard {
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private String cvv;

    // Getters and setters

    public abstract void swipeAndPay();
   // public abstract void doRefund();
    public abstract void onlinePayment();
    public abstract void tapAndPay();
  //  public abstract void upiPayment();
    //public abstract void intlPayment();
}

//Problem 1: Diners stop supporting tap and pay
//Problem 2: Code duplication
//Problem 3: refund logic is not same for all cards