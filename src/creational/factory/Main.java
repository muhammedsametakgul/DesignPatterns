package creational.factory;

public class Main {
    public static void main(String[] args) {
        PayViaCreditCardFactory payViaCreditCardFactory = new PayViaCreditCardFactory();
       Payment payment = payViaCreditCardFactory.createPayment();
       payment.pay();

       PayViaCashFactory payViaCashFactory = new PayViaCashFactory();
       Payment paymentCash = payViaCashFactory.createPayment();
        paymentCash.pay();
    }
}
