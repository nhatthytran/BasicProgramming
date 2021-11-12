package school;

public class D_12022021_Th_DuyetMang2DBang1VongLap {
	// t chi in dc mang voi day du phan tu.
	public static void printArr(int[][] arr) {
		for (int i = 0; i < arr.length * arr[0].length; i++) {
			int row = i / arr[0].length;
			int col = i % arr[0].length;
			System.out.print(arr[row][col] + "\t");
			if (col == arr[0].length - 1)
				System.out.println();
		}
	}

	// mo rong 3
	// width: arr.length
	// height: arr[0].length
	public static String encrypt(String mes, int cols) {
		String result = "";
		while (mes.length() % cols != 0) {
			mes += "-";
		}
		mes = mes.replace(" ", "-");
		int rows = mes.length() / cols;
		char[][] ch = new char[rows][cols];
		for (int i = 0; i < rows * cols; i++) {
			int row = i / cols;
			int col = i % cols;
			ch[row][col] = mes.charAt(i);

		}
		for (int i = 0; i < rows * cols; i++) {
			int row = i / rows;
			int col = i % rows;
			result += ch[col][row];
		}
		return result;
	}

	public static String descrypt(String mes, int cols) {
		String result = "";
		int rows = mes.length() / cols;
		char[][] ch = new char[rows][cols];
		for (int i = 0; i < cols*rows; i++) {
			int row = i / cols;
			int col = i % cols;
			ch[row][col] = mes.charAt(col * rows + row);
			result += ch[row][col];
		}
		result = result.replace("-", " ").trim();
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(encrypt("I am student at Nong Lam", 5));
		System.out.println(descrypt("Isn---ttNLau-oamdanm-etg-", 5));
	}

}
