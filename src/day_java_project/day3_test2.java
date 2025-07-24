package day_java_project;

public class day3_test2 {
    public static void main(String[] args) {

        int a = 3 , b = 5 ;
     //   int result = 조건식 ? 참일때 : 거짓일때 ;
        int result = a >=b ? a-b : b-a;
       // 삼항 연산자 or 조건부 연산자
        System.out.println("절대 값 :" + result);

        int x = 10 ;
        //x가 짝수이면 +3 홀수이면 제곱
        result = x%2 == 0 ? x+3 : x*x ;
        System.out.println("결과 ; " + result);

        x = 8 ;
        int y = 4 ;
        result = x>=y ? x : y ;
        System.out.println(" 큰 수 :" + result);

        result = x>=y ? y : x ;
        //    or x<=y ? x : y ;
        System.out.println(" 작은 수 :" + result);

        x = 5 ;
        y = 12 ;
        String name = y%x == 0 ? "yes" : "no" ;
        System.out.println("약수 :" + name);

        int su = 7 ;
        // 숫자 7은 홀수입니다.
        String sud = su%2==1 ? "홀수입니다":"짝수입니다";
        System.out.println(su+"는" + sud );

        int score = 85 ; // 68점 이상이면 합격
        // 85점이므로 합격입니다.
        String dd = score>= 68 ? "합격입니다" : "불합격입니다";
        System.out.println(score+ "이므로" + dd);







    }
}
