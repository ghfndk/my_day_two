package ch04_class;

public class game01 {
    String name;
    double HP;
    double MP;
    double ST ;
    double DT ;
    double speed;
    String position ;

    String Tierinfo(){
        double newspeed = speed/10.0;
        double tot = (ST+DT+newspeed)/3 ;
        String total = "";
        if (tot>=35){
            total="1티어";
        } else if (tot>=30) {
            total="2티어";
        } else if (tot>=25) {
            total ="3티어";
        } else if (tot>=20 ) {
            total ="4티어";
        }else {
            total = "5티어";
        }
        String message = name+"는 "+total+" 챔프입니다.";
        return message ;//결과값을 내가 처리하겟다.
    }

    void dispaly(){//메소드에서 처리하겠다
        System.out.println("이름 :" + name);
        System.out.println("HP :" +HP);
        System.out.println("MP :"+MP);
        System.out.println("ST :"+ST);
        System.out.println("DT :"+DT);
        System.out.println("이동속도 :"+speed);
        System.out.println("포지션 :"+position);
    }

}
