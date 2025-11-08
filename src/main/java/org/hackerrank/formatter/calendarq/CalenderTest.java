package org.hackerrank.formatter.calendarq;

import java.io.*;
import java.time.DayOfWeek;
import java.util.Calendar;

public class CalenderTest {
    public static void main(String[] args) throws IOException {

        String res = Result.findDay(11, 6, 2025);
        System.out.println(res);
    }


}

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        final String[] DAYS = {
                "Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"
        };


        if (year > 2000 && year < 3000) {
            Calendar c = Calendar.getInstance();
            c.set(Calendar.MONTH, month - 1);
            c.set(Calendar.YEAR, year);
            c.set(Calendar.DATE, day);

            return DAYS[c.get(Calendar.DAY_OF_WEEK) - 1];
        }
        return "Enter a valid date";

    }

}
