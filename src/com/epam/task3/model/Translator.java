package com.epam.task3.model;

import java.util.HashMap;
import java.util.Map;

public class Translator {
    private static Map<String, String> dictionary = new HashMap<>();

    public static Map<String, String> getDictionary() {
        return dictionary;
    }

    public static Map<String, String> addWordsPair(String keyWord, String valueWord) {
        dictionary.put(keyWord, valueWord);

        return dictionary;
    }

    public static String translateSentence(String sentence) {
        String resultString = "";
        String[] token = sentence.split(" ");
        for (int i = 0; i < token.length; i++) {
            if (dictionary.containsKey(token[i])) {
                resultString = resultString + dictionary.get(token[i]) + " ";
            } else resultString = resultString + token[i] + " ";

        }

        return resultString;
    }
}
