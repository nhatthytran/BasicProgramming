package school;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class D_19022021_Th_MyStringToken {
	private String input;
	private String delim;
	private int[] markArray;
	private int counter = 1;

	public D_19022021_Th_MyStringToken(String input) {
		// TODO Auto-generated constructor stub
		this.input = input;
		this.delim = delim;
	}

	public String nextToken() {
		String result = "";
		char[] charInput = input.toCharArray();
		char[] charDelims = delim.toCharArray();
		markArray = new int[charInput.length];
		List<Character> listDelims = new ArrayList<Character>(); // Danh sach delim
		// them mang charDelims vao list de ktra co ki hieu | ko?
		for(int i=0; i<charDelims.length; i++) {
			listDelims.add(charDelims[i]);
		}
		// truong hop 1 duyet mot trong cac dau
		if(listDelims.contains('|')) {
			int count = 1;
			for (int i = 0; i < charInput.length; i++) { // duyet mang charInput
				for (int j = 0; j < charDelims.length; j++) {
					// duyet mang delim
					// neu charInput[i] = charDelims[j] thi danh dau vi tri do la -1
					if (charInput[i] == charDelims[j]) {
						markArray[i] = -1;
					} else {
						// neu mang danh dau [i] khac 1 thi cho vi tri do la count=1
						if (markArray[i] != -1)
							markArray[i] = count;
					}
					if(charDelims[j] == '|') {
						j++;
					}
				}
				// neu vi tri i cua markArray = counter thi tat ca charinput cua vi tri i do se them vao result
				if (markArray[i] == counter) {
					result += charInput[i];
				}
			}
			counter++;
		} else {
			// truong hop 2 duyet tat ca trong mang charDelims
			int count = 1;
			for (int i = 0; i < charInput.length; i++) { // duyet mang charInput
				for (int j = 0; j < charDelims.length; j++) {
					// duyet mang delim
					// neu charInput[i] = charDelims[j] thi danh dau vi tri do la -1
					if (charInput[i] == charDelims[j]) {
						markArray[i] = -1;
					} else {
						// neu mang danh dau [i] khac 1 thi cho vi tri do la count=1
						if (markArray[i] != -1)
							markArray[i] = count;
					}
					// neu vi tri j la cuoi cung cua charDelims va charInput[i] = voi gia tri cuoi cung
					// cua mang charDelims thi tang bien count
					if (j == charDelims.length-1 && charInput[i] == charDelims[charDelims.length - 1]) {
						count++;
					}
				}
				// neu vi tri i cua markArray = counter thi tat ca charinput cua vi tri i do se them vao result
				if (markArray[i] == counter) {
					result += charInput[i];
				}
			}
			counter++;
		}
		return result;
	}
	// Cach 2
	public static String[] nextToken(String input, String delim) {
		String[] result;
		List<String> listDelims = new ArrayList<String>();
		List<String> listOutput = new ArrayList<String>();
		// B1: dem co bao nhieu phan tu trong delims va tao ra listDelims
		String a = "";
		for (int i = 0; i < delim.length(); i++) {
			if (delim.charAt(i) == '|') {
				listDelims.add(a);
				a = "";
			} else {
				a += delim.charAt(i);
			}
		}
		if (!a.isEmpty()) {
			listDelims.add(a);
		}
		// B2: duyet input
		String str = "";
		for (int i = 0; i < input.length();i++) {
			System.out.println(input.charAt(i));
			// dau tien xet xem trong chuoi co ki tu delim ko
			int length = isDelim(listDelims, input, i);
			if(length == 0) {
				str+=input.charAt(i);
			} else {
				listOutput.add(str);
				str="";
				i+=length-1;
			}
		}
		if (!str.isEmpty()) {
			listOutput.add(str);
		}
		result = new String[listOutput.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = listOutput.get(i);
		}
		return result;
	}

	private static int isDelim(List<String> listDelims, String input, int i) {
		for (int j = 0; j < listDelims.size(); j++) {
			System.out.println("delims dang xet: " + listDelims.get(j));
			String delims = listDelims.get(j);
			// neu vi tri input[i] = voi vi tri dau tien cua delim[j] dau tien
			if (delims.charAt(0) == input.charAt(i)) {
				boolean isDelim = extracted(input, i, delims);
				System.out.println(isDelim);
				if(isDelim) {
					return delims.length();
				}
			} 
		}
		return 0;
	}
	private static boolean extracted(String input, int i, String delims) {
		int countDelims = 0;
		for (int m = 0; m < delims.length(); m++) { // Duyet delims
			if (i + m >= input.length())
				break;
			if (delims.charAt(m) == input.charAt(i + m)) {
				countDelims++;
			} else {
				countDelims = 0;
				break;
			}
		}
		if (countDelims == delims.length()) {
			return true;

		}
		return false;
	}
	
	public static void main(String[] args) {
//		D_19022021_Th_MyStringToken token = new D_19022021_Th_MyStringToken("Tran#*Nhat*Thy", "#*|*");
//		System.out.println(token.nextToken());
//		System.out.println(token.nextToken());
//		System.out.println(token.nextToken());

		String[] result = nextToken("Tran#*Nhat*Thy", "#*|*");
		System.out.println(Arrays.toString(result));
		
//		System.out.println(token.nextToken2());
		// TODO Auto-generated method stub
//		System.out.println(nextToken("Tran#*Nhat*Thy", "#*|*"));
//		List<String> list = new ArrayList<String>();
//		list.add(e)

	}

}
