package homeWeek1;

//- создание на основе массива символов
//- вывод на экран
//- конкатенация
//- понижение регистра
//- повышение регистра
//- поиск подстроки
//- выделение подстроки
//- удаление пробелов
//- метод для сравнения с другой строкой

public class MyString {

    String value = "";
    char[] value1;

    public MyString(char[] letters) {

        value1 = new char[letters.length];
        for (int i = 0; i < letters.length; i++) {
            value1[i] = letters[i];
        }
    }

    public void show() {

        for (int i = 0; i < value1.length; i++) {
            System.out.print(value1[i]);
        }
        System.out.println();

    }

    public String toString() {
        return String.format("%s", value);
    }

    public MyString add(MyString... str) {

        //String
        MyString newValue = new MyString(new char[value1.length]);

//        String newValue = value;
//        for (int i = 0; i < str.length; i++) {
//
//            newValue += str[i].value;
//
//        }

        return newValue;

    }

    public MyString add(String... str) {

        String newValue = value;
        for (int i = 0; i < str.length; i++) {

            newValue += str[i];

        }

        return new MyString(newValue);

    }

    public String lowCase() {
        return value.toLowerCase();
    }

    public String upCase() {
        return value.toUpperCase();
    }

    public boolean matches(String str) {
        return value.indexOf(str) >= 0;
    }

    public String sub(String str) {
        return value.substring((value.indexOf(str)));
    }

    public MyString delSpaces() {
        return new MyString(value.replaceAll("\\s", ""));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() == obj.getClass()) {
            return value.equals(((MyString) obj).value);
        }
        if (value.equals(obj)) {
            return true;
        }
        return false;
    }

    //delete
    public MyString(String str) {
        value = str;
    }

}
