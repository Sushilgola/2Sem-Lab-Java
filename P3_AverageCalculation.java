
/**
 * Problem 3: Average Calculation
 * You are tasked with writing a module for a statistical analysis tool
 * that calculates the average of valid numeric values read from a text file.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class P3_AverageCalculation {
    public static void main(String[] args) {
        try {
            File inputFile = new File("input.txt");

            if (!inputFile.exists()) {
                throw new Exception("Error: File not found!");
            }

            Scanner sc = new Scanner(inputFile);
            ArrayList<Double> validValues = new ArrayList<>();

            while (sc.hasNext()) {
                String value = sc.next().replace(",", " ");

                try {
                    double num = Double.parseDouble(value);
                    validValues.add(num);
                } catch (NumberFormatException e) {

                }
            }

            sc.close();

            if (!validValues.isEmpty()) {
                double sum = 0;

                for (double num : validValues) {
                    sum = sum + num;
                }

                double average = sum / validValues.size();
                System.out.println("Average: " + average);
            } else {
                System.out.println("The input.txt file is empty or has no valid numbers.");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
