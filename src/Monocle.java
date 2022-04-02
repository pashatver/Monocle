public class Monocle {
    public static void main(String[] args) {
        System.out.println("Вас приветствует калькулятор для Монополии \"Монокль\"!");
        Game game = new Game();
        game.playerGenerator();
        System.out.println("Число игроков на данный момент: " + Player.ID_COUNTER);
    }
}