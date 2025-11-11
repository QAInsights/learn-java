package com.q.p.inh;

public class TextBox extends UIControl {

    private String text = "";

    public TextBox() {

    }

    public TextBox(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
