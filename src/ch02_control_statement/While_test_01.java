package ch02_control_statement;

public class While_test_01 {
    public static void main(String[] args) {
        int i = 1, total = 0, dan = 3;

        while (i < 10) {
            total = dan * i;
            System.out.println(dan + "*" + i + "=" + total);
            i += 1;
        }

        i = 1;
        int odd = 0, even = 0;

        while (i <= 10) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
            i++;
        }
        System.out.println("홀수의 총합 :" + odd);
        System.out.println("짝수의 총합 :" + even);
    }
}
