package school;

public class D_15022021_Th_MaTran {
	// Kiem tra ma tran co phai ma tran tam giac ko?
	public static boolean checkMatrixTriangle(int[][] matrix) {
		boolean result = false;
		int countAbow = 0;
		int countUnder = 0;
		int n = matrix.length;
		// duyet nua tam giac tren duong cheo chinh
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (matrix[i][j] == 0) {
					countAbow++;
				}
			}
		}
		// duyet nua tam giac duoi duong cheo chinh
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (matrix[i][j] == 0) {
					countUnder++;
				}
			}
		}
		// neu countAbow hoac countUnder == (n*n-n)/2 thi true
		if (countAbow == (n * n - n) / 2 || countUnder == (n * n - n) / 2) {
			result = true;
		}
		return result;
	}

	// Cong ma tran
	public static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
		int[][] result = new int[matrix1.length][matrix1[0].length];
		if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
			return result;
		} else {
			for(int i=0; i<matrix1.length; i++) {
				for(int j=0; j<matrix1[0].length; j++) {
					result[i][j] = matrix1[i][j] + matrix2[i][j];
				}
			}
		}
		return result;
	}
	// Nhan ma tran
	public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2){
		int[][] result = new int[matrix1.length][matrix2[0].length];
		if(matrix1[0].length == matrix2.length) {
			for(int i=0; i<matrix1.length ; i++) {
				for(int j=0; j<matrix2[0].length; j++) {
					result[i][j] = 0;
					for(int k=0; k < matrix1[0].length; k++	) {
						result[i][j] = result[i][j] + matrix1[i][k] * matrix2[k][j];
					}
				}
			}
		}
		return result;
	}
	public static void printMatrix(int[][] matrix){
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j< matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
//		int[][] matrix = { { 1, 0, 0, 0 }, { 1, 2, 0, 0 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };
//		System.out.println(checkMatrixTriangle(matrix));
		// Cong ma tran
//		int[][] matrix1 = {
//				{1,2,3},
//				{4,5,6}};
//		int[][] matrix2 = {
//				{1,2},
//				{4,5}};
//		printMatrix(addMatrix(matrix1, matrix2));
		// Nhan ma tran
		int[][] matrix3 = {
				{1,2,3},
				{4,5,6}};
		int[][] matrix4 = {
				{1,2},
				{4,5},
				{6,7}};
		printMatrix(multiplyMatrix(matrix3, matrix4));
	}

}
