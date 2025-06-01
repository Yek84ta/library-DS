package library;

import datastructures.queues.CustomQueue;

public class Book {
    private final String title;
    private final String author;
    private final String isbn;
    private boolean isAvailable;
    private final CustomQueue<Member> waitList;

    public Book(String title, String author, String isbn) {
        if (title == null || author == null || isbn == null) {
            throw new IllegalArgumentException("Title, author and ISBN cannot be null");
        }
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
        this.waitList = new CustomQueue<>();
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isAvailable() { return isAvailable; }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public void addToWaitlist(Member member) {
        if (member == null) {
            throw new IllegalArgumentException("Member cannot be null");
        }
        waitList.add(member);
    }

    public Member getNextInWaitlist() {
        if (waitList.isEmpty()) {
            return null;
        }
        return waitList.remove();
    }

    public boolean hasWaitlist() {
        return !waitList.isEmpty();
    }

    public int getWaitlistSize() {
        return waitList.size();
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", available=" + isAvailable +
                ", waitlistSize=" + waitList.size() +
                '}';
    }
}