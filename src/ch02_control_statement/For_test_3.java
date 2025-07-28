package ch02_control_statement;

public class For_test_3 {
    public static void main(String[] args) {
        int star = 24 ;

        System.out.println("별"+star+"개를 출력합니다.");

        for (int i = 1; i <=star ; i++) {
            System.out.print("*");
            if (i%5==0){
                System.out.println();
            }
        }
    }
}
