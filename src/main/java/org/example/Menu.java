package org.example;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Menu {
    Account account;
    Scanner scanner;

    public Menu() {
        this.account = new Account();
        this.scanner = new Scanner(System.in);
    }

    /*
    HELPER METHODS TO GET USER INPUT
     */
    public int getNextInt() {
        return scanner.nextInt();
    }

    public void greet() {
        System.out.println("Choose your action:");
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

    public void printCategoryMenu() {
        System.out.println("1) Food");
        System.out.println("2) Entertainment");
        System.out.println("3) Clothes");
        System.out.println("4) Other");
        System.out.println("5) Back");
    }

    public void printTransactions() {
        System.out.println("Total purchases: ");
        double totalPurchases = 0.0;
        for (Transaction x : account.getTransactions()) {
            System.out.println(x);
            totalPurchases += x.getAmount();
        }
        System.out.println("Total: $" + totalPurchases);
    }
    public void exit() {
        System.out.println("Bye!");
    }

    public void transactionMenu(int categoryInt) {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();
        account.addTransaction(name, amount, Category.values()[categoryInt - 1]);
    }

    public void setIncome() {
        System.out.println("Set your income");
        double income = scanner.nextDouble();
        account.setBalance(income);
    }

    public void printBalance() {
        System.out.println("Your balance is: ");
        System.out.println("$" + account.getBalance());
    }

    public void save() {
        try (FileWriter fw = new FileWriter("C:\\Users\\jjsol\\Desktop\\budgetapp.txt")) {
            fw.write(String.valueOf(account.getBalance()) + "\n");
            for (Transaction x : account.getTransactions()) {
                fw.write(x.getCategory() + " " + x.getName() + " " + String.valueOf(x.getAmount()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void load() {
        try {
            File file = new File("C:\\Users\\jjsol\\Desktop\\budgetapp.txt");
            Scanner scanner = new Scanner(file);
            account.setBalance(Double.parseDouble(scanner.nextLine()));
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(" ");
                String purchaseName = "";
                for (int i = 1; i < line.length - 1; i++) {
                    purchaseName += line[i] + " ";
                }
                account.addTransaction(purchaseName, Double.parseDouble(line[line.length - 1]), Category.valueOf(line[0]));
            }
            scanner.close();
        } catch (Exception e) {
//            System.out.println(scanner.nextLine());
            e.printStackTrace();
        }
    }
}
