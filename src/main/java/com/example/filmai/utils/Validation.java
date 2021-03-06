package com.example.filmai.utils;

import java.net.HttpURLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static final String USERNAME_REGEX_PATTERN = "^[A-Za-z0-9]{5,13}$";
    public static final String PASSWORD_REGEX_PATTERN = "^[A-Za-z0-9!@#$%]{5,13}$";
    public static final String EMAIL_REGEX_PATTERN = "^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$";
    public static final String REGUSERNAME_REGEX_PATTERN = "^[A-Za-z0-9]{5,}$";
    public static final String REGPASSWORD_REGEX_PATTERN = "^[A-Za-z0-9!@#$%]{5,}$";

    public static boolean isValidUsername (String username){
        //Sukuriamos validacijos taisyklės pagal anksčiau apsirašytą šabloną
        Pattern pattern = Pattern.compile(USERNAME_REGEX_PATTERN);
        //Validacijos atitikmens sukūrimas palyginant vartotojo įvestą username su validacijos taisyklėmis
        Matcher matcher = pattern.matcher(username);
        //Grąžins true jeigu atitiks vartotojo susikurtas vardas mūsų susikurtą validaciją, priešingu atveju - false.
        return matcher.find();
    }

    public static boolean isValidPassword (String password) {
        Pattern pattern = Pattern.compile(PASSWORD_REGEX_PATTERN);
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

    public static boolean isValidEmail (String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    /*
    public static boolean isValidRegUsername (String regUsername) {
        Pattern pattern = Pattern.compile(REGUSERNAME_REGEX_PATTERN);
        Matcher matcher = pattern.matcher(regUsername);
        return matcher.find();
    }

    public static boolean isValidRegPassword (String regPassword) {
        Pattern pattern = Pattern.compile(REGPASSWORD_REGEX_PATTERN);
        Matcher matcher = pattern.matcher(regPassword);
        return matcher.find();
    }
      */
}
