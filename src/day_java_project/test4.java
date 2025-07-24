package day_java_project;

public class test4 {
    public static void main(String[] args) {
        int x =3 , y = 5 ,z;
        z= x++ + --y;
        //3  4 2  1
        System.out.println("x :"+x);//4
        System.out.println("y :"+y);//4
        System.out.println("z :"+z);//7

        z +=  --x + y ++;
        //34   1  2    5
        System.out.println("x :"+x);//3
        System.out.println("y :"+y);//5
        System.out.println("z " +z);//14

        z *= ++x + y++;
        //34  1  2  5
        System.out.println("x :"+x);//4
        System.out.println("y :"+y);//6
        System.out.println("z :"+z);//

        x = 5;
        y = 7;
        z = 3;
        z *= ++x - y--;
        System.out.println("x:" +x);//6
        System.out.println("y;" +y);//6
        System.out.println("z: "+z);//-3
        // z= 3(6-7)

    }
}
