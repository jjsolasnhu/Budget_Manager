package org.example;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String name;
    private double balance;
    List<Transaction> transactions;

    public Account() {
        this.name = "Main";
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(String name, double amount, Category category) {
        Transaction transaction = new Transaction(name, amount, category);
        this.transactions.add(transaction);
    }

}
