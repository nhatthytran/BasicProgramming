package school;

import java.util.Arrays;

public class D_26022021_Th_Merge_Quick_Sort {

	// MEREGE SORT
	public static int[] mergeSort_Ascending(int[] arr, int left, int right) {
		if (left >= right)
			return arr;
		else {
			int mid = (left + right) / 2;
			int[] arrLeft = new int[mid - left + 1];
			int[] arrRight = new int[right - mid];
			for (int i = 0; i < arrLeft.length; i++) {
				arrLeft[i] = arr[i];
			}
			for (int i = 0; i < arrRight.length; i++) {
				arrRight[i] = arr[mid + 1 + i];
			}
			arrLeft = mergeSort_Ascending(arrLeft, 0, arrLeft.length - 1);
			arrRight = mergeSort_Ascending(arrRight, 0, arrRight.length - 1);
			return merge(arrLeft, arrRight);
		}
	}

	private static int[] merge(int[] left, int[] right) {
		int[] arr = new int[left.length + right.length];
		int i = 0;
		int j = 0;
		int index = 0;
		while (i < left.length && j < right.length) {
			if (left[i] < right[j])
				arr[index++] = left[i++];
			else
				arr[index++] = right[j++];
		}
		while (i < left.length)
			arr[index++] = left[i++];
		while (j < right.length)
			arr[index++] = right[j++];
		return arr;
	}

	// QUICK SORT
	public static void quickSort(int[] arr, int left, int right) {
		if(right <= left) return;
		else {
			int pivot = arr[right];
			int partition = partitionFunc(arr,left, right, pivot);
			quickSort(arr, left, partition-1);
			quickSort(arr, partition+1, right);
		}
	}

	private static int partitionFunc(int[] arr, int left, int right, int pivot) {
		int leftPointer = left;
		int rightPointer = right - 1;
		while(true) {
			while(arr[leftPointer] < pivot) {
				leftPointer++;
			}
			while(rightPointer > 0 && arr[rightPointer] > pivot) {
				rightPointer--;
			}
			if(leftPointer >= rightPointer) break;
			else swap(arr, leftPointer, rightPointer);
		}
		swap(arr, leftPointer, right);
		return leftPointer;
	}

	// swap: dung de hoan doi 2 phan tu trong mang
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 20, 12, 10, 15, 2 };
//		System.out.println(Arrays.toString(mergeSort_Ascending(arr, 0, arr.length - 1)));
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
