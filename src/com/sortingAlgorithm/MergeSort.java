package com.sortingAlgorithm;

public class MergeSort
{
	
	

	    // Method to perform Merge Sort
	    public static void mergeSort(int[] arr, int left, int right) {
	        if (left < right) {
	            int middle = (left + right) / 2;

	            // Sort first and second halves
	            mergeSort(arr, left, middle);
	            mergeSort(arr, middle + 1, right);

	            // Merge the sorted halves
	            merge(arr, left, middle, right);
	        }
	    }

	    // Method to merge two subarrays
	    private static void merge(int[] arr, int left, int middle, int right) {
	        int n1 = middle - left + 1;
	        int n2 = right - middle;

	        // Temporary arrays
	        int[] L = new int[n1];
	        int[] R = new int[n2];

	        // Copy data to temporary arrays
	        for (int i = 0; i < n1; ++i)
	            L[i] = arr[left + i];
	        for (int j = 0; j < n2; ++j)
	            R[j] = arr[middle + 1 + j];

	        // Merge the temporary arrays
	        int i = 0, j = 0;
	        int k = left;
	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                arr[k] = L[i];
	                i++;
	            } else {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }

	        // Copy remaining elements of L[] if any
	        while (i < n1) {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }

	        // Copy remaining elements of R[] if any
	        while (j < n2) {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	    }

	    // Method to print the array
	    public static void printArray(int[] arr) {
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        // Example array
	        int[] array = {12, 11, 13, 5, 6, 7};

	        // Print original array
	        System.out.println("Original Array:");
	        printArray(array);

	        // Perform merge sort
	        mergeSort(array, 0, array.length - 1);

	        // Print sorted array
	        System.out.println("Sorted Array:");
	        printArray(array);
	    }
	}


	


