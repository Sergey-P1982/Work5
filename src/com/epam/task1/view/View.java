package com.epam.task1.view;

import com.epam.task1.entities.LogEntry;

import java.util.List;

public class View implements InputMenu {

    public void printRegister(String message, List<LogEntry> register) {
        System.out.println(message + register);

    }

    public void printMessage(String message) {
        System.out.print(message);

    }
}

