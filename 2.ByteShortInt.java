package com.nishantkumar;

public class Main {

    public static void main(String[] args) {

        // byte has width of 8
        byte myByteMInValue = -128; //-2^7
        byte myByteMaxValue = -128;  // -2^7 - 1
        byte myNewByteValue = (byte) (myByteMInValue / 2);
        System.out.println("myNewBYteVal = " + myNewByteValue);

        // short has a width of 16
        short myShortMinValue = -32768; // -2^15
        short myShortMaxValue = 32767; //2^15 - 1

        // int has a width of 32

        int myIntMinValue = -2_147_438_648; //2^31
        int myIntMaxValue = 2_147_438_647;

        //long has 64 bit width
        long myLongValue = -9_223_372_036_854_775_808L; // 2^63
            double myNewLongValue =myLongValue/2;

        byte b = 10;
        short s = 20;
        int i = 30;
        long  l = (5000L + 10L * (b + s + i)) ; // need typecasting to store short and byte
        short myShortVal = (short) (5000 + 10 * (b +s + i));
        System.out.println(l);
        System.out.println(myShortVal);
    }
}
