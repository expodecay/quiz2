public class Paypal implements PaypelInterface{
    private float payment_amount;
    private String user_email;

    @Override
    public void makePaypalTransaction(float amount) {
        payment_amount = amount;
        System.out.println("Sending $" +  amount + " via paypal ");
    }

    @Override
    public String getEmail() {
        return user_email;
    }

    @Override
    public void setEmail(String email) {
        user_email = email;
    }
}
