package com.epam.task2.controller;

import com.epam.task2.model.CollectionCreater;
import com.epam.task2.view.DataScanner;
import com.epam.task2.view.InputMenu;
import com.epam.task2.view.View;

public class Controller {
    private CollectionCreater model = new CollectionCreater();
    private View view = new View();

    public void run(){
        view.printMessage(InputMenu.LIST_INFO);
        int elemNumber = DataScanner.checkNumber(InputMenu.ELEM_NUMBERS);
        int rangeNumber = DataScanner.checkNumber(InputMenu.RANGE_NUMBER);
        view.printCollection("List of random integers: ", model.createList(elemNumber, rangeNumber));

        view.printMessage(InputMenu.SET_INFO);
        elemNumber = DataScanner.checkNumber(InputMenu.ELEM_NUMBERS);
        rangeNumber = DataScanner.checkNumber(InputMenu.RANGE_NUMBER);
        view.printCollection("Set of random integers: ", model.createSet(elemNumber, rangeNumber));

    }
}
