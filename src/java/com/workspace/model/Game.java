package com.workspace.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private static int PLAYERS_NUMBER;

    private List<Player> players;

    public static List<Payment> paymentsHistory = new ArrayList<>();

    public void playerGenerator() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число игроков: ");
        PLAYERS_NUMBER = input.nextInt();
        players = new ArrayList<>();

        for (int i = 0; i < PLAYERS_NUMBER; i++) {
            Scanner nameInput = new Scanner(System.in);
            System.out.printf("Введите имя %d-го игрока: ", i + 1);
            String playerName = nameInput.nextLine();
            players.add(new Player(PlayerType.Player, playerName, 500L));
        }
    }

    public void printPlayersNames() {
        System.out.print("Вот их имена: ");
        for (Player player : players) {
            System.out.print(player.getName() + " ");
        }
        System.out.println();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Player getPlayer(int number) {
        return players.get(number);
    }
}
