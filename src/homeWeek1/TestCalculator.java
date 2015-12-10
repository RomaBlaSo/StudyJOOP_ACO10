package homeWeek1;

import java.util.Scanner;

public class TestCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");

        Calculator calc = new Calculator();
        System.out.println(calc.execute(sc.nextLine()));

    }
}
