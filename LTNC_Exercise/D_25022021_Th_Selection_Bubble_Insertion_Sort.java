package school;

import java.util.Arrays;

public class D_25022021_Th_Selection_Bubble_Insertion_Sort {
	
	// swap: dung de hoan doi 2 phan tu trong mang
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// SELECTION SORT
	// Ascending (tang dan)
	public static int[] selectionSort_Ascending(int[] arr) {
		int min = 0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				min = arr[i];
				if(arr[j] < min) {
					swap(arr, i, j);
					min = arr[j];
				}
			}
		}
		return arr;
	}
	// Descending (giam dan)
	public static int[] selectionSort_Descending(int[] arr) {
		int max = 0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				max = arr[i];
				if(arr[j] > max) {
					swap(arr, i, j);
					max = arr[j];
				}
			}
		}
		return arr;
	}
	
	// BUBBLE SORT
	// Ascending
	public static int[] bubbleSort_Ascending(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j < arr.length-1; j++) {
				if(arr[j+1] < arr[j]) {
					swap(arr, j, j+1);
				}
			}
		}
		return arr;
	}
	
	// Descending
	public static int[] bubbleSort_Descending(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j < arr.length-1; j++) {
				if(arr[j+1] > arr[j]) {
					swap(arr, j, j+1);
				}
			}
		}
		return arr;
	}
	
	// INSERTION SORT
	// Ascending
	public static int[] insertionSort_Ascending(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int j=i;
			while(j>0 && arr[j-1] > arr[j]) {
				swap(arr, j, j-1);
				j--;
			}
		}
		return arr;
	}
	
	// Descending
	public static int[] insertionSort_Descending(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int j=i;
			while(j>0 && arr[j-1] < arr[j]) {
				swap(arr, j, j-1);
				j--;
			}
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {20,12,10,15,2};
		System.out.println(Arrays.toString(selectionSort_Ascending(arr)));
		System.out.println(Arrays.toString(selectionSort_Descending(arr)));
		System.out.println(Arrays.toString(bubbleSort_Ascending(arr)));
		System.out.println(Arrays.toString(bubbleSort_Descending(arr)));
		System.out.println(Arrays.toString(insertionSort_Ascending(arr)));
		System.out.println(Arrays.toString(insertionSort_Descending(arr)));
		
	}

}
