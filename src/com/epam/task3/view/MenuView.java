package com.epam.task3.view;

/**
 * The interface describes the menu fields and has one default method to display the menu.
 *
 * @author Serhii Prokopenko
 */

public interface MenuView {
    String GREETING = "Welcome to the translator".toUpperCase();
    String ADD_WORDS = "1. Add new words to the dictionary";
    String ENTER_AND_TRANSLATE = "2. Enter and translate a sentence.";
    String PRINT_DICTIONARY = "3. Print all dictionary.";
    String EXIT = "0. Exit";

    String CHOOSE_MENU_ITEM = "Choose a menu item (0-3)";
    String WRONG_INPUT = "Wrong input. Please try again.";

    /**
     * Default interface method
     * Displays menu.
     */
    default void printMenu() {
        System.out.println(GREETING + '\n' + ADD_WORDS + '\n' + ENTER_AND_TRANSLATE + '\n'  + PRINT_DICTIONARY + '\n' + EXIT );

    }

}
