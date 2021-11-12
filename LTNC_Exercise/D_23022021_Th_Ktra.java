package school;

public class D_23022021_Th_Ktra {

	public static String decryptCeaser(String message, int k) {
		String decoder = "";
		char[] ch = message.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(Character.isUpperCase(ch[i])) {
				decoder += (char) ('A' + (ch[i] - 'A' + (26-k)) % 26);
			} else if(Character.isLowerCase(ch[i])) {
				decoder += (char) ('a' + (ch[i] - 'a' + (26-k)) % 26);
			} else if(Character.isDigit(ch[i])) {
				decoder += (char) ('0' + (ch[i] - '0' + (10-k)) % 10);
			} else decoder += " ";
		}
		return decoder;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=0; i<128; i++) {
//			System.out.println(i + ": " + (char) i);
//		}
		System.out.println(decryptCeaser("yHQL, YLGL, YLFL012", 3));
	}

}
