package com.epam.task1.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator {
    private static final String validNameSurname = "[А-ЯЁA-Z][а-яёa-z]+";
    private static final String validBirthday = "(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d";
    private static final String validPhone = "^\\+?(38)?\\(?(0)[0-9]{2}\\)?[0-9]{3}\\-?[0-9]{2}\\-?[0-9]{2}$";
    private static final String validAddress = "[a-zA-Z0-9_]*";

    public DataValidator() {
    }


    public static boolean validateNameSurname(String nameSurname) {

        Pattern p = Pattern.compile(validNameSurname);
        Matcher m;
        m = p.matcher(nameSurname);

        return m.find();
    }

    public static boolean validateBirthday(String birthday) {

        Pattern p3 = Pattern.compile(validBirthday);
        Matcher m3;
        m3 = p3.matcher(birthday);

        return m3.find();
    }

    public static boolean validatePhone(String phone) {

        Pattern p4 = Pattern.compile(validPhone);
        Matcher m4;
        m4 = p4.matcher(phone);

        return m4.find();
    }
    public static boolean validateAddress(String address) {

        Pattern p4 = Pattern.compile(validAddress);
        Matcher m4;
        m4 = p4.matcher(address);

        return m4.find();
    }
}