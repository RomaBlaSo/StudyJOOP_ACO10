package homeWeek2;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Library {

    ArrayList<Book> books;
    ArrayList<Reader> readers;

    public Library() {

        books = new ArrayList();
        readers = new ArrayList();

    }

    public void fillBooks() {

        addBook(new Book("Артур Конан Дойль", "Приключения Шерлока Холмса", 1892, 4));
        addBook(new Book("Булгаков Михаил", "Мастер и Маргарита", 1960, 14));
        addBook(new Book("Дж. Р. Р. Толкин", "Властелин колец", 1954, 10));
        addBook(new Book("Оскар Уайльд", "Портрет Дориана Грея", 1891, 5));
        addBook(new Book("Достоевский Федор", "Преступление и наказание", 1866, 20));
        addBook(new Book("Булгаков Михаил", "Собачье сердце", 1968, 40));
        addBook(new Book("Антуан де Сент-Экзюпери", "Маленький принц", 1942, 25));
        addBook(new Book("Джером Сэлинджер", "Над пропастью во ржи", 1951, 1));
        addBook(new Book("Лермонтов Михаил", "Герой нашего времени", 1840, 2));
        addBook(new Book("Эрих Мария Ремарк", "Три товарища", 1936, 7));
        addBook(new Book("Маргарет Митчелл", "Унесенные ветром", 1936, 19));
        addBook(new Book("Патрик Зюскинд", "Парфюмер", 1985, 10));
        addBook(new Book("Рэй Брэдбери", "451 градус по Фаренгейту", 1953, 12));
        addBook(new Book("Джордж Оруэлл", "1984", 1949, 11));
        addBook(new Book("Джек Лондон", "Белый Клык", 1946, 6));
        addBook(new Book("Илья Ильф, Евгений Петров", "12 стульев", 1928, 2));
        addBook(new Book("Достоевский Федор", "Идиот", 1868, 13));
        addBook(new Book("Эрнест Хемингуэй", "Старик и море", 1952, 21));
        addBook(new Book("Гоголь Николай", "Мертвые души,", 1842, 30));
        addBook(new Book("Стивен Кинг", "Зеленая миля", 1996, 5));
        addBook(new Book("Пелевин Виктор", "Любовь к трем цукербринам", 2014, 2));
        addBook(new Book("Акунин Борис", "Бох и шельма", 2014, 3));
        addBook(new Book("Каку Митио", "Будущее разума", 2015, 1));
        addBook(new Book("Несбё Ю", "И прольется кровь", 2015, 4));

    }

    public void fillReaders() {
        addReader(new Reader("562", "Андрей"));
        addReader(new Reader("563", "Василий"));
        addReader(new Reader("564", "Оксана"));
        addReader(new Reader("111", "Ольга"));
        addReader(new Reader("222", "Артур"));
    }

    public void showReaders() {
        readers.forEach(System.out::println);
    }

    public void showBooks() {
        books.stream().filter(s -> s.count > s.countOut).forEach(System.out::println);
    }

    public void showNewBooks() {
        books.stream().filter(s -> s.year > 2013).forEach(System.out::println);
    }

    public void showBooksByAuthor(String seekingAuthor) {
        books.stream().filter(s -> s.author.equals(seekingAuthor)).forEach(System.out::println);
    }

    public void showBooksByFilter(Predicate<Book> predicate) {
        books.stream().filter(predicate).forEach(System.out::println);
    }


    public void addBook(Book newBook) {

        int index = books.indexOf(newBook);
        if (index == -1) {
            books.add(newBook);
        } else {
            Book oldBook = books.get(index);
            oldBook.count += newBook.count;
        }
    }

    public void addReader(Reader newReader) {
        int index = readers.indexOf(newReader);
        if (index == -1) {
            readers.add(newReader);
        } else {
            System.err.println("Reader with id " + newReader.id + " is already registered");
        }
    }

    public void giveBookToReader(Reader reader, Book newBook) {

        if (reader.isBad()) {
            System.err.println("You are blocked");
            return;
        }
        if (reader.books.size() >= 3) {
            System.err.println("You can not take more than three books");
            return;
        }
        if (newBook.count == newBook.countOut) {
            System.err.println("Sorry, but these books ended");
            return;
        }

        reader.books.add(newBook);
        newBook.countOut++;

    }

    public void showBooksAtReader() {
        Stream<Reader> readerStream = readers.stream().filter(s -> s.books.size() > 0);
        readerStream.forEach(r -> {
            System.out.println(r);
            r.books.forEach(System.out::println);
        });
    }

    public void showBooksSelectedReader(Reader selectedReader) {
        Stream<Reader> readerStream = readers.stream().filter(s -> s.equals(selectedReader));
        readerStream.forEach(r -> {
            System.out.println(r);
            r.books.forEach(System.out::println);
        });
    }

}