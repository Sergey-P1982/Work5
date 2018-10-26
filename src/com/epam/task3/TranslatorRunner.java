package com.epam.task3;

import com.epam.task3.controller.Controller;

public class TranslatorRunner {
    public static void main(String[] args) {
        new Controller().run();
    }
}
// OUTPUT:
//        WELCOME TO THE TRANSLATOR
//        1. Add new words to the dictionary
//        2. Enter and translate a sentence.
//        3. Print all dictionary.
//        0. Exit
//        Choose a menu item (0-3):
//        1
//        Add one english word:
//        cat
//        Add its russian value word:
//        кот
//        One english word and its russian value was added to the dictionary
//
//        Back to menu press 'Y'/ Exit - press any other key
//        y
//        WELCOME TO THE TRANSLATOR
//        1. Add new words to the dictionary
//        2. Enter and translate a sentence.
//        3. Print all dictionary.
//        0. Exit
//        Choose a menu item (0-3):
//        1
//        Add one english word:
//        dog
//        Add its russian value word:
//        собака
//        One english word and its russian value was added to the dictionary
//
//        Back to menu press 'Y'/ Exit - press any other key
//        y
//        WELCOME TO THE TRANSLATOR
//        1. Add new words to the dictionary
//        2. Enter and translate a sentence.
//        3. Print all dictionary.
//        0. Exit
//        Choose a menu item (0-3):
//        2
//        ADD a sentence to translate:
//        cat dislike dog
//        Translation: кот dislike собака
//        Back to menu press 'Y'/ Exit - press any other key
//        y
//        WELCOME TO THE TRANSLATOR
//        1. Add new words to the dictionary
//        2. Enter and translate a sentence.
//        3. Print all dictionary.
//        0. Exit
//        Choose a menu item (0-3):
//        3
//        Your dictionary:
//        {cat=кот, dog=собака}
//        Back to menu press 'Y'/ Exit - press any other key
//        n
//
//        Process finished with exit code 0