public class Bank {
    private int bankMoney;
    private int incomingPay = 0;
    private int outcomingPay = 0;

    public void acceptPayment(int money) {
        incomingPay += money;
    }
    public void getPayment (int money) {
        outcomingPay -= money;
    }
}