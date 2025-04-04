package DesignPatterns.Behevioural;

    /*
       Provides a way to access the elements of collection frameworks
       without exposing underlying representation of a collection.
       Same as Iterator interface present in collection framework.
    */

import java.util.ArrayList;
import java.util.List;

class Book {
    private final String name;
    private final int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

class Library {

    List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public Iterator createIterator() {
        return new BookIterator(books);
    }
}

interface Iterator {
    boolean hasNext();
    Object next();
}

class BookIterator implements Iterator {

    public List<Book> books;
    int index = 0;

    public BookIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return index < books.size();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return books.get(index++);
        }
        return null;
    }
}

public class IteratorPattern {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("ABC", 700));
        books.add(new Book("DEF", 900));
        books.add(new Book("GHI", 500));
        books.add(new Book("JKL", 1000));

        Library library = new Library(books);
        Iterator iterator = library.createIterator();

        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
