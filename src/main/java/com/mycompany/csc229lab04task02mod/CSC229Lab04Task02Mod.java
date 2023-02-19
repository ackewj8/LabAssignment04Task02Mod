/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc229lab04task02mod;
import java.util.Scanner;

/**
 *
 * @author willi
 * GitHub Link: https://github.com/ackewj8/LabAssignment04Task02Mod.git
 */
public class CSC229Lab04Task02Mod {
    static int gcd(int x, int y) { // Implementing the GCD function
        int gcdVal; // Stores the GCD of x and y
        if (x == y) {
            gcdVal = x;
        }
        else {
            if  (x > y) { // If x > y
                gcdVal = gcd(x - y, y);
            }
            else { // If x < y
                gcdVal = gcd(x, y - x);
            }
        }
        return gcdVal; // Returns the GCD of x and y
    }
    public static void main(String[] args) {
        // Scanner reads the user's input
        Scanner scnr = new Scanner(System.in);
        int a; // The first value
        int b; // The second value
        // Reading the value of a
        System.out.println("Please enter the first number: ");
        a = scnr.nextInt(); // a is assigned user's input
        // Reading the value of b
        System.out.println("Please enter the second number: ");
        b = scnr.nextInt(); // b is assigned user's input
        int result; // The GCD of a and b
        result = gcd(a, b); // Calling the gcd function
        // Printing the result of the gcd function
        System.out.println("Result is " + result + ".");
    }
}