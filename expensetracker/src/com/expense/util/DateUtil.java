package com.expense.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    private static final String DATE_FORMAT = "yyyy-MM-dd";

    // Convert String to Date
    public static Date convertStringToDate(String dateString) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        return dateFormat.parse(dateString);
    }

    // Convert Date to String
    public static String convertDateToString(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        return dateFormat.format(date);
    }
}
