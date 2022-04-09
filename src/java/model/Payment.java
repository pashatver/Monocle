package java.model;

public class Payment {
    private final Player payer;
    private final Player receiver;
    private final Long amount;

    public Payment(Player payer, Player receiver, Long amount) {
        this.payer = payer;
        this.receiver = receiver;
        this.amount = amount;
    }

    public Player getPayer() {
        return payer;
    }

    public Player getReceiver() {
        return receiver;
    }

    public Long getAmount() {
        return amount;
    }
}
