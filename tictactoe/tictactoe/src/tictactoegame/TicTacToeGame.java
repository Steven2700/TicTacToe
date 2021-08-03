/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoegame;

import java.util.Scanner;

/**
 *
 * @author Steven Navarrete
 */
public class TicTacToeGame {

    
    
    public static void main(String[] args) {
        
         
        char X = 'X';
        char O = 'O';
        int gameCount = 0;
        int drawCount = 0;
        int row;
        int column;
        char playAgain;
        
        Board board = new Board();
        Player P1 = new Player();
        Player P2 = new Player();
        
        board.clearBoard();
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Welcome to TicTacToe, what is your Player name?");
        P1.setName(input.nextLine());
        
        System.out.println("Now what is the name of Player 2? ");
        P2.setName(input.nextLine());
        
        System.out.println("Now " + P1.getName() + " choose 'X' or 'O' as your mark (upper case ONLY)");
        
        char mark = input.next().charAt(0);
        P1.setMark(mark);
        
        if (P1.getMark() == 'X') {
            P2.setMark('O');
        } else { 
            P2.setMark('X');
                    
        }
        
        System.out.println(P1.toString());
        System.out.println(P2.toString());
        
        board.drawBoard();
        
        while(board.hasWon(P1.getMark()) == false && board.hasWon(P2.getMark()) == false ){
             
            
        System.out.println("Now " + P1.getName() +  " enter the row and column you wish to place your mark");
        row = input.nextInt();
        column = input.nextInt();
        
        board.placeMark( P1.getMark(),row ,column);
        board.drawBoard();
        
        if (board.hasWon(P1.getMark()) == true ) {
            System.out.println("Congrats! " + P1.getName() + " you have won!" );
            P1.wins();
            P1.getWins();
            P2.getWins();
            P2.losses();
            P2.getLosses();
            
            System.out.println(P1.toString());
            System.out.println(P2.toString());
            gameCount++;
            System.out.println("games played: " + gameCount);
            System.out.println("Cat's Games: " + drawCount);
            System.out.println("Do you wish"
                    + " to play again? Y/N");
            playAgain = input.next().charAt(0);
            
            if (playAgain == 'Y') {
            
            board.clearBoard();
            board.drawBoard();
            board.clearBoard();
            }else{
                break;
            
        }
        }
        
            if (board.isFull() == true) {
                System.out.println("It's a draw");
                drawCount++;
                System.out.println(P1.toString());
                System.out.println(P2.toString());
                System.out.println("Cat's Games: " + drawCount);
                System.out.println("Do you want to play again? Y/N ");
                input.nextLine();
                playAgain = input.next().charAt(0);
                if (playAgain == 'Y') {
                    board.clearBoard();
                    board.drawBoard();
                    gameCount++;
                } else {
                    System.out.println(P1.toString());
                    System.out.println(P2.toString());
                    System.out.println("Cat's Games: " + drawCount);
                    System.out.println("Games Played : " + gameCount);
                    break;
                }
            }
        
        System.out.println("Now " + P2.getName() + " enter the row and column you wish to place your mark ");
        row = input.nextInt();
        column = input.nextInt();
        
        board.placeMark(P2.getMark(), row, column);
        board.drawBoard();
        
        if (board.hasWon(P2.getMark()) == true ) {
            System.out.println("Congrats! " + P2.getName() + " you have won!");
            P2.wins();
            P2.getWins();
            P1.getWins();
            P1.losses();
            P1.getLosses();
            System.out.println(P1.toString());
            System.out.println(P2.toString());
            gameCount++;
            System.out.println("games played: " + gameCount);
            System.out.println("Cat's Games: " + drawCount);
            System.out.println("Do you wish to play again? Y/N");
            playAgain = input.next().charAt(0);
            if (playAgain == 'Y') {
            board.clearBoard();
            board.drawBoard();
            board.clearBoard();
            }else{ 
                break;
            
        }
            
    
        }
        if (board.isFull() == true) {
                System.out.println("It's a draw");
                drawCount++;
                System.out.println(P1.toString());
                System.out.println(P2.toString());
                System.out.println("Cat's Games: " + drawCount);
                System.out.println("Do you want to play again? Y/N ");
                input.nextLine();
                playAgain = input.next().charAt(0);
                if (playAgain == 'Y') {
                    board.clearBoard();
                    board.drawBoard();
                    gameCount++;
                } else {
                    System.out.println(P1.toString());
                    System.out.println(P2.toString());
                    System.out.println("Cat's Games: " + drawCount);
                    System.out.println("Games Played : " + gameCount);
                    break;
                }
            }
        
        
        
        }
        
        
        }
        
    }

    

