package lessons;

public class Lesson3 {

    public static void main(String[] args) {

//        BankAccount newBA = new BankAccount("Bill Gates", "windows", 1_000_000);
//
//        System.out.println(newBA.checkAccount());
//
//        newBA.putMoney(500);
//
//        System.out.println(newBA.takeMoney(2_000_000, "windows"));

        //public -> any
        //protected -> Inheritance
        //default  (package-private) -> in package
        //private -> in class :
            //mutator -> setter
            // -> getter

        Cat cat = new Cat("Murzik", 10, "British");
        Dog dog = new Dog("Rex", 8, "Huskies");

        System.out.println(cat.playSound());
        cat.stoke();

        System.out.println(dog.playSound());
        dog.bringStick();

    }
}
