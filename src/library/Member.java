package library;

import datastructures.queues.CustomQueue;
import java.util.Objects;

public class Member {
    private final String memberId;
    private final String name;
    private final CustomQueue<Transaction> transactions;

    public Member(String memberId, String name) {
        this.memberId = validateMemberId(memberId);
        this.name = validateName(name);
        this.transactions = new CustomQueue<>();
    }

    private String validateMemberId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Member ID cannot be null or empty");
        }
        if (!id.matches("^M\\d{3}$")) {
            throw new IllegalArgumentException("Member ID must start with 'M' followed by 3 digits (e.g. M001)");
        }
        return id;
    }

    private String validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Member name cannot be null or empty");
        }
        return name.trim();
    }

    public String getMemberId() { return memberId; }
    public String getName() { return name; }

    public void addTransaction(Transaction transaction) {
        transactions.add(Objects.requireNonNull(transaction));
    }

    public Transaction getLastTransaction() {
        if (transactions.isEmpty()) {
            return null;
        }


        Transaction last = null;
        CustomQueue<Transaction> tempQueue = new CustomQueue<>();

        while (!transactions.isEmpty()) {
            last = transactions.remove();
            tempQueue.add(last);
        }


        while (!tempQueue.isEmpty()) {
            transactions.add(tempQueue.remove());
        }

        return last;
    }

    public boolean hasBorrowedBook() {
        Transaction last = getLastTransaction();
        return last != null && last.isBorrow();
    }

    @Override
    public String toString() {
        return String.format("Member{id='%s', name='%s'}", memberId, name);
    }
}