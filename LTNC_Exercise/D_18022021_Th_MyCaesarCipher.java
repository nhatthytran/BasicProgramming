package school;

public class D_18022021_Th_MyCaesarCipher {
	protected char[] encoder = new char[26];
	protected char[] decoder = new char[26];

	public D_18022021_Th_MyCaesarCipher(int rotation) {
		for(int k=0; k<26; k++) {
			encoder[k] = (char) ('A' + (k + rotation) % 26);
			decoder[k] = (char) ('A' + (k - rotation + 26) % 26);
		}
	}
	public static String encrypt(String message, int k) {
		String encoder = "";
		message = message.toUpperCase(); // chuyen sang chuoi in hoa
		for (int i = 0; i < message.length(); i++) {
			if (message.charAt(i) == ',') {
				encoder += ',';
				i++;
			} else
				encoder += (char) ('A' + (message.charAt(i) - 'A' + k) % 26);
		}
		return encoder;
	}

	public static String descrypt(String message, int k) {
		String decoder = "";
		message = message.toUpperCase();
		for(int i=0; i<message.length(); i++) {
				decoder += (char) ('A' + (message.charAt(i) - 'A' + (26 - k)) % 26);	
		}
		return decoder;
	}
	
	public String encrypt(String message) {
		char[] msg = message.toCharArray();
		for(int k=0; k<msg.length; k++) {
			if(Character.isUpperCase(msg[k])) {
				int j = msg[k] - 'A';
				msg[k] = encoder[j];
			}
		}
		return new String(msg);
	}
	public String decrypt(String message) {
		char[] msg = message.toCharArray();
		for(int k=0; k<msg.length; k++) {
			if(Character.isUpperCase(msg[k])) {
				int j = msg[k] - 'A';
				msg[k] = decoder[j];
			}
		}
		return new String(msg);
	}
	// Cach 2: phan biet toan bo chu hoa, chu thuong, ki tu dac biet, so
	public static String encrypt2(String message, int k) {
		String encoder = "";
		char[] msg = message.toCharArray();
		for(int i=0; i<msg.length; i++) {
			if(Character.isUpperCase(msg[i])) {
				encoder += (char) ('A' + (msg[i] - 'A' + k) % 26);
			} else if(Character.isLowerCase(msg[i])) {
				encoder += (char) ('a' + (msg[i] - 'a' + k) % 26);
			} else if(Character.isDigit(msg[i])) {
				encoder += (char) ('0' + (msg[i] - '0' + k) % 10);
			} else if(msg[i] >=33 && msg[i]<=47) {
				encoder += (char) ('!' + (msg[i] - '!' + k) % 15);
			} else if(msg[i] >= 91 && msg[i]<=96) {
				encoder += (char) ('[' + (msg[i] - '[' + k) % 6);
			} else if(msg[i] >= 123 && msg[i]<=126) {
				encoder += (char) ('{' + (msg[i] - '{' + k) % 4);
			} else {
				encoder += " ";
			}
		}
		return encoder;
	}
	public static String decrypt2(String message, int k) {
		String decoder = "";
		char[] msg = message.toCharArray();
		for (int i = 0; i < msg.length; i++) {
			if (Character.isUpperCase(msg[i])) {
				decoder += (char) ('A' + (message.charAt(i) - 'A' + (26 - k)) % 26);
			} else if (Character.isLowerCase(msg[i])) {
				decoder += (char) ('a' + (message.charAt(i) - 'a' + (26 - k)) % 26);
			} else if (Character.isDigit(msg[i])) {
				decoder += (char) ('0' + (message.charAt(i) - '0' + (10 - k)) % 10);
			} else if (msg[i] >= 33 && msg[i] <= 47) {
				decoder += (char) ('!' + (message.charAt(i) - '!' + (15 - k)) % 15);
			} else if (msg[i] >= 91 && msg[i] <= 96) {
				decoder += (char) ('[' + (message.charAt(i) - '[' + (6 - k)) % 6);
			} else if (msg[i] >= 123 && msg[i] <= 126) {
				decoder += (char) ('{' + (message.charAt(i) - '{' + (4 - k)) % 4);
			} else {
				decoder += " ";
			}
		}
		return decoder;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(encrypt("veni, vidi, vici", 3));
//		System.out.println(descrypt("yhql,ylgl,ylfl",3));
//		D_18022021_Th_MyCaesarCipher caesar = new D_18022021_Th_MyCaesarCipher(3);
//		System.out.println(caesar.encrypt("VENI, VIDI, VICI"));
//		System.out.println(caesar.decrypt("YHQL, YLGL, YLFL"));
		for(int i=0; i<128; i++) {
			System.out.println(i +": " + (char) i);
		}
		System.out.println(encrypt2("veni, vidi, 012!",3));
		System.out.println(decrypt2("yhql/ ylgl/ 345$", 3));
	}

}
