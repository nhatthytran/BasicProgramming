package school;

public class D_09022021_Th_TamGiacPascal {
	// In ma tran bat ki
	public void printMatrix(int[][] matrix) {
		for(int i=0; i<=matrix.length-1; i++) {
			for(int j=0; j<=matrix[i].length-1; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	// tao ra ma tran the hien tam giac pascal
	public int[][] createPascalTriangle(int size){
		int[][] result = new int[size+1][];
		for(int i=0; i<=size; i++) {
			result[i] = new int[i+1];
			for(int j=1; j<i+1;j++) {
				result[i][j] = j;
				System.out.print(result[i][j] + "\t");
			}
			System.out.println();
		}
		return result;
	}
	
	/*
	 * So dong = so phan tu trong mang diagonalValues
	 * Gia tri cac phan tu trong mang diagonalValues gia tri cua cac phan tu nam tren duong cheo cua ma tran
	 * Tren moi dong gia cua 1 cot bang gia tri cot truoc do + 1
	 */
 
	
	// Mo rong them
	public int[][] createMatrixExt(int[] diagonalValues){
		int[][] result = new int[diagonalValues.length+1][diagonalValues.length+1];
		int a = 0;
		while(a < diagonalValues.length) {
			for(int i=1; i<=diagonalValues.length; i++) {
				for(int j=1; j<=diagonalValues.length; j++) {
					result[i][i]=diagonalValues[a];
					result[i][j] = result[i][i] - (i-j);
					System.out.print(result[i][j] + "\t");
				}
				a++;
				System.out.println();
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		D_09022021_Th_TamGiacPascal pt = new D_09022021_Th_TamGiacPascal();
		// test cau a
		int[][] arr = {{1,2,3},
				{4,5,6}};
		pt.printMatrix(arr);
		// test cau b
		int[][] arr1 = pt.createPascalTriangle(4);
		// test cau c
		int[] arr2 = {1,5,2,0};
//		pt.createPascalTriangle(arr2);
		pt.createMatrixExt(arr2);
	}
}
