// accumulation, increment, decrement

class ScoreBoard {
    int playerXP = 0;
    int playerLevel = 0;
    int playerHealth = 0;
    String playerName;
    static String gameName = "game";

    public ScoreBoard(String user) {
        playerName = user;
    }

    void gainXP(int amount) {
        playerXP += amount;
    }

    void heal() {
        playerHealth += 50;
    }

    void damage() {
        playerHealth -= 10;
    }

    void levelUp() {
        playerLevel++;
    }

    void LevelDown() {
        playerLevel--;
    }

    static void name() {
        System.out.println("Game Name: " + gameName);
    }
}

public class Math2 {
    public static void main(String[] args) {

        ScoreBoard player1 = new ScoreBoard("John");

        player1.gainXP(1);
        player1.gainXP(2);
        player1.heal();
        player1.damage();
        player1.levelUp();
        player1.levelUp();
        player1.levelDown();

        ScoreBoard.name();
        System.out.println(player1.playerName + " XP: " + player1.playerXP);
        System.out.println(player1.playerName + " Health: " + player1.playerHealth);
        System.out.println(player1.playerName + " Level: " + player1.playerLevel);
    }
}