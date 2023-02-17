package org.example;

import java.util.List;

public class Account {
    private String name;
    private double balance;
    List<Transaction> food, clothes, entertainment, other;

    public Account() {
        this.name = "Main";
        this.balance = 0.0;
        this.food = new java.util.ArrayList<Transaction>();
        this.clothes = new java.util.ArrayList<Transaction>();
        this.entertainment = new java.util.ArrayList<Transaction>();
        this.other = new java.util.ArrayList<Transaction>();
    }

    public Transaction getTransaction(int index) {
        return food.get(index);
    }

}
