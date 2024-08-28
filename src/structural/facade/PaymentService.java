package structural.facade;

public class PaymentService {

    public boolean processPayment(String paymentDetails) {
        System.out.println("Payment is processing: " + paymentDetails);
        return true;
    }

}
