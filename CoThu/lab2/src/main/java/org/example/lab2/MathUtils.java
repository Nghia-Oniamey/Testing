package org.example.lab2;

public class MathUtils {

    public int total (int a, int b){
        return a + b;
    }

    public int effectiveness(int... a){
        if (a.length == 0) {
            throw new ArithmeticException("Need properties.");
        }

        int result = a[0];

        for (int i = 1; i < a.length; i++) {
            result -= a[i];
        }

        return result;
    }

}
