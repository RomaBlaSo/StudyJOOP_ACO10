package lessons;

public class Cat extends Zverushka{

    public Cat(String name, int age, String kind){

        super(name, age, kind, "Meow!");

    }

    public void stoke(){

        System.out.println("mrrrr...");

    }

}
