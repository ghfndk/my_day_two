package ch04_class;

public class SaramMain03 {
    public static void main(String[] args) {
        Saram03 yuisn = new Saram03();

        Saram03 soon = new Saram03();

        yuisn.setName("김유신");
        yuisn.setHeight(172.3);
        yuisn.setWeight(62.5);
        yuisn.setHobby("축구");
        yuisn.setBlood("A");

        soon.setName("유관순");
        soon.setHeight(168.2);
        soon.setWeight(52.3);
        soon.setHobby("농구");
        soon.setBlood("B");

        System.out.println("이름 :" + yuisn.getName());
        System.out.println("키 :" + yuisn.getHeight());
        System.out.println("몸무게 :" + yuisn.getWeight());
        System.out.println("취미 :" + yuisn.getHobby());
        System.out.println("혈액형 :" + yuisn.getBlood());

        System.out.println("이름 :" + soon.getName());
        System.out.println("키 :" + soon.getHeight());
        System.out.println("몸무게 :" + soon.getWeight());
        System.out.println("취미 :" + soon.getHobby());
        System.out.println("혈액형 :" + soon.getBlood());
    }
}
