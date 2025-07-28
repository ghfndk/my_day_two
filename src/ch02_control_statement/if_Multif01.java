package ch02_control_statement;

public class if_Multif01 {
    public static void main(String[] args) {
        int temperature = 24;
        String tem;

        if (temperature >= 35) {
            tem = "푝염 경보";
        } else if (temperature >= 30) {
            tem = "무더운 날씨";
        } else if (temperature >= 20) {
            tem = "쾌적한 날씨";
        } else if (temperature >= 10) {
            tem = "쌀쌀한 날씨";
        } else {
            tem = "무더운 날씨";
        }
        String message = temperature + "도는" + tem + "입니다";
        System.out.println(message);
    }
}
