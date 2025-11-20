import java.util.Random;

public class Dice {

    void main() {

        playDiceGame();
    }

    public static int rollDice(int sides) {

        Random rand = new Random();
        return rand.nextInt(sides) + 1;
    }

    public static int playerRoll(int gold) {

        int dice1 = rollDice(6);
        int dice2 = rollDice(6);
        int totalRoll = dice1 + dice2;
        IO.println("La suma de los dados es: " + totalRoll);
        switch (totalRoll) {
            case 2 -> gold += 50;
            case 3 -> gold -= 10;
            case 4 -> gold -= 20;
            case 5 -> gold += 18;
            case 6 -> gold -= 50;
            case 8 -> gold += 70;
            case 9 -> gold -= 80;
            case 10 -> gold += 60;
            case 11 -> gold -= 30;
            case 12 -> gold += 15;
        }
        return gold;
    }

    public static void playDiceGame() {

        int currentGold = 100;
        boolean gameOver = false;
        while (!gameOver) {
            currentGold = playerRoll(currentGold);
            IO.println("El oro actual es: " + currentGold);
            int continueGame = Integer.parseInt(IO.readln("¿Desea tirar los dados de nuevo? (1 para sí, 0 para no): "));
            if (continueGame != 1) {
                gameOver = true;
                IO.println("Juego terminado. Oro final: " + currentGold);
            }
        }
    }
}
