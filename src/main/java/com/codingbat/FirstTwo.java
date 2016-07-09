package com.codingbat;

public class FirstTwo {

    public String firstTwo(String str) {
        if (str.isEmpty()){
            return "";
        } else if (str.length() <= 1){
            return str;
        }

        return str.substring(0, 2);
    }
}
