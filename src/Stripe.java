public class Stripe implements StripeInterface{
    private float payment_amount;
    private String card_holder_name;
    private int card_number;
    private int exp_date;

    @Override
    public void makeStripeTransaction(float amount) {
        payment_amount = amount;
        System.out.println("Sending $" + amount + " via stripe: ");
    }

    @Override
    public String getCardName() {
        return card_holder_name;
    }

    @Override
    public void setCardName(String name) {
        card_holder_name = name;
    }

    @Override
    public int getCardNumber() {
        return card_number;
    }

    @Override
    public void setCardNumber(int number) {
        card_number = number;
    }

    @Override
    public int getExpDate() {
        return exp_date;
    }

    @Override
    public void setExpDate(int date) {
        exp_date = date;
    }
}
