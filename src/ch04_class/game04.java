package ch04_class;

public class game04 {
    private String name;
    private double HP;
    private double MP;
    private double ST;
    private double DT;
    private double speed;
    private String position;

    public game04(String name, double HP,double MP, double ST, double DT, double speed, String position) {
        this.name = name;
        this.HP = HP;
        this.MP = MP;
        this.ST = ST;
        this.DT = DT;
        this.speed = speed;
        this.position = position;
    }
    public game04(String name, double HP, double ST, double DT, double speed, String position) {
        this.name = name;
        this.HP = HP;
        this.MP = 0.0;
        this.ST = ST;
        this.DT = DT;
        this.speed = speed;
        this.position = position;
    }

    public void display() {
        System.out.println("이름 :" + this.name);
        System.out.println("HP :" +this.HP);
        System.out.println("MP :"+this.MP);
        System.out.println("ST :"+this.ST);
        System.out.println("DT :"+this.DT);
        System.out.println("이동속도 :"+this.speed);
        System.out.println("포지션 :"+this.position);
    }
}
