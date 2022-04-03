import java.util.Scanner;

public class Game {
    private static int PLAYERS_NUMBER;
    private Player[] playersArray;

    public void playerGenerator(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число игроков: ");
        PLAYERS_NUMBER = input.nextInt();
        playersArray = new Player [PLAYERS_NUMBER];

        for (int i = 0; i < PLAYERS_NUMBER; i++) {
            Scanner nameInput = new Scanner(System.in);
            System.out.printf("Введите имя %d-го игрока: ", i + 1);
            String playerName = nameInput.nextLine();
            playersArray[i] = new Player(playerName, 500);
        }
    }

    public void printPlayersNames() {
        System.out.print("Вот их имена: ");
        for (Player player:
             playersArray) {
            System.out.print(player.getPlayerName() + " ");
        }
        System.out.println();
    }

    public Player[] getPlayersArray() {
        return playersArray;
    }
    public Player getPlayer (int number) {
        return playersArray[number];
    }
}