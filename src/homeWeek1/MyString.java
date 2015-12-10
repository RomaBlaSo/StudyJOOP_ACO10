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

    public MyString(char[] letters) {
        for (int i = 0; i < letters.length; i++) {
            value += letters[i];
        }
    }

    public MyString(String str) {
        value = str;
    }

    public void show() {
        System.out.println(this);
    }

    public String toString() {
        return String.format("%s", value);
    }

    public MyString add(MyString... str) {

        String newValue = value;
        for (int i = 0; i < str.length; i++) {

            newValue += str[i].value;

        }

        return new MyString(newValue);

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
}
