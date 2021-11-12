package school;

import java.util.Scanner;

public class D_11022021_Th_MaHoa {
	
	public static void encode() {
		String string = "";
		System.out.println("Nhap chuoi can ma hoa: ");
		Scanner sc = new Scanner(System.in);
		string = sc.nextLine();
		String stringAdd = string.replace(" ", "-");
//		System.out.println(stringAdd);
		char[] ch = stringAdd.toCharArray();
		char[][] code = new char[(int) (Math.ceil(stringAdd.length()/5.0))][5];
		int count=0;
		for(int i=0; i<(int) (Math.ceil(stringAdd.length()/5.0)); i++) {
			for(int j=0; j<5; j++) {
				if(count < ch.length) {
					code[i][j] = ch[count];
				} else {
					code[i][j] = '-';
				}
				count++;
			}
		}
		char[][] encode = new char[5][(int) (Math.ceil(stringAdd.length()/5.0))];
		for(int i=0; i<5; i++) {
			for(int j=0; j<(int) (Math.ceil(stringAdd.length()/5.0)); j++) {
				encode[i][j] = code[j][i];
				System.out.print(encode[i][j]);
			}
		}
		System.out.println();
		System.out.println("Nhan 1 de giai ma");
		int num;
		num = sc.nextInt();
		switch(1) {
		case 1:
			char[][] decryption = new char[(int) (Math.ceil(stringAdd.length()/5.0))][5];
			for(int i=0; i< (int) (Math.ceil(stringAdd.length()/5.0)); i++) {
				for(int j=0; j<5; j++) {
					decryption[i][j] = encode[j][i];
					System.out.print(decryption[i][j]);
				}
			}
			break;
		default:
			break;
		}
	}
	// mo rong 1
	public static String encrypt(String mes, int cols) {
		String result = "";
		while(mes.length() % cols !=0) {
			mes+="-";
		}
		mes = mes.replace(" ", "-");
		int rows = mes.length()/cols;
		char[][] ch = new char[rows][cols];
		for(int row=0; row<rows; row++) {
			for(int col=0; col<cols; col++) {
				ch[row][col] = mes.charAt(cols*row+col);
			}
		}
		for(int col=0; col<cols; col++) {
			for(int row=0; row<rows; row++) {
				result += ch[row][col];
			}
		}
		return result;
	}
	
	public static String descrypt(String mes, int cols) {
		String result = "";
		int rows = mes.length()/cols;
		char[][] ch = new char[rows][cols];
		for(int col=0; col<cols; col++) {
			for(int row=0; row<rows; row++) {
				ch[row][col] = mes.charAt(col*rows+row);
			}
		}
		for(int row=0; row<rows; row++) {
			for(int col=0; col<cols; col++) {
				result+= ch[row][col];
			}
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
