package com.codewithmosh.types.variables;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Date;

public class Main {

    public static void main(String[] args){
        int myAge = 30;
        int herAge = myAge;
        System.out.println(myAge);

        // PRIMITIVE TYPES ---------------------------------------
        // byte - 1 bytes - range -128, 127
        // short - 2 bytes - range -32K, 32K
        // int - 4 bytes - range -2B, 2B
        // long - 8 bytes
        // float - 4 bytes
        // double - 8 bytes
        // char - 2 bytes
        // boolean - 1 bytes

        byte age = 30;
        int viewsCount = 123_456_789;
        long viewCountHuge = 3_123_456_789L; // Compiler sees value as integer - add L
        float price = 10.99F; //by default decimal point seen as double - add F
        char letter = 'A'; // single char with single quotes
        boolean isEligible = true; // notice reserved key words

        // JRE knows the size needed for Primatives
        // Primatives dont have members

        // COMPLEX TYPES / REFERENCE TYPES -------------------------
        Date now = new Date();
        //now.getTime(); // Reference Types had members
        System.out.println(now);

        // MEMORY MANAGEMENT VERSES 
        byte x = 1;
        byte y = 2;
        System.out.println(x);

        Point point1 = new Point(1, 1); // variable holds address in memory - not actual value
        Point point2 = point1;
        point1.x = 2;

        System.out.println(point2);
    }
}
