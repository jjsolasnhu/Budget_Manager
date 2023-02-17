package org.example;

public class AppRunner {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.greet();

        while (true) {
            menu.printMenu();
            menu.option = MenuOption.values()[menu.getNextInt()];

            if (menu.option == MenuOption.EXIT) {
                break;
            }

            switch (menu.option) {
                case ADD_INCOME:
                    //add income
                    System.out.println("Adding income");
                    break;
                case ADD_PURCHASE:
                    //add purchase
                    menu.printCategoryMenu();
                    menu.addTransaction(menu.getNextInt());
                    break;
                case VIEW_PURCHASES:
                    //view purchases
                    System.out.println("Viewing purchases");
                    break;
                case VIEW_BALANCE:
                    //view balance
                    System.out.println("Viewing balance");
                    break;
                case SAVE:
                    //save
                    System.out.println("Saving");
                    break;
                case LOAD:
                    //load
                    System.out.println("Loading");
                    break;
                case SORT:
                    //sort
                    System.out.println("Sorting");
                    break;
            }
        }
    }
}
