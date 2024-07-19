package yashPackage;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AddRemoveBook 
{
    private String title;
    private String author;
    private String ISBN;

    public AddRemoveBook(String title, String author, String ISBN)
    {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public static class BookCollection {
        private List<AddRemoveBook> books = new ArrayList<>();

        public void addBook(AddRemoveBook book) {
            books.add(book);
        }

        public void removeBook(AddRemoveBook book) {
            books.remove(book);
        }

        public List<AddRemoveBook> getBooks() {
            return books;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the title of the book: ");
        String title = scanner.nextLine();

        System.out.print("Enter the author of the book: ");
        String author = scanner.nextLine();

        System.out.print("Enter the ISBN of the book: ");
        String ISBN = scanner.nextLine();

        AddRemoveBook newBook = new AddRemoveBook(title, author, ISBN);
        System.out.println("New Book added - Title: " + newBook.getTitle() + ", Author: " + newBook.getAuthor() + ", ISBN: " + newBook.getISBN());

        scanner.close();
    }
}
