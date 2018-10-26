package com.epam.task2.view;

import java.util.Collection;

public class View implements InputMenu {


    public void printCollection(String message, Collection<Integer> collection) {
        System.out.println(message + collection);

//        for (Integer elemCollection: collection) {
//            System.out.println(elemCollection);


    }

    public void printMessage(String message) {
        System.out.print(message);

    }
}
