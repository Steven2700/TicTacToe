package tictactoegame;

/**
 * Author: Steven Navarrete
 * Description: This class simulates a board on which two players
 * can play the game Tic Tac Toe on.  The board itself consists of three rows
 * and three columns which hold char values of either ' ', 'X' or 'O'.
 */
public class Board {
    // Private data fields and constants
    private char[][] board;
    private final int ROWS = 3, COLUMNS = 3;
    
    /**
     * Board class no-arg constructor, sets up an empty board.
     */
    public Board() {
        board = new char[ROWS][COLUMNS];
    }
    /**
      Board class constructor overload.  This constructor will
      set up a board with the array of characters that is
      passed to it by reference.
      @param newBoard 
     */
    public Board(char[][] newBoard) {
        if(newBoard.length == ROWS && newBoard[0].length == COLUMNS) {
            board = newBoard;
        }
        else {
            board = new char[ROWS][COLUMNS];
        }
    }
    /**
     * clearBoard() method "resets" the board back to all empty spaces.
     */
    public void clearBoard() {
        for(int i = 0; i < ROWS; i++) {
            for(int j = 0; j < COLUMNS; j++) {
                board[i][j] = ' ';
            }
        }
    }
    /**
     * placeMark() method places the given mark on the specified row and column,
     * but only if that space is empty (does not contain another mark).
     * @param mark
     * @param row
     * @param column 
     */
    public void placeMark(char mark, int row, int column) {
        if(row >= 0 && row <= 2 && column >= 0 && column <= 2 && board[row][column] == ' ') {
            board[row][column] = mark;
        }
    }
    /**
     * getMark() returns the mark at the specified row and column.
     * @param row
     * @param column
     * @return boolean
     */
    public char getMark(int row, int column) {
        return board[row][column];
    }
    /**
     * isFull() returns a boolean value of true if the board is full (contains
     * no empty spaces), and returns a boolean value of false otherwise.
     */
    public boolean isFull() {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == ' ')
                    return false;
            }
        }
        return true;
    }
    /**
     * hasWon() "checks to see" if the board contains three of the specified 
     * mark on any row, column or left or right diagonal line on the board.  
     * If the board contains three of the specified marks on one of those
     * lines, the method returns a boolean value of true, signifying that the
     * player with the specified mark has won the round.
     * @param mark
     * @return boolean
     */
    public boolean hasWon(char mark) {
        // Left to right diagonal
        if(board[0][0] == mark && board[1][1] == mark && board[2][2] == mark)
            return true;
        // Right to left diagonal
        else if(board[0][2] == mark && board[1][1] == mark && board[2][0] == mark)
            return true;
        // Row 0
        else if(board[0][0] == mark && board[0][1] == mark && board[0][2] == mark)
            return true;
        // Row 1
        else if(board[1][0] == mark && board[1][1] == mark && board[1][2] == mark)
            return true;
        // Row 2
        else if(board[2][0] == mark && board[2][1] == mark && board[2][2] == mark)
            return true;
        // Column 0
        else if(board[0][0] == mark && board[1][0] == mark && board[2][0] == mark)
            return true;
        // Column 1
        else if(board[0][1] == mark && board[1][1] == mark && board[2][1] == mark)
            return true;
        // Column 2
        else if(board[0][2] == mark && board[1][2] == mark && board[2][2] == mark)
            return true;
        else 
            return false;
    }
    /**
     * drawBoard() draws the board with column and row headings as well as
     * any marks that have been placed.
     */
    public void drawBoard() {
        System.out.println("    0   1   2");
        System.out.println("  -------------");
        for(int i = 0; i < ROWS; i++) {
            System.out.print(i);
            for(int j = 0; j < COLUMNS; j++) {
                System.out.print(" | " + board[i][j]);
            }
            System.out.println(" |");
        }
        System.out.println("  -------------");
    }

    
}
