package java.service;

import java.model.Game;
import java.model.Player;

public class GameService {
    public String[] getPlayersNames (Game game) {
        String [] playersNames = new String[game.getPlayersList().size()];
        int i = 0;
        for (Player player:
             game.getPlayersList()) {
            playersNames[i] = player.getName();
        }
        return playersNames;
    }
}
