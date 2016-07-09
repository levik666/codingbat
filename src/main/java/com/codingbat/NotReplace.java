package com.codingbat;

public class NotReplace {

    public String notReplace(String str) {
        String isNot = "is not";

        String result = "";
        str = " " + str + "  ";
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'i') {
                if (str.charAt(i + 1) == 's'
                        && !Character.isLetter(str.charAt(i + 2))
                        && !Character.isLetter(str.charAt(i - 1))) {
                    result += isNot;
                    i++;
                } else
                    result += "i";
            } else
                result += str.charAt(i);
        }
        return result.substring(1);
    }

}
