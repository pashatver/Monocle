public class Transacitons {
    public static void payment(Player donor, Player acceptor, int sum) {
        donor.setPlayerMoney(donor.getPlayerMoney() - sum);
        acceptor.setPlayerMoney(acceptor.getPlayerMoney() + sum);

        System.out.println("Игрок " + donor.getPlayerName() + " заплатил " + sum + " $ игроку " + acceptor.getPlayerName() );
        System.out.println("Баланс игрока " + donor.getPlayerName() + ": " + donor.getPlayerMoney() );
        System.out.println("Баланс игрока " + acceptor.getPlayerName() + ": " + acceptor.getPlayerMoney() );
    }
    public static void payment(Player donor, Bank acceptor, int sum) {
        donor.getPayment(sum);
        acceptor.acceptPayment(sum);

        System.out.println("Игрок " + donor.getPlayerName() + " заплатил " + sum + " Банку.");
        System.out.println("Баланс игрока " + donor.getPlayerName() + ": " + donor.getPlayerMoney() );
    }

    public static void payment(Bank donor, Player acceptor, int sum) {
        donor.getPayment(sum);
        acceptor.acceptPayment(sum);

        System.out.println("Банк заплатил игроку " + acceptor.getPlayerName() + " " + sum + "$.");
        System.out.println("Баланс игрока " + acceptor.getPlayerName() + ": " + acceptor.getPlayerMoney() );
    }
}
