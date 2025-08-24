package ConditionalStatements;

import java.util.Scanner;


//Q5: WriteaJavaprogramtogetanumberfromtheuserandprintwhether it is
//positive or negative.



public class Q5 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int no =sc.nextInt();

        if (no<0){
            System.out.println(" negative");
        }
        else {
            System.out.println("positive");
        }





    }
}
