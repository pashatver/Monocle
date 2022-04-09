package java.model;

import java.service.Context;
import java.util.ArrayList;

public class Game {
    private ArrayList<Player> playersList;

    public Game() {
        playersList = new ArrayList<>();
        playersList.add(new Player("Bank", 0L, Context.newPlayerID(), PlayerType.Bank));
    }

    public String playerGenerator(String playerName) {
        if (!playerName.isEmpty() && !playerName.startsWith(" ")) {
            playersList.add(new Player(playerName, 1500L, Context.newPlayerID(), PlayerType.Player));
            return ("Добавлен игрок" + playerName);
        } else {
            return ("Недопустимое имя!");
        }
    }
    public ArrayList<Player> getPlayersList() {
        return playersList;
    }
    public Player getPlayer (int number) {
        return playersList.get(number);
    }
}