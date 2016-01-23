package lessonsWeek3;

public class Arena {

    public static void startFight(Fighter fighter1, Fighter fighter2) throws InterruptedException {

        while (fighter1.getHealth() > 0 && fighter2.getHealth() > 0) {

            fighter1.hit(fighter2);
            if (fighter2.getHealth() > 0) {
                fighter2.hit(fighter1);
            }

        }

        if(fighter1.getHealth() > 0){
            System.out.println("First win");
        } else{
            System.out.println("Second win");
        }

        System.out.println(fighter1);
        System.out.println(fighter2);
    }

}