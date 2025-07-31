package Coding_Questions;

import java.util.*;


class BookStore {
    int bookId;
    String bookName;

    public BookStore(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }

 
    public String toString() {
        return "BookID: " + bookId + ", BookName: " + bookName;
    }
}


class SortByName implements Comparator<BookStore> {
    public int compare(BookStore b1, BookStore b2) {
        return b1.bookName.compareToIgnoreCase(b2.bookName);
    }
}


class SortById implements Comparator<BookStore> {
    public int compare(BookStore b1, BookStore b2) {
        return Integer.compare(b1.bookId, b2.bookId);
    }
}

public class Q41 {

    public static void main(String[] args) {
        List<BookStore> books = new ArrayList<>();
        books.add(new BookStore(103, "Java Programming"));
        books.add(new BookStore(101, "Algorithms"));
        books.add(new BookStore(104, "Data Structures"));
        books.add(new BookStore(102, "C Programming"));

        System.out.println("Sorted by Book Name:");
        Collections.sort(books, new SortByName());
        for (BookStore book : books) {
            System.out.println(book);
        }

        System.out.println("\nSorted by Book ID:");
        Collections.sort(books, new SortById());
        for (BookStore book : books) {
            System.out.println(book);
        }
    }
}
