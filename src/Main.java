public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);

        int playerScore = 1500;
        String playerName = "Broncos47JL";
        int scorePosition = calculateHighScore (playerScore);
        displayHighScorePosition (playerName, scorePosition);

        playerScore = 900;
        playerName = "OnslaughtE69";
        scorePosition = calculateHighScore(playerScore);
        displayHighScorePosition(playerName, scorePosition);

        playerScore = 400;
        playerName = "Starlord";
        scorePosition = calculateHighScore(playerScore);
        displayHighScorePosition(playerName, scorePosition);

        playerScore = 50;
        playerName = "PointBlank";
        scorePosition = calculateHighScore(playerScore);
        displayHighScorePosition(playerName, scorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
            int finalScore = -1;
            return finalScore;
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
            int finalScore = -1;
            return finalScore;
        } else if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus) + 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else {
            System.out.println("Got em!");
            int finalScore = -1;
            return finalScore;
        }
    }

    public static int calculateHighScore(int playerScore) {
        int scorePosition  = 0;
        if (playerScore >= 1000) {
            scorePosition += 1;
            return scorePosition;
        } else if (playerScore >= 500) {
            scorePosition += 2;
            return scorePosition;
        } else if (playerScore >= 100) {
            scorePosition += 3;
            return scorePosition;
        } else {
            scorePosition += 4;
            return scorePosition;
        }
    }

    public static void displayHighScorePosition (String playerName, int scorePosition) {
        System.out.println(playerName + " managed to get into position " + scorePosition + " on the high score table.");
    }
}

