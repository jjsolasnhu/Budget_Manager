package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {
    Account account;
    Scanner scanner;

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

    public void printMenu() {
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
}
