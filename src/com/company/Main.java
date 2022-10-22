/*
 *
 * Classname: Main
 *
 * 04 June 2020
 *
 * Copyright Zaichenko Vladyslav KNUTE
 *
 * Module 2 task 1
 *
 * Create a class from the attached document according
 * to the order in your group. The class must contain
 *
 * 1. Constructor.
 * 2. Getters/Setters.
 * 3. 5 methods.
 * 4. Override toString() method
 * 5. Override hash() and equals() methods.
 *
 */

package com.company;

public class Main {

    public static void main(String[] args) {

        // First parallelogram - parallelogram1

        Parallelogram parallelogram1 = new Parallelogram(4, 4, Math.PI / 6);

        // Example of using toString() method

        System.out.println(parallelogram1);

        // Example of using hash() method

        System.out.println("Hash Code parallelogram1 = " + parallelogram1.hashCode());

        // Second parallelogram - parallelogram2

        Parallelogram parallelogram2 = new Parallelogram(5, 5, Math.PI / 6);

        // Comparison of parallelograms equals() method

        System.out.println("parallelogram1 is equals to parallelogram2 - " + parallelogram1.equals(parallelogram2));
    }
}
