package library;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    // TODO: Define a data structure to hold members waiting for this book

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;

        // TODO: Initialize your data structure here
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    public void addToWaitlist(Member member) {
        // TODO
    }

    public Member getNextInWaitlist() {
        // TODO
        return null;
    }

    public boolean hasWaitlist() {
        // TODO
        return false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", available=" + isAvailable +
                '}';
    }
}