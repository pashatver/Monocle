package com.workspace.service;

import com.workspace.model.Game;
import com.workspace.model.Payment;
import com.workspace.model.Player;

public class PaymentService {

    public static void pay(Player payer, Player receiver, Long sum) {
        if (payer.getMoney() - sum < 0) {
            System.out.println("У игрока " + payer.getName() + " недостаточно средств!");
        } else {
            final Payment newPayment = new Payment(payer, receiver, sum);
            Game.paymentsHistory.add(newPayment);

            payer.setMoney(payer.getMoney() - sum);
            receiver.setMoney(receiver.getMoney() + sum);

            System.out.println("Игрок " + payer.getName() + " заплатил " + sum + " $ игроку " + receiver.getName());
            System.out.println("Баланс игрока " + payer.getName() + ": " + payer.getMoney());
            System.out.println("Баланс игрока " + receiver.getName() + ": " + receiver.getMoney());
        }
    }
}
