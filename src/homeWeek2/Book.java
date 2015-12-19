package homeWeek2;

import com.sun.javafx.binding.StringFormatter;

public class Book {

    String name;
    String author;
    int year;
    int count;
    int countOut;

    public Book(String author, String name, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.count = 1;
    }

    public Book(String author, String name, int year, int count) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.count = count;
    }

    public void addInstance(Book book) {

        book.count++;

    }

    public void addInstance(Book book, int count) {

        book.count += count;

    }

    public String toString() {
        return String.format("%s - %s, %d (available %d))", author, name, year, count - countOut);
    }

    public boolean equals(Object o) {

        if (this == o) return true;
        if (this.getClass() != o.getClass()) return false;

        Book tmp = (Book) o;
        if (!this.name.equals(tmp.name)) return false;
        if (!this.author.equals(tmp.author)) return false;
        if (this.year != tmp.year) return false;

        return true;
    }

}