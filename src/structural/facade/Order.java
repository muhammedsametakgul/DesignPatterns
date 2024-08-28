package structural.facade;

public class Order {

    private final InventoryService inventoryService;
    private final PaymentService paymentService;
    private final ShippingService shippingService;

    public Order() {
        this.inventoryService = new InventoryService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
    }

    public void giveOrder(String productId,String paymentDetails) {
        System.out.println("Order is processing");

        if(inventoryService.checkStock(productId)){
            if(paymentService.processPayment(paymentDetails)){
                shippingService.shipProduct(productId);
                System.out.println("Order is successfully completed");
            }
            else{
                System.out.println("Payment failed");
            }
        }else{
            System.out.println("There is no stock for the product");
        }
    }
}
