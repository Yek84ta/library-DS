package management;

import library.Book;
import library.Member;
import library.Transaction;

import java.util.Date;

public class TransactionManager {
    // TODO: Define a data structure that stores transactions

    public TransactionManager() {
        // TODO: Initialize your data structure here
    }

    public Transaction addTransaction(String bookTitle, String memberName, String type) {

        Transaction transaction = new Transaction(
                "TXN-" + new Date().getTime(),
                bookTitle,
                memberName,
                type
        );

        // TODO: Add the transaction to your data structure
        return transaction;
    }

    public Transaction getTransactionByIndex(int index) {
        // TODO:
        return null;
    }
}
