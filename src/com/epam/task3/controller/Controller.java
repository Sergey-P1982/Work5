package com.epam.task3.controller;


import com.epam.task3.view.View;
import com.epam.task3.model.Translator;
import com.epam.task3.view.WordsScanner;

import java.util.Scanner;

public class Controller {
    private Translator model = new Translator();
    private View view = new View();
    private Scanner scan = new Scanner(System.in);

    public void run() {

        String moreMenu = "Y";
        do {
            view.printMenu();
            view.printMessage("Choose a menu item (0-3): ");
            int menuItem = getMenuItem();
            while (menuItem > 3 || menuItem < 0) {
                view.printMessage("Wrong number. Try again. ");
                menuItem = getMenuItem();
            }
            executeMenuItem(menuItem);
            view.printMessage("Back to menu press 'Y'/ Exit - press any other key");
            moreMenu = scan.next();
        } while (moreMenu.equalsIgnoreCase("Y"));
    }

    private int getMenuItem() {
        while (!scan.hasNextInt()) {
            view.printMessage("Wrong input. Try again. ");
            scan.next();
        }
        return scan.nextInt();
    }

    private void executeMenuItem(int number) {
        switch (number) {
            case (1):
                String keyWord = WordsScanner.scanOneWord("Add one english word: ");
                String valueWord = WordsScanner.scanOneWord("Add its russian value word: ");
                Translator.addWordsPair(keyWord, valueWord);
                view.printMessage("One english word and its russian value was added to the dictionary\n");
                break;
            case (2):
                String sentence = WordsScanner.scanOneSentence("ADD a sentence to translate: ");
                view.printMessage("Translation: " + Translator.translateSentence(sentence));
                break;
            case (3):
                view.printDictionary("Your dictionary: \n", Translator.getDictionary());
                break;
            case (0):
                view.printMessage("Bye!");
                System.exit(0);
                break;
            default:
                System.out.println("Wrong number. Try again. ");
                break;
        }
    }
}

