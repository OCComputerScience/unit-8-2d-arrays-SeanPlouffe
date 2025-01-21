package TicTacToe;

public class Main
{
    public static void main(String[] args)
    {
        TicTacToe board = new TicTacToe();

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
