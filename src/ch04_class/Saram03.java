package ch04_class;

public class Saram03 {
    private String name;
    private double height;
    private double weight;
    private String hobby;
    private String blood;

    //public void set(변수의 첫글차는 대문자)(변수의타입 이름){
    //           해당변수 = 변수이름 ;   }
    public void setName(String name) {
        this.name = name;
    }
    public  void setHeight(double height) {
        this.height = height ;
    }

    //public 반환타입 get(){   반환타입은 변수의 타입
    //   return 해당변수 ; }
    public String getName(){
        return name ;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
