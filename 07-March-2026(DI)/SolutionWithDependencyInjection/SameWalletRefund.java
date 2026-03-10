public class SameWalletRefund implements RefundLogic {
    public void Algo1(){
       System.out.println("Algo 1");

    }

    public void Algo2(){
        System.out.println("Algo 2");
    }
    @Override
    public void doRefund(){
        System.out.println("Refund done in the same wallet");
    }
}
