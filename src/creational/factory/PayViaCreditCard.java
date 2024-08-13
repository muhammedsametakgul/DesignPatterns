package creational.factory;

public class PayViaCreditCard implements Payment{
    @Override
    public void pay() {
        System.out.println("Paid Via Credit Card");
    }
}
