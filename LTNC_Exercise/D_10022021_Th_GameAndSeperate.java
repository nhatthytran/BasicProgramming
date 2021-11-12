package school;

import java.util.Random;
import java.util.Scanner;

/**
 * @author ADMiN
 *
 */
/**
 * @author ADMiN
 *
 */
public class D_10022021_Th_GameAndSeperate {

	// DINH DANG SO NGUYEN
	// Cach 1:
	public static String readInteger(int a) {
		String result = "";
		String mod = "";
		while (a > 0) {
			String z = String.valueOf(a%1000);
			a /= 1000;
			if(z.length() == 1) {
				mod = "00";
			} else if(z.length() == 2) {
				mod = "0";
			} else if(z.length() == 0) {
				mod = "000";
			} else
				mod = "";
			if (a == 0) {
				result = mod + z + result;
			} else {
				result = "," + mod + z + result;
			}
		}
		result = deleteZero(result);
		return result;
	}
	public static String deleteZero(String string) {
		if(!string.startsWith("0"))
			return string;
		else {
			string = string.substring(1);
			return deleteZero(string);
		}
	}

	// Cach 2:
	public static String formatIntegerNumber(int number) {
		String result = "";
		StringBuffer format = new StringBuffer(String.valueOf(number));
		int count = 0;
		for(int i = format.length(); i>=0;	) {
			if(count != 3) {
				count++;
				i--;
			} else if(count == 3) {
				count = 0;
				format.insert(i, ",");
			}
		}
		if(format.toString().startsWith(",")) {
			format.deleteCharAt(0);
		}
		result = format.toString();
		return result;
	}
	
	// TRO CHOI DOAN SO
	public static void guessNumber() {
		int count = 0;
		Random rd = new Random();
		int num = rd.nextInt(100);
		// Dung de test so
//		System.out.println("Day la so random can tim " + num); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so ban doan vao");
		int s = sc.nextInt();
		while (s != num) {
			
			if (s > num) {
				System.out.println("Lon hon so can tim");
				count++;
				s = sc.nextInt();
			} else if (s < num) {
				System.out.println("Nho hon so can tim");
				count++;
				s = sc.nextInt();
			}
		}
		count++;
		System.out.println("Day la so can tim va so lan doan cua ban la: " + count);
	}
	
	public static String readInteger1(int a) {
		String result="";
		while(a>0) {
			int mod = a%1000;
			a/=1000;
			if(a==0)
				result = mod + result;
			else result = "," + mod + result;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// doc so nguyen

		System.out.println(readInteger(1123005461));
		System.out.println(formatIntegerNumber(123005461));
		System.out.println(readInteger1(1123456781));
		// tro choi doan so
//		guessNumber();
	}

}
