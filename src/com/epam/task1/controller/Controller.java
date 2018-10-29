package com.epam.task1.controller;

import com.epam.task1.entities.LogEntry;
import com.epam.task1.model.LogBook;
import com.epam.task1.view.DataScanner;
import com.epam.task1.view.View;

public class Controller {
    View view = new View();
    DataScanner dataScanner = new DataScanner();
    LogBook model = new LogBook();

    public void run() {
        int menuItem = -1;
        do {
            menuItem = dataScanner.scanMenuItem(menuItem);
            executeMenuItem(menuItem);

        } while (menuItem != 0);
    }

    private void executeMenuItem(int menuItem) {
        switch (menuItem) {
            case (1):
                model.addLogEntry(new LogEntry(dataScanner.scanNameSurname(view.ENTER_SURNAME),
                        dataScanner.scanNameSurname(view.ENTER_NAME),
                        dataScanner.scanBirthday(view.ENTER_BIRTHDAY),
                        dataScanner.scanPhone(view.ENTER_PHONE),
                        dataScanner.scanAddress(view.ENTER_ADDRESS)));
                view.printMessage("Log entry has been added\n");

                break;
            case (2):
                view.printRegister("Curator's register", model.getLogBook());
                break;
            case (0):
                view.printMessage("Bye!");
                System.exit(0);
                break;
        }
    }
}

