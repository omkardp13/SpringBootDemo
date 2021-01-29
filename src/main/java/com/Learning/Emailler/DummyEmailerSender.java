package com.Learning.Emailler;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Service
//@Component
//@Component("dummyBean")
//@Qualifier("dumy")
//@Primary
public class DummyEmailerSender implements iEmailerService {
	private static Log Log=LogFactory.getLog(DummyEmailerSender.class);

	@Override
	public void sendEmail(String emailID, String subject, String mailContent) {

		  Log.info("Dummy Mail Receiver ID:"+emailID);
		  Log.info("Dummy Mail Subject ID:"+subject);
		  Log.info("Dummy Mail Body ID:"+mailContent);
		  Log.info("This is just SMTP email sender:");
		// TODO Auto-generated method stub

	}

}
