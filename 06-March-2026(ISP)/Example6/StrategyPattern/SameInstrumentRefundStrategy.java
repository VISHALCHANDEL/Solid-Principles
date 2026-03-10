package StrategyPattern;

public class SameInstrumentRefundStrategy implements RefundStrategy {
    @Override
    public void doRefund() {
        // Implementation for same instrument refund
        System.out.println("Refund processed through the same instrument.");
    }
    
}
