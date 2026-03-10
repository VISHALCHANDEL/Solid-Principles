package StrategyPattern;

public class BankAccountRefundStrategy implements RefundStrategy {
    @Override
    public void doRefund() {
        // Implementation for bank account refund
        System.out.println("Refund processed through bank account.");
    }
}