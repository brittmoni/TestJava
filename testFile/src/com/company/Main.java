package com.company;

public class Main {

    public static void main(String[] args) {

        int testInt = 7;
        System.out.println(testInt);

        byte testByte = Byte.MAX_VALUE;
        System.out.println(testByte);

        byte newTestByte = Byte.MIN_VALUE;
        System.out.println(newTestByte);

        long testLong = Long.MAX_VALUE;
        System.out.println(testLong);

        long newTestLong = Long.MIN_VALUE;
        System.out.println(newTestLong);

        short testShort = Short.MAX_VALUE;
        System.out.println(testShort);

        short newTestShort = Short.MIN_VALUE;
        System.out.println(newTestShort);

        long mathProb = 2525 / 5;
        System.out.println(mathProb);

        //Example of casting
        float newMathProb = (float) (2525.25 / 5);
        System.out.println(newMathProb);
    }
}
