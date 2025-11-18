package org.hackerrank.strings;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexPattern {
    public static void main(String[] args) {
        try {
            Pattern p = Pattern.compile("[AZ[a-z](a-z)");
            if (!p.pattern().isEmpty()) {
                System.out.println("valid");
            }
        } catch (PatternSyntaxException e) {
            System.out.println("Invalid");
        }
    }
}
