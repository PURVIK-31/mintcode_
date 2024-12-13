/**
 * @author Purvik
 * Collection of Array-based problem solutions
 * Date: 13-Dec-2024
 */

 import java.util.*;

 public class ArraySolutions {
     // Q.1: Write a program to print array elements
     public static void printArray(int[] arr) {
         System.out.println("\nQ.1: Printing array elements:");
         for (int element : arr) {
             System.out.print(element + " ");
         }
         System.out.println();
     }
 
     // Q.2: Write a program to find the largest elements in array
     public static int findLargest(int[] arr) {
         if (arr.length == 0) return Integer.MIN_VALUE;
         
         int largest = arr[0];
         for (int i = 1; i < arr.length; i++) {
             if (arr[i] > largest) {
                 largest = arr[i];
             }
         }
         return largest;
     }
 
     // Q.3: Write a program to print the frequency of each element in an array
     public static void printFrequency(int[] arr) {
         HashMap<Integer, Integer> frequency = new HashMap<>();
         
         // Count frequency of each element
         for (int element : arr) {
             frequency.put(element, frequency.getOrDefault(element, 0) + 1);
         }
         
         System.out.println("\nQ.3: Frequency of elements:");
         for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
             System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times");
         }
     }
 
     // Q.4: Write a program to print sum of the array
     public static int arraySum(int[] arr) {
         int sum = 0;
         for (int element : arr) {
             sum += element;
         }
         return sum;
     }
 
     // Q.5: Write a program to print the reverse of the array
     public static void reverseArray(int[] arr) {
         int start = 0;
         int end = arr.length - 1;
         
         while (start < end) {
             // Swap elements
             int temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;
             start++;
             end--;
         }
     }
 
     // Q.6: Write a program to print count of even and odd numbers in array
     public static void countEvenOdd(int[] arr) {
         int evenCount = 0, oddCount = 0;
         
         for (int element : arr) {
             if (element % 2 == 0) {
                 evenCount++;
             } else {
                 oddCount++;
             }
         }
         
         System.out.println("\nQ.6: Count of even numbers: " + evenCount);
         System.out.println("Count of odd numbers: " + oddCount);
     }
 
     // Q.7: Write a program to search user input element in array by linear Search
     public static int linearSearch(int[] arr, int target) {
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] == target) {
                 return i;
             }
         }
         return -1;
     }
 
     // Q.9: Write a program to search user input element in array by Binary Search
     public static int binarySearch(int[] arr, int target) {
         int left = 0;
         int right = arr.length - 1;
         
         while (left <= right) {
             int mid = left + (right - left) / 2;
             
             if (arr[mid] == target) {
                 return mid;
             }
             if (arr[mid] < target) {
                 left = mid + 1;
             } else {
                 right = mid - 1;
             }
         }
         return -1;
     }
 
     // Q.10: Write a program to find the second largest element in array
     public static int findSecondLargest(int[] arr) {
         if (arr.length < 2) return Integer.MIN_VALUE;
         
         int largest = arr[0];
         int secondLargest = Integer.MIN_VALUE;
         
         for (int i = 1; i < arr.length; i++) {
             if (arr[i] > largest) {
                 secondLargest = largest;
                 largest = arr[i];
             } else if (arr[i] > secondLargest && arr[i] < largest) {
                 secondLargest = arr[i];
             }
         }
         return secondLargest;
     }
 
     // Q.11: Write a program to print 2D array
     public static void print2DArray(int[][] arr) {
         System.out.println("\nQ.11: Printing 2D array:");
         for (int[] row : arr) {
             for (int element : row) {
                 System.out.print(element + " ");
             }
             System.out.println();
         }
     }
 
     // Q.12: Write a program to sort and print array using bubble sort algorithm
     public static void bubbleSort(int[] arr) {
         int n = arr.length;
         for (int i = 0; i < n - 1; i++) {
             for (int j = 0; j < n - i - 1; j++) {
                 if (arr[j] > arr[j + 1]) {
                     // Swap elements
                     int temp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = temp;
                 }
             }
         }
     }
 
     // Main method to test all solutions
     public static void main(String[] args) {
         // Test array
         int[] arr = {64, 34, 25, 12, 22, 11, 90, 12};
         int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
         
         // Testing all solutions
         printArray(arr);
         
         System.out.println("\nQ.2: Largest element: " + findLargest(arr));
         
         printFrequency(arr);
         
         System.out.println("\nQ.4: Sum of array: " + arraySum(arr));
         
         System.out.println("\nQ.5: Array before reversal:");
         printArray(arr);
         reverseArray(arr);
         System.out.println("Array after reversal:");
         printArray(arr);
         
         countEvenOdd(arr);
         
         int searchElement = 25;
         System.out.println("\nQ.7: Linear Search for " + searchElement + ": Found at index " + 
                           linearSearch(arr, searchElement));
         
         // Sort array for binary search
         bubbleSort(arr);
         System.out.println("\nQ.9: Binary Search for " + searchElement + ": Found at index " + 
                           binarySearch(arr, searchElement));
         
         System.out.println("\nQ.10: Second largest element: " + findSecondLargest(arr));
         
         print2DArray(arr2D);
         
         System.out.println("\nQ.12: Array before bubble sort:");
         printArray(arr);
         bubbleSort(arr);
         System.out.println("Array after bubble sort:");
         printArray(arr);
     }
 }
 