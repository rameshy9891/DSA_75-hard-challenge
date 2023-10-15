package com.masai.dayseventeen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxOccurringElement {
	
	
	
	/*
	 * sample input:                 sample output:
	 * 5
	 * 1 5 0 6 0                          0
	 * 
	 * 
	 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of elements in the array
        int[] arr = new int[n];

        // Read the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int element : arr) {
            // Update the frequency map
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        int maxFrequency = 0;
        int maxOccurringElement = 0;

        // Iterate through the frequency map to find the maximum occurring element
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                maxOccurringElement = entry.getKey();
            }
        }

        System.out.println(maxOccurringElement);
    }
}

