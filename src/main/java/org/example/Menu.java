package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {
    Account account;
    Scanner scanner;
    MenuOption option;

    public Menu() {
        this.account = new Account();
        this.scanner = new Scanner(System.in);
    }

    public void greet() {
        System.out.println("Choose your action:");
    }

    public int getNextInt() {
        return scanner.nextInt();
    }

    public String getNextString() {
        return scanner.next();
    }

    public Double getNextDouble() {
        return scanner.nextDouble();
    }

    public void printMenu() {
        System.out.println();
        System.out.println("1. Add income");
        System.out.println("2. Add purchase");
        System.out.println("3. View purchases");
        System.out.println("4. View balance");
        System.out.println("5. Save");
        System.out.println("6. Load");
        System.out.println("7. Sort");
        System.out.println("0. Exit");
    }

    public void exit() {
        System.out.println("Bye!");
    }

    public void addTransaction(int categoryInt) {
        System.out.println("Enter name: ");
        String name = getNextString();
        System.out.println("Enter amount: ");
        double amount = getNextDouble();
        account.addTransaction(name, amount, Category.values()[categoryInt - 1]);
    }

    public void printCategoryMenu() {
        System.out.println("1) Food");
        System.out.println("2) Entertainment");
        System.out.println("3) Clothes");
        System.out.println("4) Other");
        System.out.println("5) Back");
    }
}
