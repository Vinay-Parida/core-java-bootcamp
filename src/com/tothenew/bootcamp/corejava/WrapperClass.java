package com.tothenew.bootcamp.corejava;

public class WrapperClass {

    public static void main(String[] args) {
        int num = 5;
        Integer integer = num; // Autoboxing
        Integer i1 = new Integer(num);

        Integer anotherInteger = new Integer(10);
        int n = anotherInteger; // Unboxing
    }
}
