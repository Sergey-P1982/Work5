package com.epam.task3.view;

import com.epam.task2.view.InputMenu;

import java.util.Collection;
import java.util.Map;

public class View implements MenuView {

    public void printDictionary(String message, Map<String, String> dictionary) {
        System.out.println(message + dictionary);

    }

    public void printMessage(String message) {
        System.out.println(message);

    }
}
