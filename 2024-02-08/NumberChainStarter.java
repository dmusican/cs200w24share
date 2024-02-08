public class NumberChainStarter
{
    public static final int SIZE=9;

    // Copy a board
    public static int[][] copyBoard(int[][] board)
    {
        int[][] copy = new int[SIZE][SIZE];
        for (int i=0; i < SIZE; i++) {
            for (int j=0; j < SIZE; j++) {
                copy[i][j] = board[i][j];
            }
        }
        return copy;
    }

    // Display a board
    public static void displayBoard(int[][] board)
    {
        for (int i=0; i < SIZE; i++) {
            for (int j=0; j < SIZE; j++) {
                // System.out.printf("%2d   ", board[i][j]);
                System.out.print(" " + board[i][j]) ;
            }
            System.out.println();
        }
        System.out.println();
    }


    // completeBoard takes a board, and a location for the most recently filled
    // in value. Tries to (recursively) complete from there. Returns null if it
    // can't; returns the board itself if the board is full.
    public static int[][] completeBoard(int[][] board, int row, int col)
    {
        // failed to find solution
        return null;
    }

    public static void main(String[] args)
    {
        int[][] board = new int[SIZE][SIZE];
        board[1][2] = 46;
        board[1][3] = 45;
        board[1][5] = 55;
        board[1][6] = 74;
        board[2][1] = 38;
        board[2][4] = 43;
        board[2][7] = 78;
        board[3][1] = 35;
        board[3][7] = 71;
        board[4][2] = 33;
        board[4][6] = 59;
        board[5][1] = 17;
        board[5][7] = 67;
        board[6][1] = 18;
        board[6][7] = 64;
        board[7][2] = 24;
        board[7][3] = 21;
        board[7][5] = 1;
        board[7][6] = 2;
        displayBoard(board);
        int[][] result = completeBoard(board, 7, 5);

        if (result != null) {
            displayBoard(result);
        } else {
            System.out.println("Failed to find solution.");
        }
    }
}
