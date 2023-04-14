package ss8_clean_code_and_refactoring.baitap.refactoring;

public class TennisGame {
    
        private String score = "";
        private int tempScore = 0;

    public String equalScore(String player1Name, String player2Name, int pointPlayer1, int pointPlayer2) {
        if (pointPlayer1 == pointPlayer2) {
            switch (pointPlayer1) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        }
        return score;
    }

    public String scoreThanFour(String player1Name, String player2Name, int pointPlayer1, int pointPlayer2) {
        if (pointPlayer1 >= 4 || pointPlayer2 >= 4) {
            int minusResult = pointPlayer1 - pointPlayer2;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        }
        return score;
    }

        public String scoreOneToThree(String player1Name, String player2Name, int pointPlayer1, int pointPlayer2){
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = pointPlayer1;
                else {
                    score += "-";
                    tempScore = pointPlayer2;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        return score;
    }

    public String gameOn(String playerName1, String playerName2, int score1, int score2){
        String equalPoint = equalScore(playerName1, playerName2, score1, score2);
        String pointOnetoThree = scoreOneToThree(playerName1, playerName2, score1, score2);
        String pointThanFour = scoreThanFour(playerName1, playerName2, score1, score2);

        if (score1 == score2){
            return equalPoint;
        } else if (score1 >= 4 && score2 >= 4 ){
           return pointThanFour;
        } else {
            return pointOnetoThree;
        }
    }
}
