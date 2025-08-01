package ch04_class;

public class SaramMain02 {
    public static void main(String[] args) {
        System.out.println(Saram02.natioality);

        Saram02 yusin = new Saram02();//생성자 이름은 클래스이름과 같다
        yusin.name = "김유신";
        yusin.height = 172.5;
        yusin.weight = 65.8;
        yusin.hobby = "축구";
        yusin.blood = "A";

        Saram02 soon = new Saram02();
        soon.name = "유관순";
        soon.height = 116.5;
        soon.weight = 52.3;
        soon.hobby = "야구";
        soon.blood = "B";

        yusin.natioality ="한국 ";

        System.out.println(soon.natioality);

        System.out.println(Saram02.natioality);

        yusin.display();// 메소드를  호출하기
        soon.display();
    }
}
