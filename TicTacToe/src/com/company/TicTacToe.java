package com.company;

import java.util.Scanner;

public class TicTacToe {

    private int ROWS = 3;
    private int COLS = 3;
    boolean win;


    public enum Player {
        Unknown,
        X,
        O
    }

    public Player[][] board;
    private Player currentPlayer;
    private Player winner;

    public TicTacToe() {
        board = new Player [ROWS][COLS];
    }

    public void initialiazeBoard() {
        for (int i= 0; i < ROWS; i++){
            for (int j = 0; j < COLS; j++){
                board [i][j] = Player.Unknown;
            }
        }

    }


    public boolean isGameWon() {

        return win;
    }

    public boolean isDraw() {

        return false;
    }

    public Player getWinner() {

        return null;
    }

    public boolean isGameOver() {

        return false;
    }

    public void play(int row, int col) {
    }

    public Player getCurrentPlayer() {

        return null;
    }

    public String printBoard(){
        String strBoard = "";
        for (int i= 0; i<ROWS;i++){
            for (int j=0;j<COLS;j++){
                if (j !=COLS-1)
                    strBoard += board[i][j] + "|";
                else
                    strBoard += board[i][j];
            }
            strBoard += "\n---+---+---\n";
        }
        return strBoard;
    }





    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        game.initialiazeBoard();
        do {
            System.out.println("Player 1 beginnt mit X");
            System.out.println("gebe die Zeile an");
            int row = scan.nextInt();
            System.out.println("gebe die Spalte an");
            int col = scan.nextInt();

            System.out.println(game.printBoard());



        }
        while (true);








    }









}
