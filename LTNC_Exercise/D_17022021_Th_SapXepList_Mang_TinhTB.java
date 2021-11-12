package school;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class D_17022021_Th_SapXepList_Mang_TinhTB {
	// bai 9
	private static void swap(int[] a, int i, int j) {
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	// sap xep tang dan
	public static int[] ascending(int[] arr){
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
		return arr;
	}
	// sap xep giam dan
	public static int[] descending(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					swap(arr, i, j);
				}
			}
		}
		return arr;
	}

	// bai 10
	// cách 1: dùng list tam de chua phan tu da random
	public static int[] subArray(int[] arr, int qty) {
		int[] result = new int[qty];
		List<Integer> list = new ArrayList<Integer>();
		if(qty > arr.length) return result;
		else {
			Random rd = new Random();
			for(int i=0; i<result.length; i++) {
				int j= rd.nextInt(arr.length);
				if(list.contains(j)) {
					j = rd.nextInt();
				} else {
					result[i] = arr[j];
					list.add(j);
				}
			}
		}
		return result;
	}
	//cách 2: đổi phần tử đã hoán đổi sang vị trí cuối cùng
	public static int[] subArray2(int[] arr, int qty) {
		if(qty > arr.length) {
			return null;
		} else {
			int[] result = new int[qty];
			Random rd = new Random();
			int i=0;
			while(i<=qty) {
				if(i == qty) break;
				int index = rd.nextInt(arr.length-i);
				result[i] = arr[index];
				swap(arr, index, arr.length-i-1);
				i++;
			}
			return result;
		}
		
		
	}
	// bai 18
	public static void average() {
		System.out.println("Nhap vao so nguyen duong");
		Scanner sc = new Scanner(System.in);
		int count = 1; // so lan nguoi nhap
		int sum = 0;
		int num = sc.nextInt();
		while(num != 0) {
			count++;
			sum += num;
			System.out.println("Nhap tiep: ");
			num = sc.nextInt();
		}
		if(num == 0) {
			System.out.println("So lan nhap la: "+ count +" va gia tri tb la: " + sum/count);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,4,5,8,9,6,7};
//		int[] result1 = ascending(arr);
//		int[] result = subArray(arr, 5);
//		for(int i=0; i<result.length; i++) {
//			System.out.print(result[i] + "\t");
//		}
//////		average();
//		System.out.println();
//		int[] result2 = descending(arr);
//		for(int i=0; i<result2.length; i++) {
//			System.out.print(result2[i] + "\t");
//		}
		int[] result1 = subArray2(arr, 5);
		for(int i=0; i<result1.length; i++) {
			System.out.print(result1[i] + "\t");
		}
	}

}
