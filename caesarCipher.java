
import java.util.InputMismatchException;
import java.util.Scanner;

class caesarCipher {
	
	public static void main(String[] args) {
		System.out.println("What is your message?");
		Scanner in = new Scanner(System.in);
		String message = in.nextLine().toUpperCase();

		System.out.println("Would you like to encrypt [1] or decrypt [2] your message?");
	try {
		int choice = in.nextInt();
	
		if (choice==1) 
				encryptText(message);
		else if (choice==2)
				decryptText(message);
	} catch (InputMismatchException E) {
		System.out.println("Invalid option."); //program ends
	}
			
		
	}
	
	public static void encryptText(String s) {
		String out = "";
		for (int i=0; i < s.length(); i++) {
			int c = (int)s.charAt(i);
			if (c>=68 && c<=93) { //if c is a letter
			c += 3; //caesar cipher shift each letter forward by 3
			if (c>93) c = c-68; //loop around to beginning of alphabet
			}
		
			out = out + (char)c;
			
		}
		System.out.println(out);
		
	}	
	
	public static void decryptText(String s) {}
}
