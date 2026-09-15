/**
 *  Java program to create, modify, display elements and size of HashMap instance, and clear it.
 */

package com.mycollections;

import java.util.HashMap;
import java.util.Map;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating HashMap instance.
        Map<Double, Integer> myMap = new HashMap<>();

        // Add elements to myMap.
        myMap.put(4.9, 1);
        myMap.put(5.4, 8);
        myMap.put(3.2, 9);

        // Printing size of myMap.
        System.out.println("Size is: " + myMap.size());

        System.out.println("Map:");

        // Printing all elements of myMap.
        for(Map.Entry elements : myMap.entrySet()) {
            System.out.println(elements);
        }

        // Remove elements with a key 4.9.
        myMap.remove(4.9);

        System.out.println("Map:");

        // Printing all elements of myMap.
        for(Map.Entry elements : myMap.entrySet()) {
            System.out.println(elements);
        }

        // Deleting all elements.
        myMap.clear();

        // Printing size of myMap.
        System.out.println("Size is: " + myMap.size());
        
    }
}