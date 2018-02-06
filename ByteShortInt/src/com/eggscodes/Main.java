package com.eggscodes;

public class Main {

    public static void main(String[] args) {
        byte myByteValue = 32;
        short myShortValue = 25_000;
        int myIntValue = 978_000;
        long myLongValue = (long) (((myByteValue + myShortValue + myIntValue) * 10) + 50000);

        System.out.println("myLongValue: " + myLongValue);
    }
}
