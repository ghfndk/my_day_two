package day_java_project;

public class day3_test1 {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 8 ;

        boolean bool1 = a != b ; // 10!=8 참
        boolean bool2 = --a == b++ ; //9==8 거짓 a=9 b=8 거짓
        boolean bool3 = a++ != --b ;  //9!=8 참 a=10 b=8 참
        boolean bool4 = bool3 && (5>7) ; //참*거짓=거짓
        boolean bool5 = !bool4 || ( bool1 && bool2 ) ;//참

        System.out.println("bool1 : " + bool1);
        System.out.println("bool2 : " + bool2);
        System.out.println("bool3 : " + bool3);
        System.out.println("bool4 : " + bool4);
        System.out.println("bool5 : " + bool5);


    }
}
