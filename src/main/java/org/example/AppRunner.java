package org.example;

import java.util.Scanner;

public class AppRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();

        menu.greet();

        while (true) {
            menu.printMenu();
            int menuOption = scan.nextInt();

            if (menuOption == 0) {
                menu.exit();
                break;
            }

            switch (menuOption) {
                case 1:
                    //add income
                    System.out.println("Set your income");
                    double income = scan.nextDouble();
                    menu.account.setBalance(income);
                    break;
                case 2:
                    //add purchase
                    menu.printCategoryMenu();
                    menu.transactionMenu(menu.getNextInt());
                    break;
                case 3:
                    //view purchases
                    System.out.println("Total purchases\n");
                    menu.printTransactions();
                    break;
                case 4:
                    //view balance
                    System.out.println("Your balance is: ");
                    System.out.println("$" + menu.account.getBalance());
                    break;
                case 5:
                    //save
                    System.out.println("Saving");
                    break;
                case 6:
                    //load
                    System.out.println("Loading");
                    break;
                case 7:
                    //sort
                    System.out.println("Sorting");
                    break;
            }
        }
    }
}
