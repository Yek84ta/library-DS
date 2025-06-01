package library;

import java.util.Date;
import java.util.Objects;

public class Transaction {
    public static final String BORROW = "BORROW";
    public static final String RETURN = "RETURN";

    private final String transactionId;
    private final String bookTitle;
    private final String memberName;
    private final Date transactionDate;
    private final String type;

    public Transaction(String transactionId, String bookTitle, String memberName, String type) {
        this.transactionId = Objects.requireNonNull(transactionId, "Transaction ID cannot be null");
        this.bookTitle = Objects.requireNonNull(bookTitle, "Book title cannot be null");
        this.memberName = Objects.requireNonNull(memberName, "Member name cannot be null");
        this.type = validateType(type);
        this.transactionDate = new Date();
    }

    private String validateType(String type) {
        if (!BORROW.equals(type) && !RETURN.equals(type)) {
            throw new IllegalArgumentException("Transaction type must be either '" +
                    BORROW + "' or '" + RETURN + "'");
        }
        return type;
    }

    public String getTransactionId() { return transactionId; }
    public String getBookTitle() { return bookTitle; }
    public String getMemberName() { return memberName; }
    public Date getTransactionDate() { return transactionDate; }
    public String getType() { return type; }

    public boolean isBorrow() {
        return BORROW.equals(type);
    }

    public boolean isReturn() {
        return RETURN.equals(type);
    }

    @Override
    public String toString() {
        return String.format(
                "Transaction{id='%s', book='%s', member='%s', date=%s, type='%s'}",
                transactionId, bookTitle, memberName, transactionDate, type
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return transactionId.equals(that.transactionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId);
    }
}