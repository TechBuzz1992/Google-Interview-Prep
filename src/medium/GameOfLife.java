package medium;

//import java.util.*;

public class GameOfLife {
    public static void main(String[] args) {

    }

    public void gameOfLife(int[][] board) {
        for (int i = 1; i < board.length - 1; i++) {
            for (int j = 1; i < board[i].length - 1; j++) {
                int live = 0;
                for (int l = -1; l <= 1; l++) {
                    for (int m = -1; m <= 1; m++) {
                        live += board[i + l][j + m];
                    }
                }

                live -= board[i][j];

                if (board[i][j] == 1 && live < 2) {
                    board[i][j] = 0;
                } else if (board[i][j] == 1 && live > 3) {
                    board[i][j] = 0;
                } else if (board[i][j] == 0 && live == 3) {
                    board[i][j] = 1;
                }

            }
        }

        return;
    }

}