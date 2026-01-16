public class TicTacToeChallenge {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (char[] row : board) {
            for (char box : row) {
                int num = (Math.random() <= 0.5) ? 1 : 2;
                if (num > 1) {
                    box = 'X';
                } else {
                    box = 'O';
                }
            }
        }
        
    }
}
