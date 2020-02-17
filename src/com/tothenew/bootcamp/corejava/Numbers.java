package com.tothenew.bootcamp.corejava;

public enum Numbers {
    ONE(1, "one", "ONE"),
    TWO(2, "two", "TWO"),
    THREE(3, "three", "THREE");

    private int numericValue;
    private String lowerCase;
    private String upperCase;

    Numbers(int numericValue, String lowerCase, String upperCase) {
        this.numericValue = numericValue;
        this.lowerCase = lowerCase;
        this.upperCase = upperCase;
    }

    public int getNumericValue() {
        return numericValue;
    }

    public String getLowerCase() {
        return lowerCase;
    }

    public String getUpperCase() {
        return upperCase;
    }
}
