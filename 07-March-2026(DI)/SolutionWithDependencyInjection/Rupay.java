public class Rupay extends CreditCard  {
    public RefundLogic refundAlgorithm;
    @Override
    public void swipeAndPay() {
        System.out.println("Swiping Rupay card and making payment.");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Making online payment with Rupay card.");
    }

    @Override
    public void tapAndPay() {
        refundAlgorithm.Algo2();
    }

    
   
    
}