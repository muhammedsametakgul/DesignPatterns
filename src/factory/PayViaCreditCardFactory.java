package factory;

public class PayViaCreditCardFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new PayViaCreditCard();
    }
}
