package day_java_project;

public class test6 {
    public static void main(String[] args) {

        double d = 100 ;
        System.out.println("d :" + d);

        int i = (int)12.5 ; //정수 산출(명시적 암시)
        System.out.println("i :" + i);

        System.out.println( 14/5 ); // 정수/정수=정수
        System.out.println( (double)14/5 ); // 실수/실수 (double을 명시적으로 암시)
        /*  (double) 14/5-----> 14.0/5----->14.0/5.0----->2.8
                          명시적        암시적         산출      */
        System.out.println( (double)(14/5) ); //(double 명시적 암시) (정수/정수)후
        // (double)(14/5)----->(double)(2)-------->2.0
        //               산술연산            명시적

        int kor = 50 , eng = 60 , math = 80 ;
        int total = kor + eng + math ;
        double average = (double)total / 3 ;
        //            (double)total-----> 실수/3---> 실수/3.0---> 실수
        //                            190.0/3--->190.0/3.0--->실수
        //                             명시적     암시적    산출
        System.out.println("총정 :" + total);
        System.out.println("평균 :" + average);

        char ch1 = 'c' ;
        char ch2 = 'a' ;

        boolean bool1 = ch1 > ch2 ;//암시적인 형변환이 되므로(99>97) 즉,참이다
        System.out.println("bool1 :" + bool1 );

        int result ;
        result = ch1 - ch2 + 5 ;
        System.out.println("result :" + result);

        char ch3 = 'D' ;

        String str = ch3>='A'&& ch3<='Z' ? "yes" : "no" ;
        System.out.println("대문자 판단 :" + str);
        // 숫자 0 = 48 대문자 A  97  소문자 a 65
        // 숫자와 단어 같이쓸대 숫자0이 48로 변환
    }
}
