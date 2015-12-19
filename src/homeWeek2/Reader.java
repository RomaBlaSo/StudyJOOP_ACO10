package homeWeek2;

import java.util.ArrayList;

public class Reader {

    String id;
    String name;
    private boolean isBad;
    ArrayList<Book> books;

    public Reader(String id, String name) {

        this.id = id;
        this.name = name;
        this.books = new ArrayList();

    }

    public boolean isBad() {
        return isBad;
    }

    public void setBad() {
        isBad = true;
    }

    public String toString() {
        return String.format("Reader %s (id: %s)", id, name);
    }

    public boolean equals(Object o) {

        if (this == o) return true;
        if (this.getClass() != o.getClass()) return false;

        Reader tmp = (Reader) o;
        if (!this.id.equals(tmp.id)) return false;

        return true;
    }

}