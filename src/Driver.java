import java.util.ArrayList;
public class Driver {
    public static void main(String[] args) {
        Paypal paypal_transaction = new Paypal();
        Stripe stripe_transaction = new Stripe();
        Square square_transaction = new Square();

        paypal_transaction.setEmail("abc@gmail.com");

        stripe_transaction.setCardName("Card");
        stripe_transaction.setCardNumber(123456789);
        stripe_transaction.setExpDate(10042023);

        square_transaction.setLocation_id(13);

        ArrayList<Object> gateways = new ArrayList<Object>();
        gateways.add(paypal_transaction);
        gateways.add(stripe_transaction);
        gateways.add(square_transaction);

        PaymentAdapter adapter = new PaymentAdapter();

        for (Object gateway : gateways) {
            adapter.makeTransaction(gateway.getClass().toString(), 100);
        }
    }
}
