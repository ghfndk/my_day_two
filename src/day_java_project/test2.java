package day_java_project;

public class test2 {
    public static void main(String[] args) {

        int x = 5;
        //전의 산수를 따라감

        x += 3 ; // x= x+3 ; 복합 대입 연수 //8
        System.out.println("x : "+ x);

        x *= 4 ; // x= x*4 ; 복합 대입 연수 // ((8)*4)
        System.out.println("x : "+ x);

        x %= 5 ; // x= x %5 ; 복합 대입 연수 // 32/5 나머지 산출
        System.out.println("x : "+ x);

        x -= 1 ; // x= x -1 ; 복합 대입 연수 // 2-1
        System.out.println("x : "+ x);

        x += 7 ; // x= x +7 ; // 1+7
        System.out.println("x : "+ x);

    }
}
