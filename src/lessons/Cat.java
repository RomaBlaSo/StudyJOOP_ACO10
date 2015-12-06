package lessons;

public class Cat {

    String name;
    int age;
    String kind;

    public Cat(){}

    public Cat(String name, int age, String kind){

        this.name = name;
        this.age = age;
        this.kind = kind;

    }

    public String toString(){

        return String.format("Meow, my name is %s, my age is %d, i'm %s", name, age, kind);

    }


}
