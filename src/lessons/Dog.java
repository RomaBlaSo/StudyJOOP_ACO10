package lessons;

public class Dog extends Zverushka{

    public Dog(String name, int age, String kind){

        super(name, age, kind, "Woof!");

    }

    public void bringStick(){

        System.out.println(getSound());

    }

}
