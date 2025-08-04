package ch05_package_inheritance.testsport;

public class FootBall extends Sport{
    private int halves ;
    private int golas ;


    public FootBall(String name, int entry, int halves, int golas) {
        super(name ,entry);
        this.halves=halves;
        this.golas=golas;
    }

    public void printInfo(){
        super.SportINfo();
        System.out.println(halves+"개의 하프타임으로 구성이 되며, "+golas+" 골이 들어갔습니다!");
        System.out.println();
    }
}
