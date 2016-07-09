package com.codingbat;

public class MakeOutWord {

    public String makeOutWord(String out, String word) {
        int center = out.length()/2;
        return out.substring(0, center) + word + out.substring(center, out.length());
    }
}
