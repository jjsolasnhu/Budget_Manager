package org.example;

public class AppRunner {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.greet();
        menu.printMenu();
        menu.getNextInt();

    }
}
