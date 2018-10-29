package com.epam.task1;

import com.epam.task1.controller.Controller;

public class LogRunner {
    public static void main(String[] args) {
        new Controller().run();


//
//        LogEntry log1 = new LogEntry ("Petrov","Petr", "31-10-1999",
//                "+38066-111-22-33", "Yangelya str, 4, 45" );
//        LogEntry log2 = new LogEntry ("Bykov","Oleh", "15-01-2000",
//                "+38067-222-33-44", "Grand av, 5, 105" );
//        LogEntry log3 = new LogEntry ("Tkachenko","Olga", "10-06-1998",
//                "+38093-333-44-55", "Flower str, 10, 19" );
//
//        LogBook.addLogEntry(log1);
//        LogBook.addLogEntry(log2);
//        LogBook.addLogEntry(log3);
//
//        System.out.println(LogBook.getRegisterBook());
    }

}
//OUTPUT:
//        1. MAKE A NEW LOG ENTRY
//        2. SHOW ALL LOG ENTRIES
//        0. EXIT PROGRAM
//        Choose a menu item (0-3): Петренко
//        Wrong input. Please try again. 1
//        Enter a student's surname, for example 'Johnson': Петренко
//        Enter a student's name, for example 'Boris': Степан
//        Enter a student's birthday, format DD/MM/YYYY, DD-MM-YYYY or DD.MM.YYYY: 12.01.2010
//        Enter a student's phone, for example +38(0хх)ххххххх: +38(050)2223344
//        Enter a student's address: Kyiv, Prorizna, 25 104
//        Log entry has been added
//        1. MAKE A NEW LOG ENTRY
//        2. SHOW ALL LOG ENTRIES
//        0. EXIT PROGRAM
//        Choose a menu item (0-3): 2
//        Curator's register[LogEntry{Surname='Петренко', Name='Степан', Birthday='12.01.2010',Phone='+38(050)2223344', Address='Kyiv, Prorizna, 25 104'}
//        ]
//        1. MAKE A NEW LOG ENTRY
//        2. SHOW ALL LOG ENTRIES
//        0. EXIT PROGRAM
//        Choose a menu item (0-3): 1
//        Enter a student's surname, for example 'Johnson': Smith
//        Enter a student's name, for example 'Boris': Will
//        Enter a student's birthday, format DD/MM/YYYY, DD-MM-YYYY or DD.MM.YYYY: 25.09.1968
//        Enter a student's phone, for example +38(0хх)ххххххх: +38(066)5556677
//        Enter a student's address: 330 Bob Hope Dr Burbank, CA 91523
//        Log entry has been added
//        1. MAKE A NEW LOG ENTRY
//        2. SHOW ALL LOG ENTRIES
//        0. EXIT PROGRAM
//        Choose a menu item (0-3): 2
//        Curator's register[LogEntry{Surname='Петренко', Name='Степан', Birthday='12.01.2010',Phone='+38(050)2223344', Address='Kyiv, Prorizna, 25 104'}
//        , LogEntry{Surname='Smith', Name='Will', Birthday='25.09.1968',Phone='+38(066)5556677', Address='330 Bob Hope Dr Burbank, CA 91523'}
//        ]
//        1. MAKE A NEW LOG ENTRY
//        2. SHOW ALL LOG ENTRIES
//        0. EXIT PROGRAM
//        Choose a menu item (0-3): 0
//        Bye!
//        Process finished with exit code 0