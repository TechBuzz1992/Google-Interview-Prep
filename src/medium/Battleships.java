package medium;

public class Battleships {
    public static void main(String[] args) {

    }

    public int countBattleShips(char[][] board) {
        if (board == null || board.length == 0) {
            return 0;
        }

        int battleShips = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {
                    battleShips++;
                    sink(board, i, j);
                }
            }
        }

        return battleShips;
    }

    public void sink(char[][] board, int i, int j) {
        if(i<0|| i>=board.length||j<0||j>=board[i].length || board[i][j]!='X'){
            return;
        }

        board[i][j] = '.';
        sink(board,i+1,j);
        sink(board,i-1,j);
        sink(board,i,j+1);
        sink(board,i,j-1);


    }

}