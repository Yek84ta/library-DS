package management;

import datastructures.lists.CustomArrayList;
import library.Book;
import library.Member;
import library.Transaction;

import java.util.Date;

public class TransactionManager {
    private CustomArrayList<Transaction> transactions;

    public TransactionManager() {
        this.transactions = new CustomArrayList<>();
    }

    public Transaction addTransaction(String bookTitle, String memberName, String type) {
        if (bookTitle == null || memberName == null || type == null) {
            throw new IllegalArgumentException("Parameters cannot be null");
        }

        String transactionId = "TXN-" + System.currentTimeMillis();
        Transaction transaction = new Transaction(transactionId, bookTitle, memberName, type);

        transactions.add(transaction);
        return transaction;
    }

    public Transaction getTransactionByIndex(int index) {
        if (index < 0 || index >= transactions.size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return transactions.get(index);
    }

    public int getTransactionCount() {
        return transactions.size();
    }
}