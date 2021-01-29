package com.Learning.HelloWorld.Controller;
import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Learning.Emailler.SMTPEmailSender;
import com.Learning.Emailler.iEmailerService;

@RestController
public class EmailServiceController {
	
	

	// http://localhost:8080/SendEmail
	 @Autowired
	 //private JavaMailSender javaMailSender;
	 iEmailerService emailService = new SMTPEmailSender();
	//iEmailerService emailService = new DummyEmailerSender();
	 //@Autowired   //At instance Method
	 //iEmailerService emailService;
	/// public iEmailerService getiEmailerService(){
      //      return emailService;
	//}
	//@Autowired  //at setter method
	//public void setEmailService(iEmailerService emailService1) {
	//	this.emailService1 = emailService1;
	//}
	//Autowired Using Contructor
	//public EmailServiceController(@Qualifier("dumy") iEmailerService dummyBean)
	//{
	//	this.emailService=dummyBean;
	//}
	
	 
	@RequestMapping("/SendEmail")
	
	public String email() throws MessagingException
	{
      this.emailService.sendEmail("stevejobs@apple.com","Launching of new Apple-Mobile Model", "Body of the email");	
    return "Email Send";		

	}
	  //@Autowired
	
   
}
