package com.eggscodes;

public class Main {

    public static void main(String[] args) {
        // this considered a literal
        // int has width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        // useful for lots of small calculations
        // byte hsa width of 8
        byte myByteValue = -128;

        // short has width of 16
        short myShortValue = -32768;

        // long has width of 64
        long myLongValue = 100L;
    }
}
