public interface PaypelInterface {

    void makePaypalTransaction(int amount);

    String getEmail();

    void setEmail(String email);
}
