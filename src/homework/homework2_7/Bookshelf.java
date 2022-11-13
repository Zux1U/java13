package homework.homework2_7;

import java.util.*;

public class Bookshelf {
    private int countBook;
    private ArrayList<Book> book_shelf = new ArrayList<Book>();

    public int getCountBook() {
        System.out.print("Count book on bookshelf: ");
        return book_shelf.size();
    }

    public void addBook(Book book){
        book_shelf.add(book);
    }


    @Override
    public String toString() {
        return "Bookshelf{" +
                "book_shelf=" + book_shelf +
                '}';
    }
}
