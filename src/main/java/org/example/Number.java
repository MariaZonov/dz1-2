package org.example;

public class Number {
    public static int result(int number) {

        {
            int result = 0;
            if (number > 0 && number < 10) {
                result = 53;
            } else if (number > 25 && number < 78) {
                result = 41;
            } else if (number > 125) {
                result = 112;
            } else {
                result = -1;
            }
            return result;
        }
    }
}
