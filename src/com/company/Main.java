package com.company;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static String [] [] board = new String[8][8];


    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner();

        int playerBalence = 0;
        int rancoins = random.nextInt(100);


        System.out.println("what square would you like?: ");
        int playerGuess = scanner.nextInt();

        int x = random.nextInt(8);
        int y = random.nextInt(8);

    setUpBoard();
        printBoard();

    }

    private static void setUpBoard() {
        int x = random.nextInt(8);
        int y = random.nextInt(8);
        for (int x = 0; x <10; x++) {
            for (int y = 0; y<8; y++){
                board[x][y] = "[0]"; //Shouldn't be i and j should be random numbers, 0 shouldalso be a randomnumber
            }
        }
    }

    private static void printBoard() {

        for (int i = 0; i <10; i++) {
            for (int j = 0; j<8; j++){
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
    }
}
