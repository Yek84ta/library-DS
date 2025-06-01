package management;

import library.Book;
import library.Member;

public class BookManager {
    // TODO: Define a data structure that stores ISBNs and their matching Book objects

    private MemberManager memberManager;

    public BookManager(MemberManager memberManager) {
        // TODO: Initialize your data structure here
        this.memberManager = memberManager;
    }

    public void addBook(Book book) {
        // TODO: Add the book and its ISBN to your data structure
    }

    public Book getBookByIsbn(String isbn) {
        // TODO
        return null;
    }

    public boolean isBookAvailable(String isbn) {
        // TODO
        return false;
    }

    public void setBookAvailability(String isbn, boolean available) {
        // TODO
    }

    public void addToWaitlist(String isbn, String memberId) {
        // TODO
    }

    public Member getNextFromWaitlist(String isbn) {
        // TODO
        return null;
    }

    public boolean hasWaitlist(String isbn) {
        // TODO
        return false;
    }
}