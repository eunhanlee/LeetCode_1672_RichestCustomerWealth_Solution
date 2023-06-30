package org.example;

public class Solution {

    /**
     * Calculates the maximum wealth among customers.
     *
     * @param accounts a 2D array representing the wealth of customers and their accounts
     * @return the maximum wealth among the customers
     */
    public int maximumWealth(int[][] accounts) {
        int max = 0; // Initialize the maximum wealth to 0

        for (int[] listOfWealth : accounts) {
            int tempSum = 0; // Initialize a temporary sum to 0 for each customer

            for (int wealth : listOfWealth) {
                tempSum += wealth; // Add the wealth of each account to the temporary sum
            }

            max = Math.max(max, tempSum); // Update the maximum wealth if the temporary sum is greater
        }

        return max; 
    }
}
