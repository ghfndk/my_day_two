package day_java_project;

public class test3 {
    public static void main(String[] args) {

        int a = 10, b = 20, c;

        c = ++a + b++;   /*  a= a+1
          3  1   2   4         c= a+b
                               b= b+1 */

        System.out.println("a : " + a); //
        System.out.println("b : " + b);
        System.out.println("c : " + c);
        // int a= 11 , int b= 21, int c= 31

        c = a++ + --b;
        // 3  4  2  1 (연산 순서)
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

        a = 15;
        b = 12;

        c = --a + --b;
        //4  1  3  2
        System.out.println("a : " + a);//14
        System.out.println("b : " + b);//11
        System.out.println("c : " + c);//25

        a = 10;
        b = 20;

        ++a;//11
        b--;//19
        c = ++a + b--;
        //3  1  2  4
        System.out.println("a : " + a);//12
        System.out.println("b : " + b);//18
        System.out.println("c : " + c);//31

    }
}
