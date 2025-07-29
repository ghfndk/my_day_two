package ch02_control_statement;

import java.util.Scanner;

public class While_test_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total = 0;
        double average = 0.0;
        int count = 0;

        while (true) {
            System.out.print("점수 입력 :");
            int grade = scan.nextInt();//여기서 바코드 인식 grade에 할당

            if (grade < -10) {
                System.out.println("프로그램을 종료합니다");
                break;

            } else if (grade<0){//-10이상의 음수에 대한 처리
                grade =-grade ;
            }
            total += grade;
            count++;
        }
        System.out.println("총점 :" + total);
        average = (double)total / count;
        System.out.println("평균 :" + average);
    }
}
