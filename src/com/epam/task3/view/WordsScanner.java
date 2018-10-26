package com.epam.task3.view;

import com.epam.task2.view.InputMenu;

import java.util.Scanner;

public class WordsScanner implements MenuView {
    private static Scanner scan = new Scanner(System.in);
    private static View view = new View();


    public static String scanOneWord(String message) {
        view.printMessage(message);
        while (!scan.hasNext()) {
            view.printMessage(WRONG_INPUT);
            scan.next();
        }
        return scan.next();
    }

    public static String scanOneSentence(String message) {
        view.printMessage(message);
        scan.nextLine();
        while (!scan.hasNextLine()) {
            view.printMessage(WRONG_INPUT);
            scan.nextLine();
        }
        return scan.nextLine();
    }
}
