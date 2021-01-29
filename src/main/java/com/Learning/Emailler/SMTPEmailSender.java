package com.Learning.Emailler;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

//@Component
@Service
public class SMTPEmailSender implements iEmailerService {
	
	
	private static Log Log=LogFactory.getLog(SMTPEmailSender.class);
	private JavaMailSender javaMailSender;
	   
	/*public SMTPEmailSender(JavaMailSender javaMailSender) {
		// TODO Auto-generated constructor stub
	  this.javaMailSender = javaMailSender;
	}*/
  //  public SMTPEmailSender(JavaMailSender javaMailSender) {
	//      this.javaMailSender=javaMailSender;
	      
		// TODO Auto-generated constructor stub
	//}

public SMTPEmailSender() {
	this.javaMailSender=javaMailSender;
	
		// TODO Auto-generated constructor stub
	}

@Override
  
 public	void sendEmail(String emailID,String subject,String mailContent) throws MessagingException {
	  Log.info("SMTP Mail Receiver ID:"+emailID);
	  Log.info("SMTP Mail Subject ID:"+subject);
	  Log.info("SMTP Mail Body ID:"+mailContent);
	  Log.warn("This is just SMTP email sender:");
	  
	  MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper;

		helper = new MimeMessageHelper(message, true); // true indicates
					  				                   // multipart message
		helper.setSubject("This is test message");
		helper.setTo("varshapatil1674@gmail");
		helper.setText("<h1> Body </h1>", true); // true indicates html

		// continue using helper for more functionalities
      // like adding attachments, etc.  
		javaMailSender.send(message);
	}
  
}

