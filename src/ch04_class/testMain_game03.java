package ch04_class;

public class testMain_game03 {
    public static void main(String[] args) {
        game03 zed= new game03() ;
        game03 ari= new game03() ;

        zed.setName("제드");
        zed.setHp(420);
        zed.setMp(0.0);
        zed.setSt(45.0);
        zed.setDt(30.0);
        zed.setSpeed(325.5);
        zed.setPosition("미드");

        ari.setName("아리");
        ari.setHp(450.0);
        ari.setMp(500.0);
        ari.setSt(42.0);
        ari.setDt(27.0);
        ari.setSpeed(330.0);
        ari.setPosition("미드");

        System.out.println("이름 :"+zed.getName());
        System.out.println("HP :"+zed.getHp());
        System.out.println("MP :"+zed.getMp());
        System.out.println("ST :"+zed.getSt());
        System.out.println("DT :"+zed.getSpeed());
        System.out.println("이동속도 :"+zed.getSpeed());
        System.out.println("포지션 :"+zed.getPosition());
    }
}
