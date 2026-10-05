package Backtracking13;

public class Nqueen4 {
    public static void NQueen(char board[][], int row) {
        // base
        if (row == board.length) {
            printboard(board);
            return;
        }
        // column loop
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';
                NQueen(board, row + 1);
                // backtrack
                board[row][i] = 'X';
            }
        }
    }
    public static boolean isSafe(char board[][], int row, int col) {
        // check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // left upper diagonal
        for (int i = row - 1, j = col - 1;i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // right upper diagonal
        for (int i = row - 1, j = col + 1;i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static void printboard(char board[][]) {
        System.out.println("------ chess board -------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        // initialize board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
        }
        NQueen(board, 0);
    }
}