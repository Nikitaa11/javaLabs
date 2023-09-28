package lab2._7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter author's name, title of the book, year of writing: ");

        for (; ; ) {
            String name = sc.nextLine();
            if (name.equals("end"))
                break;
            String title = sc.nextLine();
            int year = sc.nextInt();
            sc.nextLine();
            Book book = new Book(name, title, year);
            books.add(book);
        }

        for (Book book : books) {
            System.out.println("Author " + book.getName() + " написал книги с названием " + book.getTitle() + " в " + book.getYear());
        }

        books.sort(Comparator.comparing(Book::getYear));
        System.out.println("After sort: ");

        for (Book book : books) {
            System.out.println("Author " + book.getName() + " написал кнуги с названием " + book.getTitle() + " в " + book.getYear());
        }
    }
}
