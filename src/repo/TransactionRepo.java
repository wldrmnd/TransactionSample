package repo;

import entity.Transaction;

import java.util.ArrayList;

public class TransactionRepo {

    private ArrayList<Transaction> transactions;

    public TransactionRepo() {
        transactions = new ArrayList<>();
    }

    public void add(Transaction transaction) {
        transactions.add(transaction);
    }

    public void remove(Transaction transaction) {
        transactions.remove(transaction);
    }

    public ArrayList<Transaction> getAll() {
        return transactions;
    }
}
