public interface PaypelInterface {

    void makePaypalTransaction(float amount);

    String getEmail();

    void setEmail(String email);
}
