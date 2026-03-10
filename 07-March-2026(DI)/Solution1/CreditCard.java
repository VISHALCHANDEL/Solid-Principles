public abstract class CreditCard {

    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private int cvv;

    public abstract void swipeAndPay();
    public abstract void onlinePayment();
    public abstract void tapAndPay();
}
//Now this violates our 5 th Solid Principle dependency inversion principle
// This is not dependency injection 
//Higher level objects never depend on convrete implementations of a lower level objects 
//In simple words one class should try to avoid as mucha as possible any dependency on other concrete class