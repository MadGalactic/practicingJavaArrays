package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListMain {
    public static void main(String... args){
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(100);
        ArrayList arrayList3 = new ArrayList(arrayList2);

        ArrayList<String> colors = new ArrayList<String>();
        List arrayList4 = new ArrayList();
        Collection arrayList5 = new ArrayList<>();

        colors.add("pink");
        colors.add("green");
        colors.add("orange");
        colors.add(1, "blue");

        // need to use size rather than length to determine length of list
        // need to use get method to retrieve the element at the indexed position of the list
        for(int i=0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        for(String color : colors) {
            System.out.println(color);
        }

        colors.remove("orange");
        colors.remove(2);

        colors.forEach(color -> {
            System.out.println(color);
        });

        for(int i=0; i < colors.size(); i++) {
            colors.remove(i);
        }
        System.out.println(colors);

        //how to convert between a list and basic array
        Object[] colorObjectArray = colors.toArray();
        String[] colorArray = colors.toArray(new String[0]);

        // lists created from arrayList are semi-immutable. items in the array can be changed but not deleted
        String[] shapes = new String[]{"Square", "Circle", "Triangle"};
        List shapeList = Arrays.asList(shapes);
        System.out.println(shapeList);
        System.out.println(shapeList.getClass().getName());
        System.out.println(colors.getClass().getName());

        //  lists created through the list interface are immutable
        List shapeList2 = List.of(shapes);

        // to create a basic arrayList from a Java array, loop through the arrayList and add elements to an arrayList one at a time
        List<String> shapeList3 = new ArrayList<>();
        for(String shape: shapes) {
            shapeList3.add(shape);
        }
        System.out.println(shapeList3);

        Object[] shapes2 = shapeList3.toArray();

    }


}
