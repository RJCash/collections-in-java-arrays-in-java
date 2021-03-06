package com.theironyard;

import java.time.LocalDate;
import java.util.Random;

/**
 * This is another kata exercise. Follow the instructions below and implement
 * the methods as described.
 */
public class ArrayKatas {

    /**
     * Using array literal syntax and the Random class, create a static method
     * named fiveRandomInts() that accepts no arguments and returns a new array
     * containing five random integers.
     *
     * EG: [366316239, 1012739128, 1516029826, -1290176332, 1661141950]
     *
     * Note that the return type for an array of ints would be `int[]`.
     *
     * @return an array of five random ints
     */
    // todo: create fiveRandomInts() static method
    public static int[] fiveRandomInts(){
        Random ran = new Random();
        int[] randomInts = new int[]{ran.nextInt(), ran.nextInt(), ran.nextInt(), ran.nextInt(), ran.nextInt()};

        return randomInts;

    }
    /**
     * Create a static method named threeArbitraryDates() that returns an array
     * of three LocalDate objects. Do not use array literal syntax in this
     * method.
     *
     * @return an array of three LocalDate objects
     */
    // todo: create threeArbitraryDates() method
    public static LocalDate[] threeArbitraryDates(){
        LocalDate[] objects = new LocalDate[3];
        return objects;
    }
    /**
     * Create a static method named nullsToArbitraryStrings() that accepts an
     * array of String objects. This array will always have five elements. The
     * method should set any null values in the provided array to any arbitrary
     * String. For example, if you receive this array:
     *
     * ["I", null, "food", "cat", null]
     *
     * Then a valid return value would be:
     *
     * ["I", "car", "food", "cat", "elephant"]
     *
     * Any existing String values in the array should be left unchanged.
     *
     * This method should return a string array with five elements, where any
     * null elements have been replaced with arbitrary strings.
     *
     * Note that you do not need to set the size of the array in the argument.
     *
     * //@param source an array of five Strings, some of which are null.
     * @return an array of five string where null values have been replaced with arbitrary strings
     */
    // todo: create nullsToArbitraryStrings() method
    public static String[] nullsToArbitraryStrings(String[] source){


       if(source[0] == null){
            source[0] = "yes";
        }
       if(source[1] == null){
            source[1] ="I";
        }

        if(source[2] == null){
            source[2] ="car";
        }
        if(source[3] == null){
            source[3] ="sit";
        }

        if(source[4] == null){
            source[4] ="cat";
        }


        return source;


    }
    /**
     * Create a static method named arrayIndexes() that accepts a single integer
     * argument, n. The method should create a new array of integers of this
     * length. For example, if n is 5, an array of five ints should be created.
     *
     * The array's values should be set to their index. So, an array of five
     * ints should be: [0, 1, 2, 3, 4]
     *
     * @param n The length of the array to create
     * @return An array of ints, starting at 0 and continuing to n-1
     */
    // todo: create arrayIndexes() method
    public static int[] arrayIndexes(int n){

        int[] array = new int[n];
        int counter =0;

        for(int i = 0; i < n; i++){
            array[i] += counter;
            counter++;
        }

        return array;
    }
}
