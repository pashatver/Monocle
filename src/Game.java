import java.util.Scanner;

public class Game {
    private static int PLAYERS_NUMBER;
    public void playerGenerator(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число игроков: ");
        PLAYERS_NUMBER = input.nextInt();
        Player[] playersArray = new Player [PLAYERS_NUMBER];
        for (int i = 0; i < PLAYERS_NUMBER; i++) {
            Scanner nameInput = new Scanner(System.in);
            System.out.println("Введите имя игрока: ");
            String playerName = nameInput.nextLine();
            playersArray[i] = new Player(playerName, 500);
        }
    }
}