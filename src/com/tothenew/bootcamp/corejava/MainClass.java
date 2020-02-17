package com.tothenew.bootcamp.corejava;

import com.tothenew.bootcamp.corejava.staticimport.Constants;

public class MainClass {

    public static void main(String[] args) {
        useEnum(Numbers.ONE);
    }

    public static void print(String s) {
        switch (s) {
            case Constants.NUMBER:
                System.out.println(s);
        }
    }

    public static void useEnum(Numbers numbers) {
        switch (numbers) {
            case ONE:
                System.out.println(numbers);
                System.out.println(numbers.getNumericValue());
                System.out.println(numbers.getLowerCase());
                System.out.println(numbers.getUpperCase());
        }
    }
}
