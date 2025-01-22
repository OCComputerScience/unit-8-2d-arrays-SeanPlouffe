package TicTacToe;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        TicTacToe board = new TicTacToe();

        while(!board.checkWin())
        {
            System.out.println("Turn " + board.getTurn());

            System.out.println("Row 1, 2, or 3?");
            int row = input.nextInt() - 1;

            System.out.println("Column 1, 2, or 3?");
            int column = input.nextInt() - 1;

            board.takeTurn(row, column);

            printBoard(board.getBoard());
        }

    }

    public static void printBoard(String[][] array)
    {
        for(String[] row: array)
        {
            for(String play: row)
            {
                System.out.print(play + " ");
            }
            System.out.println();
        }
    }
}
