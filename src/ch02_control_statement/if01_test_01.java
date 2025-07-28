package ch02_control_statement;

public class if01_test_01 {
    public static void main(String[] args) {
        int score = 75;
        String sc;
        if (score >= 90) {
            sc = "A 학점";
        } else if(score>=80) {
            sc = "B 학 점";
        }else if(score>=70) {
            sc = "c 학 점";
        } else if (score>=60) {
            sc = "d 학 점";
        } else {
            sc = "f 학 점";
        }
        System.out.println(sc);
    }
}
