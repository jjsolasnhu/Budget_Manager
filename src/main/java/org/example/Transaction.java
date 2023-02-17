package org.example;

public class Transaction {
    private String name;
    private double amount;
    private Category category;

    public Transaction(String name, double amount, Category category) {
        this.name = name;
        this.amount = amount;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String toString() {
        return category + ": " + name + " $" + amount;
    }
}
