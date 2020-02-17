package com.tothenew.bootcamp.corejava;

public class Operators {

    public static void main(String[] args) {
        // Assignment Operators
        int number = 10;
        int anotherNumber = -20;

        printNumbers(number, anotherNumber);

        arithmeticOperators(number, anotherNumber);
        unaryOperators(number, anotherNumber);
        relationalOperators(number, anotherNumber);
        conditionalOperators(number);
        ternaryOperator(number);
        bitwiseOperators(number);
        bitShiftOperators();
    }

    static void printNumbers(int number, int anotherNumber) {
        System.out.println("Number: " + number);
        System.out.println("Another Number: " + anotherNumber);
    }

    static void unaryOperators(int number, int anotherNumber) {
        // Unary Operators
        System.out.println("\nUnary Operators: \n");
        System.out.println("Increment: " + ++number);
        System.out.println("Increment: " + number++);
        System.out.println("Decrement: " + --anotherNumber);
        System.out.println("Decrement: " + anotherNumber--);

        printNumbers(number, anotherNumber);

        System.out.println("Negation: " + ~number); // minus of total positive value which starts from 0
        System.out.println("Negation: " + ~anotherNumber); // positive of total minus, positive starts from 0
        System.out.println("!true: " + !true);
        System.out.println("!false: " + !false);
    }

    static void bitShiftOperators() {
        System.out.println("\nBit Shift Operators: \n");
        System.out.println("10 << 2: " + (10 << 2)); // 10*2^2=10*4=40
        System.out.println("10 << 3: " + (10 << 3)); // 10*2^3=10*8=80
        System.out.println("20 << 2: " + (20 << 2)); // 20*2^2=20*4=80
        System.out.println("15 << 4: " + (15 << 4)); // 15*2^4=15*16=240

        System.out.println("10 >> 2: " + (10 >> 2)); // 10/2^2=10/4=2
        System.out.println("20 >> 2: " + (20 >> 2)); // 20/2^2=20/4=5
        System.out.println("20 >> 3: " + (20 >> 3)); // 20/2^3=20/8=2

        //For positive number, >> and >>> works same
        System.out.println("20 >> 2: " + (20 >> 2));
        System.out.println("20 >>> 2: " + (20 >>> 2));
        //For negative number, >>> changes parity bit (MSB) to 0
        System.out.println("-20 >> 2: " + (-20 >> 2));
        System.out.println("-20 >>> 2: " + (-20 >>> 2));
    }

    static void bitwiseOperators(int number) {
        // In bitwise &, all the expressions are evaluated while in conditional &&, if first condition is false,
        // others are not evaluated
        System.out.println("\nBitwise Operators: \n");
        System.out.println("& : " + (number != 0 & number == 10));
        System.out.println("| : " + (number != 0 | number == 10));
    }

    static void ternaryOperator(int number) {
        System.out.println("\nTernary Operator: \n");
        System.out.println(number > 10 ? "number > 10" : "number <= 10");
    }

    static void conditionalOperators(int number) {
        System.out.println("\nConditional Operators: \n");
        System.out.println("&& : " + (number != 0 && number == 10));
        System.out.println("|| : " + (number != 0 || number == 10));
    }

    static void relationalOperators(int number, int anotherNumber) {
        System.out.println("\nRelational Operators: \n");
        System.out.println("== : " + (number == anotherNumber));
        System.out.println("!= : " + (number != anotherNumber));
        System.out.println("> : " + (number > anotherNumber));
        System.out.println(">= : " + (number >= anotherNumber));
        System.out.println("< : " + (number < anotherNumber));
        System.out.println("<= : " + (number <= anotherNumber));
        System.out.println("instanceof: " + ("Some String" instanceof String));
    }

    static void arithmeticOperators(int number, int anotherNumber) {
        System.out.println("\nArithmetic Operators: \n");
        System.out.println("Sum: " + (number + anotherNumber));
        System.out.println("Difference: " + (number - anotherNumber));
        System.out.println("Product: " + (number * anotherNumber));
        System.out.println("Quotient: " + (number / anotherNumber));
        System.out.println("Remainder: " + (number % anotherNumber));
    }
}
