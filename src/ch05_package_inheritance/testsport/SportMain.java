package ch05_package_inheritance.testsport;

public class SportMain {
    public static void main(String[] args) {

        FootBall footBall = new FootBall("축구 경기",11,1,5);

        Baseball baseball = new Baseball("야구 경기",9,9,0.412);

        footBall.printInfo();
        baseball.printInfo();
    }
}
