package com.Learning.Emailler;

import javax.mail.MessagingException;

public interface iEmailerService {
	abstract void sendEmail(String emailID,String subject,String mailContent) throws MessagingException;

}
