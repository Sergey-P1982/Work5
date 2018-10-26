package com.epam.task2.view;

import java.util.Scanner;

public class DataScanner implements InputMenu {
    private static Scanner scan = new Scanner(System.in);
    private static View view = new View();

    public static int scanElemNumbers(String message) {
        view.printMessage(message);
        while (!scan.hasNextInt()) {
            view.printMessage(WRONG_NUMBER);
            scan.next();
        }
        return scan.nextInt();
    }

    public static int checkNumber(String message) {
        int number = scanElemNumbers(message);
        while (number <= 0) {
            view.printMessage(InputMenu.NOT_POSITIVE);
            number = scanElemNumbers(message);
        }
        return number;
    }
}

