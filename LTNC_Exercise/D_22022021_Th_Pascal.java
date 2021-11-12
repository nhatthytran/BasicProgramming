package school;

public class D_22022021_Th_Pascal {

	// cach 1
	public static String[][] createPascalTriangle(int rows) {
		int cols = rows * 2 - 1;
		String[][] result = new String[rows][cols];
		int[][] triangle = new int[rows][cols];
		int length = 1;
		for (int row = 0; row < rows; row++) {
			int colBegin = (cols - length) / 2;
			triangle[row][colBegin] = 1;
			triangle[row][cols - colBegin - 1] = 1;
			if (row > 1) {
				for (int col = colBegin + 2; col < cols - colBegin - 1;) {
					triangle[row][col] = triangle[row - 1][col - 1] + triangle[row - 1][col + 1];
					col += 2;
				}
			}
			length += 2;
		}
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				if (triangle[row][col] == 0) {
					result[row][col] = "";
				} else
					result[row][col] = String.valueOf(triangle[row][col]);
			}
		}
		return result;
	}

	// cach 2
	public static void printPascal(int n) {
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n - row; col++) {
				System.out.print(" ");
			}
			for (int col = 0; col <= row; col++) {
				System.out.print(" " + ncr(row, col));
			}
			System.out.println();
		}
	}

	private static int ncr(int i, int j) {
		// TODO Auto-generated method stub
		return factorial(i) / (factorial(i - j) * factorial(j));
	}

	public static int factorial(int n) throws IllegalArgumentException {
		if (n < 0)
			throw new IllegalArgumentException();
		else if (n == 0) {
			return 1;
		} else
			return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] result = createPascalTriangle(5);
		for (int row = 0; row < result.length; row++) {
			for (int col = 0; col < result[row].length; col++) {
				System.out.print(result[row][col] + "\t");
			}
			System.out.println();
			System.out.println();
		}
//		printPascal(5);
	}

}
