package com.epam.task1.view;

import com.epam.task1.model.DataValidator;

import java.util.Scanner;

public class DataScanner implements InputMenu {
    private static Scanner scan = new Scanner(System.in);
    private static View view = new View();


    public int scanMenuItem(int menuItem) {
        do {
            view.printMenu();
            view.printMessage("Choose a menu item (0-3): ");
            menuItem = getMenuItem();
            while (menuItem > 2 || menuItem < 0) {
                view.printMessage(WRONG_INPUT);
                menuItem = getMenuItem();
            }

        } while (menuItem > 2 || menuItem < 0);
        return menuItem;
    }

    private int getMenuItem() {
        while (!scan.hasNextInt()) {
            view.printMessage(WRONG_INPUT);
            scan.next();
        }
        return scan.nextInt();

    }


    public String scanNameSurname(String message) {
        view.printMessage(message);
        String name = scan.next();
        while (!DataValidator.validateNameSurname(name)) {
            view.printMessage(WRONG_INPUT + message);
            name = scan.next();
        }
        return name;
    }

    public String scanBirthday(String message) {
        view.printMessage(message);
        String birthday = scan.next();
        while (!DataValidator.validateBirthday(birthday)) {
            view.printMessage(WRONG_INPUT + message);
            birthday = scan.next();
        }
        return birthday;
    }

    public String scanPhone(String message) {
        view.printMessage(message);
        String phone = scan.next();
        while (!DataValidator.validatePhone(phone)) {
            view.printMessage(WRONG_INPUT + message);
            phone = scan.next();
        }
        return phone;
    }

    public String scanAddress(String message) {
        view.printMessage(message);
        String address = scan.nextLine();
        while (!DataValidator.validateAddress(address)) {
            view.printMessage(WRONG_INPUT + message);
            scan.nextLine();
        }
        return scan.nextLine();
    }

}
