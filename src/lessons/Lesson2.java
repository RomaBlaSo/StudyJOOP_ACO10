package lessons;

import java.lang.reflect.Array;

public class Lesson2 {

    public static void main(String[] args) {

        Cat kitten1 = new Cat("Murzik", 10, "British");
        System.out.println(kitten1);

        Computer myPC = new Computer("Pentium 2020", 8000);
        System.out.println(myPC);

        System.out.println(myPC.toString(2));


    }

}
