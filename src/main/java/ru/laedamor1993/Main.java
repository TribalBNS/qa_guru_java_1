package ru.laedamor1993;

public class Main {
    public static void main(String[] args) {
        long aLong = 3000000000L;
        int aInt = (int) aLong;
        short aShort = (short) aInt;
        byte aByte = (byte) aShort;
        double aDouble = 1.123123123123d;
        float aFloat = (float) aDouble;
        int aSumInt = (int) (aInt + aFloat);
        float aSumFloat = aInt + aFloat;
        System.out.println("overwhelmed Int " + aInt);
        System.out.println("overwhelmed Short " + aShort);
        System.out.println("overwhelmed Byte " + aByte);
        System.out.println("overwhelmed Float " + aFloat);
        System.out.println("overwhelmed Long?... No, thanks");
        System.out.println("Where will all the floaters go? " + aSumInt);
        System.out.println("Here they are! " + aSumFloat);
    }
}