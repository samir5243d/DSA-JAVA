package LoopsFlowControl;


//check if no is prime or not

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        boolean isprime= true;

        for(int i=2; i<=Math.sqrt(n); i++ ){
            if (n%i==0){ // n is a multiple of i (i is not equal to 1
                isprime=false;
            }

        }

        if (isprime ==true){
            System.out.println("n is prime");
        }else {
            System.out.println("n is not prime");
        }
    }

}
