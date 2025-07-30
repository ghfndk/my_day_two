package ch04_class;

// 단계 1 : 클래스 정의(선언)

public class Saram01 {

    // 공유하고자 하는 변수는 ststic 키워드를 사용합니다,
    static String nationality;

    // Saram01의 맴버 변수들은 기본 값이 존재합니다.
    String name;
    double height;
    double weight;
    String hobby;
    String blood;

    //반환 티입 메소드이름(매계 변수 리스트0{...}
    String showGenderinfo(int juminno) {
        String gender = "";

        if (juminno == 1 || juminno == 3) {
            gender = "남자";
        } else {
            gender = "여자";
        }
        String message = name + "님은 " + gender + "이군요.";
        return message;
    }

    //반환타입 메소드이름(매개 변수 리스트){...}
    String showBmiInfo() {
        double newHeight = height / 100.0;// 센티미터를 미터로 변경
        double rate = weight / (newHeight * newHeight); //bmi 공식에 의하여 계산
        String bmi = "";//결과물 저장할 문자열
        if (rate >= 25.00) {
            bmi = "비만";
        } else if (rate >= 23.00) {
            bmi = "과체중";
        } else if (rate >= 18.50) {
            bmi = "정상";
        } else {
            bmi = "저체중";
        }
        String message = name + "님은" + bmi + "입니다";//messge 자리에 그냥 입력해도됨
        return  name + "님은" + bmi + "입니다";
    }

    //반환타입 메소드이름(매개 변수 리스트{...}
    // void 반환하지 않는다 return 사용X
    void dispaly() {
        System.out.println(name + "님의 신상 정보");
        System.out.println("국적 :" + nationality);//약간 누워있음 static 변수
        System.out.println("이름 :" + name + "님");
        System.out.println("키 :" + height + "cm");
        System.out.println("몸무계 :" + weight + "kg");
    }
}

