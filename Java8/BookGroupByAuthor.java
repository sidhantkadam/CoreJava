package Java8;

/*
    find books which publishYear is greater than 2000
    and group the books by author.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Books {

    public String title;
    public String author;
    public int publicationYear;

    public Books(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear;
    }
}

public class BookGroupByAuthor {
    public static void main(String[] args) {
        List<Books> books = new ArrayList<>();
        books.add(new Books("Life is precious", "John mathew", 2019));
        books.add(new Books("Amazing truths of life", "John mathew", 2014));
        books.add(new Books("Don't be loose yourself", "kenely", 2001));
        books.add(new Books("Let it be !,Its a life..", "john", 1999));


        books.stream()
                .filter(book -> book.publicationYear > 2000)
                .collect(Collectors.groupingBy(books1 -> books1.author))
                .forEach((s, books1) ->
                        System.out.println("Author: " + s + "\n" + "Book Details: " + books1));
    }
}
