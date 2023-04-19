public class Square {
    private float payment_amount;
    private int location_id;

    public void makeSquareTransaction(float amount) {
        payment_amount = amount;
        System.out.println("Sending $" +  amount + " via square: ");
    }
    int getLocation_id(){
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }
}
