/* 4) NQueens
      Place N Queens on NxN chess board such that no 2 Queens attack each other */
import java.util.Scanner;
public class LQ4
{
    public static boolean checkSafe(char chessBoard[][], int row, int col)
    {
        // Vertically Up
        for (int i = row - 1; i >= 0; i--)
        {
            if (chessBoard[i][col] == 'Q')
            {
                return false;
            }
        }
        // diagnolly left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
        {
            if (chessBoard[i][j] == 'Q')
            {
                return false;
            }
        }
        // diagnolly right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < chessBoard.length; i--, j++)
        {
            if (chessBoard[i][j] == 'Q')
            {
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char chessBoard[][], int row)
    {
        if (row == chessBoard.length)
        {
            printBoard(chessBoard);
            return;
        }
        for (int j = 0; j < chessBoard.length; j++)
        {
            if (checkSafe(chessBoard, row, j))
            {
                chessBoard[row][j] = 'Q';
                nQueens(chessBoard, row + 1);
                chessBoard[row][j] = 'x';
            }
        }
    }
    public static void printBoard(char chessBoard[][])
    {
        System.out.println();
        for (int i = 0; i < chessBoard.length; i++)
        {
            for (int j = 0; j < chessBoard.length; j++)
            {
                System.out.print(chessBoard[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char chessBoard[][] = new char [n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                chessBoard[i][j] = 'x';
            }
        }
        nQueens(chessBoard, 0);
    }
}
