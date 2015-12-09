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

    public String toString(){return String.format("%d", value);}

    public MyInteger add(int num){return new MyInteger(value + num);}
    public MyInteger diff(int num){return new MyInteger(value - num);}
    public MyInteger op(int num){return new MyInteger(value * num);}
    public MyInteger division(int num){return new MyInteger(value / num);}

}
