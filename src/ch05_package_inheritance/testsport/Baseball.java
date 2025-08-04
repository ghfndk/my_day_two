package ch05_package_inheritance.testsport;

public class Baseball extends Sport{
    private int innings ;
    private double hitrate ;

    public Baseball(String name, int entry, int innings, double hitrate) {
        super(name, entry);
        this.innings=innings ;
        this.hitrate=hitrate ;
    }

    public void printInfo(){
       super.SportINfo();
        System.out.println(innings+"개의 이닝으로 구성이 되며 타율"+hitrate+"를 기룍하였습니다.");
        System.out.println();
    }
}
