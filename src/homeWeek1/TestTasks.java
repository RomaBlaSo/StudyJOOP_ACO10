package homeWeek1;

public class TestTasks {

    public static void main(String[] args) {

        MyInteger numPow = new MyInteger(5);
        MyInteger numFac = new MyInteger(5);
        MyInteger num100 = new MyInteger(100);
        MyInteger num25 = new MyInteger(25);
        MyInteger num17 = new MyInteger(17);

        System.out.printf("--------------- MyInteger ---------------%n%n");
        System.out.printf("Sum %s + %s = %s%n", num100, num25, num100.add(num25));
        System.out.printf("Diff %s - %s = %s%n", num100, num25, num100.diff(num25));
        System.out.printf("Op %s * %s = %s%n", num100, num25, num100.op(num25));
        System.out.printf("Division %s / %s = %s%n", num100, num17, num100.division(num17));
        System.out.printf("Rest division %s + %s = %s%n", num100, num17, num100.restDiv(num17));
        System.out.printf("Pow %s ^ %s = %s%n", num100, numPow, num100.pow(numPow));
        System.out.printf("Factorial %s! = %s%n", numFac, numFac.factorial());
        System.out.printf("Equals: %s %s %s", numFac, (numFac.equals(numPow) ? "equals" : "NOT equals%n"), numPow);

        System.out.printf("%n%n--------------- MyString ---------------%n%n");

        char[] letters = {'R', 'o', 'm', 'a'};
        MyString name = new MyString(letters);
        MyString test = name.add(" is", " studing", " Java");

        name.show();
        System.out.println(name.lowCase());
        System.out.println(name.upCase());

        System.out.printf("String '%s' contain '%s' - %b%n", name, "om", name.matches("om"));
        System.out.printf("String '%s' contain '%s' - %b%n", test, "good", name.matches("good"));

        System.out.printf("Subtring '%s' from '%s' - %s%n", "is", test, test.sub("is"));

        test.delSpaces().show();

        System.out.println("Compare:");
        System.out.println(test.equals(name));
        System.out.println(name.equals("Roma"));
        System.out.println(name.equals(new MyString(letters)));

    }

}
