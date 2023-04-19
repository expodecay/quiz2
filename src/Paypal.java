public class Paypal implements PaypelInterface{
    private int payment_amount;
    private String user_email;

    @Override
    public void makePaypalTransaction(int amount) {
        payment_amount = amount;
        System.out.println("Sending amount:" + payment_amount);
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
