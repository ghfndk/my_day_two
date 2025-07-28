package ch02_control_statement;

public class for_if_test_2 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                total += i;
            }
        }
        System.out.println("총합 :" + total);

        int sumA = 0, sumB = 0;
        int diff = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                sumA += i;
            } else {
                sumB += i;
            }
            diff = sumB - sumA;
        }
        System.out.println("3의 배수의 총합 :" + sumA);
        System.out.println("3의 배수가 아닌 정수의 총합 :" + sumB);
        System.out.println("차이:" + diff);

        sumA = 0;
        sumB = 0;
        diff = 0;
        for (int i = 1; i <= 50; i++) {
            switch (i % 3) {
                case 0:
                    sumA += i;
                    break;
                default:
                    sumB += i;
            }
        }
        diff = sumB - sumA;
        System.out.println("3의 배수의 총합 :" + sumA);
        System.out.println("3의 배수가 아닌 정숭의 총합 :" + sumB);
        System.out.println("차이" + diff);

    }
}
