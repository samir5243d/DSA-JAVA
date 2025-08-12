package BasicsOfJava;

public class TypePromotionInExpression {
    public static void main(String[] args) {

//        char a= 'a';
//        char b= 'b';
//        char c = 'c';
//        System.out.println((int) (b));
//        System.out.println((int) (a));
//        System.out.println(b-a);

        // TYPE PROOMOTION ONLY HAPPENS WITH EXPRESSION

        int a=10;
        float b=20.62f;
        long c=30;
        double d=25;


        double ans = a+b+c+d;// all tyepes converted to double
        System.out.println(ans);


    }
}
