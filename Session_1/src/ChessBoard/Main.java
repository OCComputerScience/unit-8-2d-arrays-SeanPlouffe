package ChessBoard;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Chessboard board = new Chessboard();

        board.fillBoard();

        print(board.getChessBoard());
        System.out.println();

        int pieceRow = 0, pieceCol = 0, spotRow = 0, spotCol = 0;

        while(pieceRow != -1 && pieceCol != -1 && spotRow != -1 && spotCol != -1)
        {

            System.out.println("Input piece row");
            pieceRow = input.nextInt();

            System.out.println("Input piece column");
            pieceCol = input.nextInt();

            System.out.println("Input new row");
            spotRow = input.nextInt();

            System.out.println("Input new column");
            spotCol = input.nextInt();

            board.movePiece(pieceRow, pieceCol, spotRow, spotCol);

            print(board.getChessBoard());
            System.out.println();

        }

    }

    //Do not make alterations to this method!
    public static void print(String[][] array)
    {
        for(String[] row: array)
        {
            for(String thing: row)
            {
                System.out.print(thing + "\t");
            }
            System.out.println();
        }
    }
}
