
import java.util.Scanner;

class caesarCipher {
	
	public static void main(String[] args) {
		System.out.println("What is your message?");
		Scanner in = new Scanner(System.in);
		String message = in.nextLine();
		System.out.println("Would you like to encrypt [1] or decrypt [2] your message?");
	int choice = in.nextInt();
		if (choice==1) 
				encryptText(message);
		else if (choice==2)
				decryptText(message);
		else 
			System.out.println("Invalid option.");
		
	}
	
	public static void encryptText(String s) {}	
	
	public static void decryptText(String s) {}
}
