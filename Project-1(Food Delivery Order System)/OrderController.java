public class OrderController {
    private Payment payment;
    public OrderController(Payment payment){
        this.payment = payment;
    }

    public void checkout(Order order){
        payment.pay(order.getAmount());
        System.out.println("Order completed successfully.");
    }
}
