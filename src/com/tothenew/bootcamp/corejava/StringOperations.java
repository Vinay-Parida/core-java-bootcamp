package com.tothenew.bootcamp.corejava;

public class StringOperations {

    static String usingBuffer() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("H")
                .append("E")
                .append('L')
                .append('L')
                .append("o");
        return stringBuffer.toString();
    }

    static String usingBuilder() {
        StringBuilder builder = new StringBuilder();
        builder.append("H")
                .append("E")
                .append('L')
                .append('L')
                .append("o");
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(usingBuffer());
        System.out.println(usingBuilder());
    }
}
