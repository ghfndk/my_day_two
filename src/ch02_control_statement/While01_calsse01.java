package ch02_control_statement;

public class While01_calsse01 {
    public static void main(String[] args) {
        int i = 1;
        int total = 0;

        while (i < 11) {
            total += i;
            i++;
        }
        System.out.println("총합01 :" + total);

        i = 1;
        total = 0;

        while (i <= 100) {
            total += i;
            i += 3;
        }
        System.out.println("총합02 :" + total);

        i = 97;
        total = 0;

        while (i >= 1) {
            total += i;
            i -= 5;
        }
        System.out.println("총합03 :" + total);

        i = 1;
        total = 0;

        while (i <= 96) {
            total += i*i ;
            i += 5 ;
        }
        System.out.println("총합04 :"+ total);

        i = 1 ; total = 0 ;

        while(i<=5){
            total += i*(i+1);
            i += 1;
        }
        System.out.println("총합05 :"+total);
    }
}
