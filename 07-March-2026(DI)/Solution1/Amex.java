public class Amex extends CreditCard implements RefundCompatibleCC 
{
   public SameWalletRefund refundAlgorithm;

    @Override
    public void swipeAndPay() {
        System.out.println("Swiping Amex card and making payment.");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Making online payment with Amex card.");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Tapping Amex card to make payment.");
    }

    @Override
    public void refundAmount() {
        refundAlgorithm.Algo2();
    }
}