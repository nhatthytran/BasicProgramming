package school;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D_22022021_Th_MyStringTokenizer {

	// cach 1
	public static String[] nextToken1(String input, String delim) {
		String[] result;
		List<String> listDelims = new ArrayList<String>();
		List<String> listOutput = new ArrayList<String>();
		listDelims = createListDelims(delim, listDelims); // phan tach delim
		String output="";
//		System.out.println(listDelims);
		for(int i=0; i<input.length(); i++) {
			for (int j = 0; j < listDelims.size(); j++) {
				String delims = listDelims.get(j);
				if (delims.charAt(0) == input.charAt(i)) {
					boolean isDelim = isDelims(input,i,delims); // neu nhu la delim thi xet lai
					if(isDelim) {
						for(int k=0; k<delims.length(); k++) {
							input = input.replace(delims.charAt(k), '|');
						}
					}
				} 
			}
		}
		listOutput = createListDelims(input, listOutput);
		listOutput.removeAll(Arrays.asList(new String[] {""}));
		result = new String[listOutput.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = listOutput.get(i);
		}
		return result;
	}
	private static String replaceDelim(String input, List<String> listDelims, int i) {
		String result="";
		
		return result;
	}
	private static boolean isDelims1(String input, int i, String delims) {
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
	
	// cach 2
	public static String[] nextToken(String input, String delim) {
		String[] result;
		List<String> listDelims = new ArrayList<String>();
		List<String> listOutput = new ArrayList<String>();
		listDelims = createListDelims(delim, listDelims);
		String str = "";
		for (int i = 0; i < input.length();i++) {
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
	private static List createListDelims(String delim, List<String> listDelims) {
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
		return listDelims;
	}

	private static int isDelim(List<String> listDelims, String input, int i) {
		for (int j = 0; j < listDelims.size(); j++) {
			String delims = listDelims.get(j);
			// neu vi tri input[i] = voi vi tri dau tien cua delim[j] dau tien
			if (delims.charAt(0) == input.charAt(i)) {
				boolean isDelim = isDelims(input, i, delims);
				if(isDelim) {
					return delims.length();
				}
			} 
		}
		return 0;
	}
	private static boolean isDelims(String input, int i, String delims) {
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
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(nextToken1("Tran*#Nhat*Thy", "*#|*")));
//		nextToken1("Tran*#Nhat*Thy", "*#|*");
	}

}
