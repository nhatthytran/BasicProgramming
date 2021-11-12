package school;

public class D_16022021_Th_ktra {

	public static String descrypt(String mes, int cols) {
		String result = "";
		int rows = mes.length()/cols;
		char[][] ch = new char[rows][cols];
		for(int i=0; i< rows*cols; i++) {
			int row = i/cols;
			int col = i%cols;
			ch[row][col] = mes.charAt(col*rows + row);
			result += ch[row][col];
		}
		result = result.replace("-", " ").trim();
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(descrypt("Isn-ttau-md--e-", 5));
	}

}
