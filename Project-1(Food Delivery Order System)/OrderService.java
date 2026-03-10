public class OrderService{

    public Order createOrder(int id ,double amount){
        System.out.println("Order created successfully.");
        return new Order(id, amount);
    }
}