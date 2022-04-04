package java;

import java.util.Objects;

public class Player {
    public static int ID_COUNTER = 0;
    private String playerName;
    private int playerMoney;
    private int playerID;

    public Player (String playerName, int playerMoney) {
        this.playerName = playerName;
        this.playerMoney = playerMoney;
        this.playerID = ID_COUNTER + 1;
        ID_COUNTER ++;
    }

    public String getPlayerName() {
        return playerName;
    }
    public int getPlayerMoney() {
        return playerMoney;
    }
    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public void setPlayerMoney(int playerMoney) {
        this.playerMoney = playerMoney;
    }
    public void setPlayerID(int playerID) {
        this.playerID = ID_COUNTER + 1;
        ID_COUNTER ++;
    }
    public void playerInfoPrinter () {
        System.out.println("Это игрок по имени " + playerName +
                ". У него на счёте " + playerMoney + "$. Его ID: " + playerID);
    }

    public void acceptPayment(int money) {
        playerMoney += money;
    }

    public void getPayment (int money) {
        playerMoney -= money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return playerMoney == player.playerMoney && playerID == player.playerID && Objects.equals(playerName, player.playerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerName, playerMoney, playerID);
    }
}