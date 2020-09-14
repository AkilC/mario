package com.company;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int height;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("How many rows?");
            height = input.nextInt();
        } while (height < 1 || height >8);
        blocks(height);
    }

    static void blocks(int height) {
        for(int row = 0;row<height; row++){
            for(int column = 0;column<height;column++){
                if(column < height - row - 1) {
                    System.out.print(" ");
                } else
                    System.out.print("#");
            }
            System.out.println();
        }
    }
}


