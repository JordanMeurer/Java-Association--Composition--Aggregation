package Aggregation;
import java.util.*;

/**
 * Created by Jordan on 7/10/2017.
 */
public class Author {

    private String name;
    private int month, day, year;
    private ArrayList<Book> books;

    public Author(String name, int month, int day, int year){

        this.name = name;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void addBook(String title, String genre, int month, int day, int year){

        books.add(new Book(title, genre, month, day, year));

    }

    public ArrayList<Book> bookList(){
        return books;
    }
}
