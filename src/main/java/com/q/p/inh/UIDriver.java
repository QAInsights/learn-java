package com.q.p.inh;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class UIDriver {

    public static void main(String[] args) {
        TextBox t = new TextBox();
        t.setText("Hello");
        t.setEnabled();
        System.out.println(t.getText() + " " + t.isEnabled());

        t.setDisabled();
        System.out.println(t.getText() + " " + t.isEnabled());

        Object o = new Object();
        String a = new String("hello");

        System.out.println(o.getClass().getMethods());
        Set<String> s = new HashSet<>();
        for (Method m : a.getClass().getMethods()) {
            s.add(m.getName());
        }
        System.out.println(s);
    }
}
