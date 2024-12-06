package com.expense.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationUtil {

    // Validate if the given string is a valid email
    public static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    // Validate if the given string is a valid phone number
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^\\+?[1-9][0-9]{7,14}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    // Validate if the string is a valid password (at least 8 characters, 1 uppercase, 1 digit)
    public static boolean isValidPassword(String password) {
        String regex = "^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
