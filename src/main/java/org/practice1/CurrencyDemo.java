package org.practice1;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyDemo {
    public static void main(String[] args) {


        for (Currency c : Currency.getAvailableCurrencies()) {
//            System.out.println(c.getCurrencyCode());
//            System.out.println(c.getDisplayName());
//            System.out.println(c.getNumericCode());
            System.out.println(c.getDisplayName(new Locale("en", "in")));
            
        }

    }
}
