package lessonsWeek3;

public class FighterLiuKang extends Fighter {

    public static String name = "Liu Kang";
    public static final int SPEED = 3;
    private int manna;

    public FighterLiuKang(int health, int damage, int manna) {
        super(name, health, damage);
        this.manna = manna;
    }

    public void hit(Fighter enemy) {
        enemy.health -= generateDamage(enemy);
    }

    private int generateDamage(Fighter enemy) {

        int damage = SPEED + 2 * manna + (int) (Math.random() * maxDamage);
        super.generateDamage(damage);

        return damage;

    }

}
