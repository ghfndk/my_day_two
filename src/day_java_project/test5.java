package day_java_project;

public class test5 {
    public static void main(String[] args) {
        int x = 3 , y = 2 ;

        System.out.println("x=" + x +"y=" + y);
        System.out.println("(x>=y) :" + (x >= y));
        System.out.println("!(x>=y) :" + !(x >= y));
        System.out.println("(x == y) :" + (x == y));
        System.out.println("(x != y) :" + (x != y));

        System.out.println("(-1>= 0) :" + (-1>= 0));

        System.out.println("((3>2) && (3>4)) :" + ((3>2) && (3>4)));

        System.out.println("수식 :" + ((x!=y)||(-1>0)));
        //                              거짓     참
        System.out.println("('a' > 'b') :" + ('a' > 'b'));
        System.out.println("수식 :" + (x >=y));

    }
}
