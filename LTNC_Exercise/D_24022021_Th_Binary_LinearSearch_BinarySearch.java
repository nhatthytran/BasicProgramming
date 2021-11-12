package school;

public class D_24022021_Th_Binary_LinearSearch_BinarySearch {

	// Chuyen tu he so 10 sang 2
	// Diem dung: num == 1
	public static String decimalToBinary(int num) {
		if (num < 0)
			throw new IllegalArgumentException();
		else if (num == 1)
			return "1";
		else if (num > 1) {
			if (num % 2 == 0)
				return decimalToBinary(num / 2) + "0";
			else
				return decimalToBinary(num / 2) + "1";
		}
		return "";
	}

	// Linear Search: tim kiem
	public static boolean linearSearching(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target)
				return true;
		}
		return false;
	}

	// Binary Search
	// Cach 1
	public static boolean binarySearching(int[] array, int target) {
		int low = 0;
		int high = array.length - 1;
		int mid = (low + high) / 2;
		if (low > high)
			return false;
		else {
			while (low <= high) {
				if (array[mid] > target) {
					high = mid - 1;
					mid = (low + high) / 2;
				} else if (array[mid] < target) {
					low = mid + 1;
					mid = (low + high) / 2;
				} 
				if (array[mid] == target)
					return true;
			}	
		}
		return false;
	}
	// Cach 2
	public static boolean binarySearchingRecursive(int[] arr, int target, int low, int high) {
		int mid = (high + low) / 2;
		if(low > high) return false;
		else {
			if(arr[mid] > target) return binarySearchingRecursive(arr, target, low, mid-1);
			else if(arr[mid] < target) return binarySearchingRecursive(arr, target, mid+1, high);
			else if(arr[mid] == target) return true;
		}
		return false;
	}
	// (high-low)/2 + low = (high + low)/2
	// (5 - 2)/2 = 1
	//  2 3 4 5
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decimalToBinary(43));
//		int[] array = { 1, 3, 45, 67, 76, 86, 91, 134 };
//		System.out.println(binarySearchingRecursive(array, 46, 0, array.length-1));
	}

}
