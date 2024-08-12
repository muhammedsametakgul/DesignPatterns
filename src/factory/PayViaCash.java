package factory;

public class PayViaCash implements Payment{
    @Override
    public void pay() {
        System.out.println("Paid via Cash Money");
    }
}
