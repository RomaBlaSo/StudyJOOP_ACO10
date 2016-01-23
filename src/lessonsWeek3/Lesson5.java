package lessonsWeek3;

public class Lesson5 {

    public static void main(String[] args) throws InterruptedException {

        Fighter f1 = new FighterSubzero(100, 20);
        Fighter f2 = new FighterLiuKang(100, 10, 5);

        Arena.startFight(f1, f2);

    }

}
