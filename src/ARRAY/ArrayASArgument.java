package ARRAY;

import java.util.Scanner;

public class ArrayASArgument {


    public static void update(int marks[]){
        for (int i=0; i<marks.length; i++) {
            // that means we are reaching all index of the array
            marks[i] = marks [i] + 1;
        }

    }
    public static void main(String[] args) {
        int marks[] = {97, 98,99};
        update(marks);


    // for printing our marks

        for (int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();

    }
}
