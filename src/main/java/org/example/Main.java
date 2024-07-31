package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);
        integers.add(10); // Duplicate
        integers.add(30);
        integers.add(40);
        integers.add(20); // Duplicate

        // Remove duplicates using a Set
        Set<Integer> uniqueIntegers = new HashSet<>(integers);

        // Print the list of integers without duplicates
        System.out.println("List of integers without duplicates: " + uniqueIntegers);

        // Calculate sum and average
        try {
            int sum = 0; // Initialize sum
            // Advanced for-loop for each num in uniqueIntegers
            for (int num : uniqueIntegers) {
                sum += num; // Total sum logic
            }
            // Check if set is empty
            if (uniqueIntegers.isEmpty()) {
                throw new ArithmeticException("Cannot calculate average of an empty set.");
            }
            // Average logic
            double average = (double) sum / uniqueIntegers.size();
            // Print the results
            System.out.println("Sum of integers: " + sum);
            System.out.println("Average of integers: " + average);
        }
        // Handle ArithmeticException specifically for division by zero
        catch (ArithmeticException e) {
            System.err.println("Error calculating average: " + e.getMessage());
        }
        // Handle other exceptions
        catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
        finally {
            // Regardless of whether an exception occurred or not this finally still hits(?)
            System.out.println("Operation completed.");
        }
    }
}
