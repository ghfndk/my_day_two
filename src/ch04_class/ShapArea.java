package ch04_class;

public class ShapArea {

    final double PI = 3.14;

    public void area(double radius) {
        System.out.println("원의 면적 :" + (radius * radius) * PI);
    }

    public void area(int width, int height) {
        System.out.println("사각형의 면적 :" + (width * height));
    }

    public void area(double a, double b, double c) {
        System.out.println("사다리꼻의 넓이 :" + (a + b) * c / 2);
    }

    public void great(String a) {
        System.out.println("안녕하세요" + a + "님");
    }

    public void tsd(int a) {
        int total = 0 ;
        for (int i = 1; i < a; i++) {
            total += i ;
        }
        System.out.println( total);
    }
}
