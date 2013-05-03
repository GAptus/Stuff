
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
/**
 * 
 * @author giacomo
 *	ObservedEmail - static class for sending emails and checking out passwords for email.
 */
public class ObservedEmail {
	
	/**	Method sentEmail
	 * 
	 * @param body - provides the body of the email
	 * @param email - provides the email address to send the mail to
	 * @param password - provides the password for the account to send mail from (aptuspool@gmail.com)
	 * @throws PlayerNotFoundException	- Thrown if player is not in playersList in Class League
	 * 
	 * Sends a email based on certain parameters set from the gmail account aptuspool@gmail.com
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
	/**	Method checkMasterPassword
	 * 
	 * @param password - User input, checks it against the master password
	 * @return - returns either the password for the g-mail account or null dependent on whether the password checks out against the master password
	 * @throws IOException - Exception thrown when files don't not exist
	 * 
	 * Checks out a user inputed password against a encrypted master password. If this returns true it will decrypt the password for a g-mail account
	 * It reads the encrypted master password and g-mail password from two different files.
	 */
	public static String checkMasterPassword(String password) throws IOException { 
		
		StrongPasswordEncryptor strongEncrypt = new StrongPasswordEncryptor();
			
		FileReader masterReader = new FileReader("MasterPassword");
		BufferedReader masterBR = new BufferedReader(masterReader);
		
		String masterPass = masterBR.readLine();
		FileReader basicFR = new FileReader("EmailPassword");
		BufferedReader basicBR = new BufferedReader(basicFR);
		
		String emailPass = basicBR.readLine();
		
		if (strongEncrypt.checkPassword(password, masterPass)) { // compares the user inputed password against the encrypted master password
			BasicTextEncryptor basicEncrypt = new BasicTextEncryptor();
			
			
			
			basicEncrypt.setPassword("password");
			
			masterBR.close();
			basicBR.close();
			String temp = basicEncrypt.decrypt(emailPass);
			return temp; 
		}
		else {
			basicBR.close();
			masterBR.close();
			return null;
		}
	}
	
}
