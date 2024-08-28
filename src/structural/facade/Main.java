package structural.facade;

public class Main {

    public static void main(String[] args) {
        Order order = new Order();

        String productId = "112521";
        String paymentDetails = "Debit Card";
        order.giveOrder(productId, paymentDetails);
    }
}
