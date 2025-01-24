package TicTacToe;

import java.util.Arrays;

public class TicTacToe
{
    // Declare 2D array to store an empty board
    // and other required variables

    private String[][] board = new String[3][3];
    private int turn;

    // Add constructor to initialize an empty board

    public TicTacToe()
    {
        for(int row = 0; row < board.length; row++)
        {
            Arrays.fill(board[row], "-");
        }
        turn = 0;
    }

    // Add getter for 2D array

    public String[][] getBoard()
    {
        return board;
    }

    public int getTurn()
    {
        return turn;
    }

    /* Pick a location(row, col)
     This should return a boolean that indicates if the location is valid
     A valid location is whether the array bounds, and the location does not already
     contain an X or O
     */

    public boolean validateLocation(int row, int col)
    {
        if(!(row < board.length && col < board[row].length))
        {
            return false;
        }

        return board[row][col].equals("-");
    }

    /* Take turn(row, col)
       Add the appropriate symbol(X or O) to the location selected
       Update the current players turn
     */

    public void takeTurn(int row, int col)
    {
        if(validateLocation(row, col))
        {
            if(turn % 2 != 0)
            {
                board[row][col] = "O";
            }
            else
            {
                board[row][col] = "X";
            }

            turn++;
        }
    }

    /* Check columns
       This should return a boolean for if any column contains three consecutive X's or O's
     */

    public boolean checkColumns()
    {
        for(int column = 0; column < board[0].length; column++)
        {
            boolean thisColumn = board[0][column].equals(board[1][column]) &&
                                board[0][column].equals(board[2][column]);

            if(thisColumn && !board[0][column].equals("-"))
            {
                return true;
            }
        }

        return false;
    }

    /* Check rows
       This should return a boolean for if any rows contains three consecutive X's or O's
     */

    public boolean checkRows()
    {
        for(int row = 0; row < board.length; row++)
        {
            boolean thisRow = board[row][0].equals(board[row][1]) &&
                                board[row][0].equals(board[row][2]);

            if(thisRow && !board[row][0].equals("-"))
            {
                return true;
            }
        }

        return false;
    }

     /* Check Diagonals
       This should return a boolean for if any diagonal contains three consecutive X's or O's
     */

    public boolean checkDiagonals()
    {
        boolean diagOne = board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]);
        boolean diagTwo = board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]);
        boolean center = board[1][1].equals("-");

        return (diagOne || diagTwo) && !center;
    }

     /* Check wins
       This should return a boolean if the other 3 methods return true
     */

    public boolean checkWin()
    {

        if(turn >= 9)
        {
            System.out.println("Tie");
            return true;
        }

        return checkColumns() || checkDiagonals() || checkRows();
    }
}
