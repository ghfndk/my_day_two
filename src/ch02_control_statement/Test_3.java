package ch02_control_statement;

public class Test_3 {
    public static void main(String[] args) {
        int month = 8;
        String season;
        if (month >= 3 && month <= 5) {
            season = "봄";
        } else if (month >= 6 && month <= 8) {
            season = "가을";
        } else if (month >= 9 && month <= 11) {
            season = "겨울";
        } else {
            season = "여름";
        }
        String meesage =month + "월은" + season + "입니다";
        System.out.println(meesage);
    }
}
