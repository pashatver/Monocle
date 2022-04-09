package com.workspace.service

import com.workspace.model.Game
import com.workspace.model.Payment
import com.workspace.model.Player

class KotlinClass {

    fun pay(payer: Player, receiver: Player, sum: Long): Boolean {
        if (payer.money - sum < 0) {
            println("У игрока " + payer.name + " недостаточно средств!")
        } else {
            payer.acceptPayment(sum)

            Game.paymentsHistory
                .filter { payment: Payment -> payment.payer.name == "Ruslan" }
                .sumOf { payment -> payment.amount }

            receiver.money = receiver.money + sum
            println("Игрок " + payer.name + " заплатил " + sum + " $ игроку " + receiver.name)
            println("Баланс игрока " + payer.name + ": " + payer.money)
            println("Баланс игрока " + receiver.name + ": " + receiver.money)
        }

        return true
    }

    fun Player.acceptPayment(money: Long) {
        this.money += money
    }

    fun Player.getPayment(money: Int) {
        this.money -= money
    }

}
