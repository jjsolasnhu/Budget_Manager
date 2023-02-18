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
                    menu.setIncome();
                    break;
                case 2:
                    //add purchase
                    menu.printCategoryMenu();
                    menu.transactionMenu(scan.nextInt());
                    break;
                case 3:
                    //view purchases
                    menu.printTransactions();
                    break;
                case 4:
                    //view balance
                    menu.printBalance();
                    break;
                case 5:
                    //save
                    menu.save();
                    break;
                case 6:
                    //load
                    menu.load();
                    break;
                case 7:
                    //sort
                    System.out.println("Sorting");
                    break;
            }
        }
    }
}
