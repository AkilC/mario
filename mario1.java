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
        //iterate through rows until it reaches height value. Note, index starts counting at 0. ex: if the user inputs height = 8, the row index will stop iterating at index value 7 but will technically be 8 rows total
        for(int row = 0;row<height; row++){
            //iterate through columns as well
            for(int column = 0;column<height;column++){
                //Each column on each row will print a space if the column index is less than height - current row - 1(because 0 index), otherwise print a hash. Ex: If we are on row 2(technically 3) and input height is 4, it would print a space at index 0(since 0 is less than 4-2-1) and it would print hashes from index 1 to 3(since these values are greater than 4-2-1). The next row(index 3, technically 4) would print 0 spaces and 4 hashes.
                if(column < height - row - 1) {
                    System.out.print(" ");
                } else
                    System.out.print("#");
            }
            //start new row line and then repeat entire for loop
            System.out.println();
        }
    }
}


