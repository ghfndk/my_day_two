package ch04_class;

public class testMain_game {
    public static void main(String[] args) {
        game01 zed = new game01();
        game01 ari = new game01();

        zed.name = "제드";
        zed.HP = 420;
        zed.MP = 0.0;
        zed.ST = 45.0;
        zed.DT = 30.0;
        zed.speed = 325.5;
        zed.position = "미드";

        ari.name = "아리";
        ari.HP = 450;
        ari.MP = 500.0;
        ari.ST = 42.0;
        ari.DT = 27.0;
        ari.speed = 330.0;
        ari.position = "미드";

        zed.dispaly();
        String message = zed.Tierinfo();
        System.out.println(message);
        ari.dispaly();
        message = ari.Tierinfo();
        System.out.println(message);


    }
}
