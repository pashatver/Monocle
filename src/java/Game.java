package java;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private static int PLAYERS_NUMBER;
    private ArrayList<Player> playersList;

    public void playerGenerator(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число игроков: ");
        PLAYERS_NUMBER = input.nextInt();
        playersList = new ArrayList<>();

        for (int i = 0; i < PLAYERS_NUMBER; i++) {
            Scanner nameInput = new Scanner(System.in);
            System.out.printf("Введите имя %d-го игрока: ", i + 1);
            String playerName = nameInput.nextLine();
            playersList.add(new Player(playerName, 500));
        }
    }

    public void printPlayersNames() {
        System.out.print("Вот их имена: ");
        for (Player player:
                playersList) {
            System.out.print(player.getPlayerName() + " ");
        }
        System.out.println();
    }

    public ArrayList<Player> getPlayersList() {
        return playersList;
    }

    public Player getPlayer (int number) {
        return playersList.get(number);
    }
}