package ch02_control_statement;

public class For_switch_test_1 {
    public static void main(String[] args) {
        int odd = 0 , even = 0 ;
        for (int i = 1; i <=10 ; i++) {

            switch (i%2){
                case 0 ://짝수 일때
                    even += i ;
                    break;
                case 1 ://홀수 일때
                    odd += i ;
                    break;
            }
        }
        System.out.println("홀수의 총합 :"+ odd);
        System.out.println("짝수의 총합 :"+ even);

        int sum0 =0 , sum1=0 ,sum2 =0 ;
        for (int i = 1; i <=10 ; i++) {

            switch (i%3){
                case 0 :
                    sum0 += i ;
                    break;
                case 1 :
                    sum1 += i ;
                    break;
                case 2 :
                    sum2 += i ;
                    break;
            }
        }
        System.out.println("sum0 :"+ sum0);
        System.out.println("sum1 :"+ sum1);
        System.out.println("sum2 :"+ sum2);
    }
}
