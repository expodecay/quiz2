public interface StripeInterface{

    void makeStripeTransaction(float amount);

    String getCardName();

    void setCardName(String name);

    int getCardNumber();

    void setCardNumber(int number);

    int getExpDate();

    void setExpDate(int date);
}
