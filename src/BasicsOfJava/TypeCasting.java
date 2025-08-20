package BasicsOfJava;

public class TypeCasting {
    public static void main(String[] args) {

//
//       float a= 25.12f;
////       int b = a; //possible lossy conversion from float to int
//
//        int b= (int)a; // forcefully conversion with knowing there will be loss of data
//        System.out.println(b);
//

        char ch = 'a';
        char ch2 = 'b';
        int number = ch;
        int number2 = ch2;
        System.out.println(number);
        System.out.println(number2);
    }
}
