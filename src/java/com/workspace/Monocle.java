package com.workspace;

import com.workspace.model.Bank;
import com.workspace.model.Game;

public class Monocle {
    public static void main(String[] args) {
        System.out.println("Вас приветствует калькулятор для Монополии \"Монокль\"!");
        Game game = new Game();
        game.playerGenerator();
        System.out.println("Число игроков на данный момент: " + Context.getLastPlayerId());
        game.printPlayersNames();
        Transaction.payment(game.getPlayer(1), game.getPlayer(0), 600);
        Transaction.payment(bank, game.getPlayer(1), 300);
    }
}
