package com.epam.task1.model;

import com.epam.task1.entities.LogEntry;

import java.util.ArrayList;
import java.util.List;

public class LogBook {

    private static List<LogEntry> logBook = new ArrayList<>();

    public LogBook() {}

    public List<LogEntry> getLogBook()  {
        return logBook;
    }

    public void setLogBook(List<LogEntry> logBook) {
        this.logBook = logBook;
    }

      public void addLogEntry (LogEntry record) {
        logBook.add(record);
    }


    @Override
    public String toString() {
        return logBook.toString();
    }

}
