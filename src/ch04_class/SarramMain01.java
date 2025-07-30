package ch04_class;

public class SarramMain01 {
    public static void main(String[] args) {
        //단계 2 :겍체 생성
        //클래스이름 객체 이름 =new 생성자이름(); 생성자의 이름=클래스의 이름 *무조건
        Saram01 yusin = new Saram01();

        Saram01 soon; //일반적 많이씀
        soon = new Saram01();

        // 단계3 : 객체의 맴버 변수에 쓰기 작업
        // 점(.)을 맴버 참조 연산자라고 부릅니다.
        yusin.nationality = "대한 민국";
        yusin.name = "김유신";
        yusin.height = 172.5;
        yusin.weight = 75.0;
        yusin.hobby = "당구";
        yusin.blood ="AB";

        // 단계4 : 객체의 맴버 변수의 값을 출력
        System.out.println("국적 :" + yusin.nationality);
        System.out.println("이름 :" + yusin.name);
        System.out.println("키 :" + yusin.height);
        System.out.println("몸무계 :" + yusin.weight);
        System.out.println("취미 :" + yusin.hobby);
        System.out.println("혈액형 :" + yusin.blood);

        soon.nationality = "대한 민국";
        soon.name = "유관순";
        soon.height = 168.5;
        soon.weight = 50.0;
        soon.hobby = "축구";
        soon.blood ="O";

        System.out.println("국적 :" +soon.nationality);
        System.out.println("이름 :" +soon.name);
        System.out.println("키 :" +soon.height);
        System.out.println("몸무계 :" +soon.weight);
        System.out.println("취미 :" +soon.hobby);
        System.out.println("혈액형 :" +soon.blood);

        String message =yusin.showGenderinfo(1);
        System.out.println(message);
       message = soon.showGenderinfo(2);
        System.out.println(message);

        message = yusin.showBmiInfo();
        System.out.println(message);;

        message = soon.showBmiInfo();
        System.out.println(message);

        yusin.dispaly();
        soon.dispaly();

    }
}
