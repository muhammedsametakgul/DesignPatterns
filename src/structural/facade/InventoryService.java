package structural.facade;

public class InventoryService {

    public boolean checkStock(String productId) {
        System.out.println("Stock is checking: " + productId);
        return true;
    }
}
