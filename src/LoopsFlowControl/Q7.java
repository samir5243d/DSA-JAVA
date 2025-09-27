package LoopsFlowControl;

// Q DISPLAY ALL NUMBERS ENTERED BY USER EXCEPT MULTIPLES OF 10

//CONTINUE KEYWORD

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("enter your number");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue;
            }


        System.out.println("no was : " + n);
    }while (true);


    }
}
