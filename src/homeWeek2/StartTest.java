package homeWeek2;

public class StartTest {

    //Написать программу позволяющую узнать следующую информацию:
    //1) посмотреть список читателей
    //2) посмотреть список доступных книг
    //3) добавить книгу в библиотеку
    //4) добавить читателя в список читателей
    //5) выдать книгу читателю (если книга есть в наличии).
    //      Читателю запрещается брать больше 3-х книг.
    //6) посмотреть список книг, которые находятся у читателей
    //7) посмотреть список книг, которые находятся у конкретного читателя
    //8) добавить читателя в черный список (ему нельзя выдавать книги)
    //9) посмотреть книги конкретного автора
    //10) посмотреть новые книги (год издания выше 2013)

    public static void main(String[] args) {

        Library mainLib = new Library();
        mainLib.fillBooks();
        mainLib.fillReaders();

        System.out.println("ALL BOOKS:");
        //mainLib.showBooks();
//        mainLib.showBooksByFilter(s -> s.count - s.countOut > 0);

        System.out.println("NEW BOOKS:");
//        mainLib.showNewBooks();

        System.out.println("BOOKS by Булгаков Михаил:");
//        mainLib.showBooksByAuthor("Булгаков Михаил");

        mainLib.giveBookToReader(mainLib.readers.get(0), mainLib.books.get(5));

        mainLib.showBooksAtReader();

    }

}
