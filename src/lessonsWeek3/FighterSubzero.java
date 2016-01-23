package lessonsWeek3;

public class FighterSubzero extends Fighter{

    public static String name = "Subzero";
    public static final int FREEZE = 15;

    public FighterSubzero(int health, int damage) {
        super(name, health, damage);
    }

    public void hit(Fighter enemy){
        enemy.health -= generateDamage(enemy);
    }

    private int generateDamage(Fighter enemy) {

        int damage = FREEZE + (int) (Math.random() * maxDamage);
        super.generateDamage(damage);

        return damage;

    }


}
