package service;

import entity.CardHolder;
import entity.Transaction;
import repo.TransactionRepo;

import java.util.ArrayList;

public class TransactionService {

    private TransactionRepo repo;

    public TransactionService() {
        repo = new TransactionRepo();
    }

    public void addTransaction(Transaction transaction) {
        //делать проверки например норм фамилия не очень
        repo.add(transaction);
    }

    public Transaction getTransactionById(Long id) {
        for (Transaction transaction : repo.getAll()) {
            if (transaction.getId() == id) {
                return transaction;
            }
        }
        return null;
    }

    public ArrayList<Transaction> getTransactionByCardHolder(CardHolder cardHolder) {
        ArrayList<Transaction> transactionsFromCurrentCardHolder = new ArrayList<>();
        for (Transaction transaction : repo.getAll()) {
            if (transaction.getCardHolder().equals(cardHolder)) {
                transactionsFromCurrentCardHolder.add(transaction);
            }
        }
        return transactionsFromCurrentCardHolder;
    }

    public void removeTransactionById(Long id) {
        Transaction removedTransaction = getTransactionById(id);
        repo.remove(removedTransaction);
    }
}
