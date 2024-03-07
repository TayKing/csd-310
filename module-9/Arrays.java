/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays;

/**
 *
 * @author Taylor King
 * @date 3/1/24
 * @assignment 9.2 Arrays
 * @description This program gets 20 integers from the user and stores them in an array
 * then it uses uses that array to find the lowest, highest, sum and average among
 * those numbers.
 */
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];
        
        // Read and fill the array
        System.out.println("Enter 20 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Calculate highest, lowest, sum, and average
        int highest = numbers[0];
        int lowest = numbers[0];
        int sum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;
        
        // Display results
        System.out.println("Highest value entered: " + highest);
        System.out.println("Lowest value entered: " + lowest);
        System.out.println("Sum of the numbers entered: " + sum);
        System.out.println("Average of the numbers entered: " + average);
        
        scanner.close();
    }
}