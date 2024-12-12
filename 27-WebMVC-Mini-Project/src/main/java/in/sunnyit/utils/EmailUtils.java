package in.sunnyit.utils;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.internet.MimeMessage;

@Component
public class EmailUtils {

	private JavaMailSender mailsender;
	
	
	public boolean sendEmail(String to, String subject, String body)
	{
		try {
			//Simple message 
//			SimpleMailMessage msg = new SimpleMailMessage();
//			msg.setTo(to);
//			msg.setSubject(subject);
//			msg.setText(body);
///			mailsender.send(msg);
			
			//Mime Message
			
			MimeMessage mimeMessage = mailsender.createMimeMessage();
			
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(body,true); // formatting body

			mailsender.send(mimeMessage);
			
			return true;
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			
			return false;
		}
		
		
		
	}
}
