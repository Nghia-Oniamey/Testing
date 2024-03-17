package org.example.lab2;

public class Calculator {

    public int total (int a, int b){
        return a + b;
    }

    public int effectiveness (int a, int b){
        return a - b;
    }

    public int calculateVolume (int a, int b){
        return a * b;
    }

    public int factorial (int a){
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

}
