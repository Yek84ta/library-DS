package management;

import datastructures.maps.CustomHashMap;
import library.Book;
import library.Member;

public class BookManager {

    private CustomHashMap<String, Book> books;
    private MemberManager memberManager;

    public BookManager(MemberManager memberManager) {
        this.books = new CustomHashMap<>();
        this.memberManager = memberManager;
    }

    public void addBook(Book book) {
        if (book != null && book.getIsbn() != null) {
            books.put(book.getIsbn(), book);
        }
    }

    public Book getBookByIsbn(String isbn) {
        if (isbn == null) {
            return null;
        }
        return books.get(isbn);
    }

    public boolean isBookAvailable(String isbn) {
        if (isbn == null) {
            return false;
        }
        Book book = books.get(isbn);
        return book != null && book.isAvailable();
    }

    public void setBookAvailability(String isbn, boolean available) {
        if (isbn != null) {
            Book book = books.get(isbn);
            if (book != null) {
                book.setAvailable(available);
            }
        }
    }

    public void addToWaitlist(String isbn, String memberId) {
        if (isbn != null && memberId != null) {
            Book book = books.get(isbn);
            Member member = memberManager.getMember(memberId);
            if (book != null && member != null) {
                book.addToWaitlist(member);
            }
        }
    }

    public Member getNextFromWaitlist(String isbn) {
        if (isbn == null) {
            return null;
        }
        Book book = books.get(isbn);
        return book != null ? book.getNextInWaitlist() : null;
    }

    public boolean hasWaitlist(String isbn) {
        if (isbn == null) {
            return false;
        }
        Book book = books.get(isbn);
        return book != null && book.hasWaitlist();
    }
}