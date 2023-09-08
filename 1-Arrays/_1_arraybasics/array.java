package _1_arraybasics;

import java.util.Scanner;

public class array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5]; // Initialization of array


        // Add Element to array
        System.out.println("Enter numbers to add in array.");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();


        // Print Elements
        System.out.println("Printing an error");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        // delete Element
        int[] newArr = new int[5]; // create new array
        int trt = 4; // Add a trt to remove
        System.out.println("Array after deleting an element: "+ trt);
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != trt) { // Copy element that are not equal to trt into new array
                newArr[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < newArr.length; i++) { // Print the new array
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
        System.out.println("worldddd-is-great");
    }
}
