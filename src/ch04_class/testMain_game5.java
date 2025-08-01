package ch04_class;

public class testMain_game5 {
    public static void main(String[] args) {
        game05[] game = new game05[2];

        game[0] = new game05("제드", 420, 0.0, 45.0, 30.0, 325.5, "미드");

        game[1] = new game05("아리", 450, 500.0, 42.0, 27.0, 330.0, "미드");

        for (int i = 0; i < game.length; i++) {
            game[i].display();
        }
    }
}
