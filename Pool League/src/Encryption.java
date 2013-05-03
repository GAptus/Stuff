
import org.jasypt.util.password.StrongPasswordEncryptor;
import org.jasypt.util.text.BasicTextEncryptor;

import java.util.*;
import java.io.FileWriter;
import java.io.IOException;


public class Encryption {
	
	static Scanner sc = new Scanner(System.in);
	static BasicTextEncryptor strongEncrypt = new BasicTextEncryptor();
	static StrongPasswordEncryptor passwordEncryptor = new StrongPasswordEncryptor();
	
	private static String encryptedPassword; 
	private static boolean created = false;
	
	
	public static void main(String[] args) throws IOException {
		
		
		
		String data;
		
		while (!created) {
			System.out.println("Enter 1 to create a new masterPassword, 2 to create a new email password");
			int choice = sc.nextInt();
			
			System.out.println("Enter your new password");
			data = sc.next();
			
			if (choice == 1) {
				
				saveFile(encryptPassword(data), choice);
				created = true;
			}
			else if (choice == 2) {
				saveFile(encryptEmail(data), choice);
				created = true;
			}
			
		}
		
		sc.close();
		
	}
	
	private static void saveFile(String password, int choice) throws IOException {
		
		String file = null;

		switch (choice) {
		case 1:
			file = "MasterPassword";
			break;
		case 2: 
			file = "EmailPassword";
			break;
		}
		
		try {
			FileWriter fw = new FileWriter(file);
			
			fw.write(password);
			
			System.out.println("Password successully saved to file");
			
			fw.close();
		}
		catch (IOException e) {
			System.out.println("Enter a valid number, either 1 or 2");
		}
	
	}
	
	private static String encryptPassword(String password) {
		
		
		encryptedPassword = passwordEncryptor.encryptPassword(password);
		
		System.out.println("New password sucessfully encrypted");
		
		return encryptedPassword;
	}
	
	private static String encryptEmail(String email) {
		
		strongEncrypt.setPassword("password");
		
		return strongEncrypt.encrypt(email);
	}

}
