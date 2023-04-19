public class PaymentAdapter {

    public void makeTransaction(String gateway_type, float amount) {
        if (gateway_type.equals("class Paypal")) {
            Paypal gateway = new Paypal();
            gateway.makePaypalTransaction(amount);
        }

        if(gateway_type.equals("class Stripe")){
            Stripe gateway = new Stripe();
            gateway.makeStripeTransaction(amount);
        }

        if(gateway_type.equals("class Square")){
            Square gateqay = new Square();
            gateqay.makeSquareTransaction(amount);
        }
    }
}
