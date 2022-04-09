package java.service;

import java.model.History;
import java.model.Payment;
import java.model.Player;

public class PaymentService {
    public static String pay (Player payer, Player receiver, Long sum) {
        if (payer.getMoney() - sum < 0) {
            return ("У игрока " + payer.getName() + " недостаточно средств!");
        } else {
            final Payment newPayment = new Payment(payer, receiver, sum);
            History.paymentsHistory.add(newPayment);
            payer.setMoney(payer.getMoney() - sum);
            receiver.setMoney(receiver.getMoney() + sum);
            return ("Игрок " + payer.getName() + " заплатил " + sum + " $ игроку " + receiver.getName());
        }
    }
}