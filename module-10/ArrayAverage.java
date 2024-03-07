/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrayaverage;

/**
 *
 * @author Taylor King
 * @date 3/2/24
 * @assignment 10.2
 * @description This program uses arrays of numbers with overloads of short, int,
 * long and double to find their averages.
 */
public class ArrayAverage {

    public static short average(short[] array) {
        short sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        short[] shortArray = {1, 2, 3, 4, 5};
        int[] intArray = {10, 20, 30};
        long[] longArray = {100, 200, 300, 400};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};

        // Testing and displaying results
        System.out.println("Short Array: " + java.util.Arrays.toString(shortArray));
        System.out.println("Average: " + average(shortArray));

        System.out.println("\nInt Array: " + java.util.Arrays.toString(intArray));
        System.out.println("Average: " + average(intArray));

        System.out.println("\nLong Array: " + java.util.Arrays.toString(longArray));
        System.out.println("Average: " + average(longArray));

        System.out.println("\nDouble Array: " + java.util.Arrays.toString(doubleArray));
        System.out.println("Average: " + average(doubleArray));
    }
}