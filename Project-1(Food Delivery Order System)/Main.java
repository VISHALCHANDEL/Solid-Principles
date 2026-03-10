public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        Order order = orderService.createOrder(1,500);
        Payment payment = new UpiPayment();
        OrderController controller = new OrderController(payment);
        controller.checkout(order);
    }
}
