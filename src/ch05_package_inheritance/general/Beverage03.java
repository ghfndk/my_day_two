package ch05_package_inheritance.general;

public class Beverage03 {
    private String name; // 이름
    private double price; //단가

    //접근지정자 반환타입 생성자이름(매개변수){...}
    //생성자의 이름은 클래스의 이름과 같다.
    public Beverage03(String name, double price) {
        this.name = name;
        this.price = price;
    }

    protected void showInfo() {
        System.out.println("음료 이름 :" + name);
        System.out.println("단가 :" + price);
    }
}
