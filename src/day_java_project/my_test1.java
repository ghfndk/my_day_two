package day_java_project;

public class my_test1 {
    public static void main(String[] args) {

        int a = 3 - -2, b = 3 ;
        int x = (a>=b) ? 5 :(a+2);
        //  x=    참      참  거짓

        x += ++a; // x=11 a=6
        int y = ++a;//y= 7 a=7
        y += a+ --b;// y=7+(7+2)+16

        char ch3 = 'D';
        int z = ch3 >= 'A' && ch3 <= 'Z' ? --y : x + 2;
        //           참           ?     15 : 13
        int result = 0 ;
        result = x > y ? z-y : x + z;
        //      11  15         11+15
        System.out.println("result :" + result);//26

    }
}
