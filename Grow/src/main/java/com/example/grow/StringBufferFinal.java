package com.example.grow;

public class StringBufferFinal {
    public static void main(String[] args) {
        final StringBuffer buffer = new StringBuffer("1");
        buffer.append("2");
        System.out.println(buffer.toString());
    }
}
