package ch02_control_statement;

public class For_test_2 {
    public static void main(String[] args) {
        int n = 7 ;

        for (int i = 1; i <= n ; i++) {
            System.out.println(i+"의 제곱은 "+ (i*i)+ "입니다.");
        }

        int su01 = 3 ;
        int su02 = 7 ;
        int total = 0 ;

        for (int i = su01; i <= su02 ; i++) {
            total += i ;
        }
        System.out.println("합계 :"+total);
    }
}
