package BasicsOfJava;

//Question 3: Enter cost of 3 items from the user (using float data type)- a pencil, a pen and
//an eraser. You have to output the total cost of the items back to the user as their bill.
//        (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

import java.util.Scanner;


public class Q3DataTypesVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float CostOfPencil = sc.nextFloat();
        float CostOfPen = sc.nextFloat();
        float CostOfEraser = sc.nextFloat();

        float totalCost = CostOfPencil + CostOfPen + CostOfEraser;

        System.out.println("Bill is : " + totalCost);

//        ADD ON WITH 18% GST:

        float NewtotalCost = totalCost + (0.18f * totalCost);
        System.out.println("Bill with 18%tax : " + NewtotalCost);


    }
}
