package com.softech;

public class Main {
    public static void main(String[] args){
        // Getting to know primitive data types - the byte, short, int and long
        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println(myTotal);

        // byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue / 2);

        // long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807l;

        // 1. Create a byte variable and set it to any valid byte number
        // 2. Create a short variable and set to any valid short number
        // 3. Create a int variable and set it to any valid int number
        // 4. Create a variable of type long, and make it equal to
        //      50000 + 10 times the sum of the byte, plus the short plus the int

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000l + 10l * (byteValue + shortValue + intValue);
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);

        // Getting to know primitive data types - float and double
        // width of int = 32 (4 bytes)
        int myIntValue = 5 / 3;
        // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        // width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of Kilograms for the number above and store in a variable
        // 3. Print out the result
        //
        // NOTES: 1 pound is equal to 0.45359237 kilograms

        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237;
        System.out.println("Kilograms = " + convertedKilograms);

        //Getting to know primitive data types - char and boolean
        char myChar = '\u00A9';
        System.out.println("Unicode output was: " + myChar);

        // 1. Find the code for the registered symbol on the same line as the copyright symbol
        // link https://unicode-table.com/en
        // 2. Create a variable of type char and assign it the unicode value for that symbol
        // 3. Display in on screen

        char registeredSymbol = '\u00AE';
        System.out.println("Registered symbol = " + registeredSymbol);

        /* Understanding Strings And Finishing Up Primitive Data Types */
        String myString = "This is a string";
        System.out.println("myString is equal to: " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to: " + myString);
        myString = myString + " \u00A9 2015";
        System.out.println("myString is equal to: " + myString);

        String numberString = "12.3";
        numberString = numberString + "32.4";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);
        double doubleNumber = 120.33;
        lastString = lastString + doubleNumber;
        System.out.println("lastString is equal to " + lastString);
    }
}
