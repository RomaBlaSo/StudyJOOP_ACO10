package lessonsWeek3;

public abstract class Fighter {

    protected String name;
    protected int health;
    protected int maxDamage;

    public Fighter(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.maxDamage = damage;
    }

    public abstract void hit(Fighter enemy);

    public int getHealth() {
        return health;
    }

    public void generateDamage(int damage) {

        System.out.printf("%s: hit - %d%n", name, damage);

    }

    public String toString(){
        return String.format("Fighter - %s, health - %d, maxDamage - %d", name, health, maxDamage);
    }

}