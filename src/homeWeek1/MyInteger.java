package homeWeek1;

//- сложение
//- вычитание
//- умножение
//- деление
//- возведение в степень
//- вычисление факториала
//- вычисление остатка от деления
//- метод который сравнивает два числа

public class MyInteger {

    int value;

    public MyInteger(int number) {
        value = number;
    }

    public String toString() {
        return String.format("%d", value);
    }

    public MyInteger add(MyInteger num) {
        return new MyInteger(value + num.value);
    }

    public MyInteger diff(MyInteger num) {
        return new MyInteger(value - num.value);
    }

    public MyInteger op(MyInteger num) {
        return new MyInteger(value * num.value);
    }

    public MyInteger division(MyInteger num) {
        return new MyInteger(value / num.value);
    }

    public MyInteger restDiv(MyInteger num) {
        return new MyInteger(value % num.value);
    }

    public MyInteger pow(MyInteger num) {

        int res = 1;
        for (int i = 1; i <= num.value; i++) {
            res *= value;
        }
        return new MyInteger(res);
    }

    public MyInteger factorial() {

        long res = 1;
        for (int i = value; i > 1; i--) {
            res *= i;
        }
        return new MyInteger((int) res);
    }

    public boolean equals(MyInteger num) {
        return value == num.value;
    }

}
