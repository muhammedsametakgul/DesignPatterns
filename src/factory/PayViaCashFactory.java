package factory;

public class PayViaCashFactory implements PaymentFactory{

    @Override
    public Payment createPayment() {
        return new PayViaCash();
    }
}
