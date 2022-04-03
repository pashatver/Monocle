public class Monocle {
    public static void main(String[] args) {
        System.out.println("Вас приветствует калькулятор для Монополии \"Монокль\"!");
        Game game = new Game();
        Bank bank = new Bank();
        game.playerGenerator();
        System.out.println("Число игроков на данный момент: " + Player.ID_COUNTER);
        game.printPlayersNames();
        Transacitons.payment(game.getPlayer(1), game.getPlayer(0), 100);
        Transacitons.payment(bank, game.getPlayer(2), 300);
    }
}