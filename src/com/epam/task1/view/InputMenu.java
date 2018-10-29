package com.epam.task1.view;

public interface InputMenu {

    String ADD_LOG_ENTRY = "1. MAKE A NEW LOG ENTRY";
    String DISPLAY_ALL = "2. SHOW ALL LOG ENTRIES";
    String EXIT_PROGRAM = "0. EXIT PROGRAM";

    String WRONG_INPUT = "Wrong input. Please try again. ";



    String ENTER_SURNAME = "Enter a student's surname, for example 'Johnson': ";
    String ENTER_NAME = "Enter a student's name, for example 'Boris': ";
    String ENTER_BIRTHDAY = "Enter a student's birthday, format DD/MM/YYYY, DD-MM-YYYY or DD.MM.YYYY: ";
    String ENTER_PHONE = "Enter a student's phone, for example +38(0хх)ххххххх: ";
    String ENTER_ADDRESS = "Enter a student's address: ";

    default void printMenu() {
        System.out.println(ADD_LOG_ENTRY + '\n' + DISPLAY_ALL + '\n' + EXIT_PROGRAM);

    }
}

