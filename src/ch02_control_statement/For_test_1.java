package ch02_control_statement;

public class For_test_1 {
    public static void main(String[] args) {
        int dan = 3;
        int total = 0;

        for (int i = 1; i < 10; i++) {
            total = dan * i;
            System.out.println(dan + "*" + i + "=" + total);
        }

        int su = 5;
        total = 0;

        for (int i = 1; i <= su; i++) {
            total += i;
        }
        System.out.println("1부터 " + su + "까지의 합은 " + total + "입니다.");
    }
}
