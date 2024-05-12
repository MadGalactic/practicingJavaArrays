package com.example;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ArrayMain {

    public static void main(String[] args) {
        int [] ids = new int[10];
        System.out.println(ids[5]);

        String[] fruits = new String[] {"cherries", "apples", "pineapples"};
        System.out.println(fruits[0]);

        int [] id2;
        int [] id3;
        int [] id4;
        int [] id5;
        int [] id6, id7, id8;

        System.out.println(fruits.length);

        for(int i = 0; i < ids.length; i++){
            ids[i] = i * i;
            System.out.println(ids[i]);
        }

        /* another for-loop variation that allows you to look through an array.
        the disadvantage to this type of loop is that you cant assign a value to a variable while looping,
        but the advantage is that you don't have to worry about going out of bounds by messing up the iterator */
        for(String fruit: fruits) {
            System.out.println(fruit);
        }


        /*
            Java can't print arrays without the help of the Arrays class. Otherwise, it will just print the memory in address of the array
         */
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));


        /*
            binary search only works if the array is sorted first. otherwise the result is a negative number
         */
        int[] fibArray = new int[] {0, 1, 5, 2, 3, 1, 8, 13};
        Arrays.sort(fibArray);
        System.out.println(Arrays.binarySearch(fibArray, 3));


    /*
        ARRAY COMPARISON
        array1.equals(array2); Memory address comparison

        Arrays.equals(array1, array2); Same elements in same order comparison

        Arrays.compare(array1, array2); Smaller, equals, bigger comparison

        Arrays.mismatch(array1, array2); comparison to find where arrays differ
     */

    String[] myTeams = {"Aston Villa", "Manchester City", "Barcelona", "Wrexham"};
    String[] notMyTeams = {"Aston Villa", "Manchester City", "Barcelona", "Wrexham", "Liverpool"};


//        Arrays.sort(myTeams);
//        Arrays.sort(notMyTeams);
        System.out.println(Arrays.mismatch(myTeams, notMyTeams));

        // printing args passed in through the configurations
        System.out.println(Arrays.toString(args));

        int[][] multiArray = new int[3][3];
        String[][] multiArray2 = new String [3][10];

        String[][] njCitiesGrouped = new String[][]{
                {"Paterson", "Clifton", "Passaic"},
                {"Philadelphia", "Fishtown", "Lancaster"},
                {"Hartford"}
        };

        for (int i = 0; i < njCitiesGrouped.length; i++) {
            for(int ii = 0; ii < njCitiesGrouped[i].length; ii++) {
                System.out.println(njCitiesGrouped[i][ii]);
            }
        }

    /*
    does the same thing as the above, just a more concise way of writing
     */
        for(String[] row : njCitiesGrouped) {
            for(String city : row) {
                System.out.println(city);
            }
        }

    }
}
