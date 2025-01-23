package ChessBoard;

import java.util.Arrays;

public class Chessboard
{

    private String[][] chessBoard = new String[8][8];
    private final String emptySpace = "----";
    private final String pawn = "Pawn";
    private final String[] endRows = {"Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight", "Rook"};

    public void fillBoard()
    {
        chessBoard[0] = endRows;
        chessBoard[chessBoard.length-1] = endRows;
        Arrays.fill(chessBoard[1], pawn);
        Arrays.fill(chessBoard[chessBoard.length-2], pawn);

        for(int i = 2; i < chessBoard.length-2; i++)
        {
            Arrays.fill(chessBoard[i], emptySpace);
        }
    }

    public void movePiece(int startRow, int startCol, int endRow, int endCol)
    {

        boolean validCoord = startRow >= 0 && startCol >= 0 && endRow >= 0 && endCol >= 0;

        if(validCoord && isPiece(startRow, startCol) && isEmptySpace(endRow, endCol))
        {

            String temp = chessBoard[startRow][startCol];

            chessBoard[startRow][startCol] = chessBoard[endRow][endCol];

            chessBoard[endRow][endCol] = temp;

        }
        else
        {
            System.out.println("Invalid start location or invalid end location");
        }

    }

    public boolean isPiece(int row, int col)
    {
        return !chessBoard[row][col].equals(emptySpace);
    }

    public boolean isEmptySpace(int row, int col)
    {
        return chessBoard[row][col].equals(emptySpace);
    }

    public String[][] getChessBoard() {
        return chessBoard;
    }
}
