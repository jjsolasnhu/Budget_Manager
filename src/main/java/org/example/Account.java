package org.example;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String name;
    private double balance;
    private ArrayList<Transaction> transactions;

    public Account() {
        this.name = "Main";
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(String name, double amount, Category category) {
        Transaction transaction = new Transaction(name, amount, category);
        this.transactions.add(transaction);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        double totalPurchases = 0.0;
        for (Transaction x : transactions) {
            totalPurchases += x.getAmount();
        }
        return balance - totalPurchases;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }


}
