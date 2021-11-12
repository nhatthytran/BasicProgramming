package school;

public class D_14022021_Th_Mang1CoChuaMang2VaTong {

	// Xac dinh mang 1 co chua mang 2 hay ko?
	public static boolean containArray(int[] arr1, int[] arr2) {
		boolean result = false;
		// neu do dai mang 1 nho hon mang 2 thi mang 1 ko chua mang 2
		if (arr1.length < arr2.length) {
			result = false;
		} else {
			// Duyet tim trong mang thu 1
			for (int i = 0; i <= arr1.length - arr2.length; i++) {
				if (arr1[i] == arr2[0]) {
					int count = 0;
					for (int j = 0; j < arr2.length;j++) {
						if (arr1[i + j] == arr2[j]) {
							count++;
						}
					}
					if (count == arr2.length) {
						result = true;
					}
				}

			}
		}
		return result;
	}

	// e = 1 + 1/1! +1/2! + ... + 1/n! cho den khi 1/n! < e
	public static double caculateE(double e) {
		double constE = 0.0;
		int n = 0;
		while (1 / factoria(n) >= e) {
			constE += 1 / factoria(n);
			n++;
		}
		return constE;
	}

	// Tinh giai thua
	public static int factoria(int n) throws IllegalArgumentException {
		if (n < 0)
			throw new IllegalArgumentException();
		else if (n == 0) {
			return 1;
		} else
			return n * factoria(n - 1);
	}

	// cau b
	public static double caculateE2(double x, double e) {
		double constE = 0.0;
		int n = 0;
		while (Math.pow(x, n - 1) / factoria(n + 1) >= e) {
			constE += Math.pow(x, n) / factoria(n);
			n++;
		}
		return constE;
	}

	// cau c
	public static double caculateSin(double x, double e) {
		double sinx = 0.0;
		int n = 0;
		while (Math.pow(x, 2 * n + 1) / factoria(2 * n + 1) >= e) {
			sinx += Math.pow(-1, n) * (Math.pow(x, 2 * n + 1) / factoria(2 * n + 1));
			n++;
		}
		return sinx;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 2, 3, 4, 7, 8, 5, 6, 7, 8, 9 };
		int[] arr2 = { 7, 8, 9};
		System.out.println(containArray(arr1, arr2));
		// 18.1 round va ceil

	}

}
