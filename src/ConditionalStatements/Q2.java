package ConditionalStatements;

//PRINT IF A NO IS ODD OR EVEN

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no= sc.nextInt();



        if (no%2==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
