package lessons;

public class Zverushka {

    private String name;
    private int age;
    private String kind;
    private String sound;

    public Zverushka(String name, int age, String kind, String sound){

        this.name = name;
        this.age = age;
        this.kind = kind;
        this.sound = sound;

    }

    public String getSound(){

        return sound;

    }

    public String playSound(){

        return String.format("%s, my name is %s, my age is %d, i'm %s", sound, name, age, kind);

    }

}
