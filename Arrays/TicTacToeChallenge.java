
import java.util.Arrays;

public class TicTacToeChallenge {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        int i = 0;
        int j = 0;
        for (char[] row : board) {
            for (char box : row) {
                int num = (Math.random() <= 0.5) ? 1 : 2;
                if (num > 1) {
                    board[i][j] = 'X';
                } else {
                    board[i][j] = 'O';
                }
                j++;
                if (j > 2) {
                    j = 0;
                }
            }
            i++;
            if (i > 2) {
                i = 0;
            }
        }
        System.out.println(Arrays.deepToString(board).replace("], ", "]\n"));
        if (board[0][0] == board[0][1] && board[0][1] == board[0][2]) {
            System.out.println(board[0][0] + " Wins");
        } else if (board[1][0] == board[1][1] && board[1][1] == board[1][2]) {
            System.out.println(board[1][0] + " Wins");
        } else if (board[2][0] == board[2][1] && board[2][1] == board[2][2]) {
            System.out.println(board[2][0] + " Wins");
        } else if (board[0][0] == board[1][0] && board[1][0] == board[2][0]) {
            System.out.println(board[0][0] + " Wins");
        } else if (board[0][1] == board[1][1] && board[1][1] == board[2][1]) {
            System.out.println(board[0][1] + " Wins");
        } else if (board[0][2] == board[1][2] && board[1][2] == board[2][2]) {
            System.out.println(board[0][2] + " Wins");
        } else if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            System.out.println(board[0][0] + " Wins");
        } else if (board[2][0] == board[1][1] && board[1][1] == board[0][2]) {
            System.out.println(board[2][0] + " Wins");
        } else {
            System.out.println("Draw");
        }

    }
}
