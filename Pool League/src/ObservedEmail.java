
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.MessagingException;
import java.util.Date;
import javax.swing.*;

import org.jasypt.util.password.StrongPasswordEncryptor;
import org.jasypt.util.text.BasicTextEncryptor;

public class ObservedEmail {
	
	/*	Method sentEmail
	 * 	
	 */
	
	
	public static void sentEmail(String body, String email, String password) throws PlayerNotFoundException, UnsupportedEncodingException {
		
		Date myDate = new Date();
		
		Properties propsTLS = new Properties();
		
		propsTLS.put("mail.transport.protocol", "smtp");
		propsTLS.put("mail.smtp.host", "smtp.gmail.com");
		propsTLS.put("mail.smtp.auth", "true");
		propsTLS.put("mail.smtp.starttls.enable", "true");
		
		
		Session sessionTLS = Session.getInstance(propsTLS);
		
		sessionTLS.setDebug(true);
		
		try {
			Message messageTLS = new MimeMessage(sessionTLS);
			
			messageTLS.setFrom(new InternetAddress("aptuspool@gmail.com"));
			
			
			messageTLS.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
			
			messageTLS.setSubject("Pool League!!!!!");
			
			messageTLS.setText(myDate.toString() + " : " + body);
			
			Transport transportTLS = sessionTLS.getTransport();
			
			transportTLS.connect("smtp.gmail.com", 587, "aptuspool@gmail.com", password);
			
			transportTLS.sendMessage(messageTLS, messageTLS.getAllRecipients());
			
			transportTLS.close();
		}
		catch(MessagingException e) {
			System.out.println("Put a real email");
		}
		
	}
	
	public static String checkMasterPassword(String password) throws IOException {
		
		StrongPasswordEncryptor strongEncrypt = new StrongPasswordEncryptor();
			
		FileReader masterReader = new FileReader("MasterPassword");
		BufferedReader masterBR = new BufferedReader(masterReader);
		
		String masterPass = masterBR.readLine();
		
		
		if (strongEncrypt.checkPassword(password, masterPass)) {
			BasicTextEncryptor basicEncrypt = new BasicTextEncryptor();
			
			FileReader basicFR = new FileReader("EmailPassword");
			BufferedReader basicBR = new BufferedReader(basicFR);
			
			String emailPass = basicBR.readLine();
			
			basicEncrypt.setPassword("12345");
			
			masterBR.close();
			basicBR.close();
			return basicEncrypt.decrypt(emailPass);
		}
		else {
			return null;
		}
	}
	
}
