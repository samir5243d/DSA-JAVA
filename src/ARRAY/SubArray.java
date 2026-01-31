package ARRAY;

import java.util.Scanner;

public class SubArray {

    public static void printsubarray(int numbers[]){

        int ts=0;

        for(int i =0;  i<numbers.length; i++){ // it calculates start

            int start = i;
            for (int j=i; j<numbers.length; j++){//  it calculates end
                int end = j;
                 for(int k=start; k<=end; k++){//  it is only for printing subarray it is not containing any logic
                     System.out.print(numbers[k] + " ");
                 }
                 ts++;
                System.out.println();

            }
            System.out.println();

        }
        System.out.println("tatal suarrays = "  + ts);

    }

    public static void main(String[] args) {

        int numbers[]= {2,4,6,8,10};

        printsubarray(numbers);// calling of a function


    }

}
