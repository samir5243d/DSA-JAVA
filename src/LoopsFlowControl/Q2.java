package LoopsFlowControl;

//Print number from 1 to n
// n=7

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n= sc.nextInt();

        int counter =1;


        while (counter <=n){
            System.out.println(counter);
            counter++;
        }



    }
}
