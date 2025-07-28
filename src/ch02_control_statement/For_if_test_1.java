package ch02_control_statement;

public class For_if_test_1 {
    public static void main(String[] args) {
        int odd = 0, even = 0;

        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }
        System.out.println("홀수의 총합 :" + odd);
        System.out.println("짝수의 총합 :" + even);

        int sum0 = 0, sum1 = 0, sum2 = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                sum0 += i;
            } else if (i % 3 == 1) {
                sum1 += i;
            } else {
                sum2 += i;
            }
        }
        System.out.println("sum0 :" + sum0);
        System.out.println("sum1 :" + sum1);
        System.out.println("sum2 :" + sum2);
    }
}
