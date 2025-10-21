package com.ass6;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] unsortedArray = new int[40];
        

        for(int i = 0; i < unsortedArray.length; i++){
            unsortedArray[i] = (int)(Math.random() * 1000) + 1;
        }

        System.out.println(Arrays.toString(unsortedArray));

        Arrays.sort(unsortedArray);

        System.out.println(Arrays.toString(unsortedArray));

        System.out.println("Enter number in array ");
        int num = scan.nextInt();

        System.out.println("Enter number in array: ");
        int num2 = scan.nextInt();

        System.out.println("Enter number not in array: ");
        int num3 = scan.nextInt();

        System.out.println("Binary search results");
        System.out.println(Arrays.binarySearch(unsortedArray, num));
        System.out.println(Arrays.binarySearch(unsortedArray, num2));
        System.out.println(Arrays.binarySearch(unsortedArray, num3));

    }
}