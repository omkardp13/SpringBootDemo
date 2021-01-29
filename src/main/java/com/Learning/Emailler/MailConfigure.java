package com.Learning.Emailler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.mail.javamail.JavaMailSender;

@Configuration
public class MailConfigure {
	@Bean
	@Profile("dev")
	public iEmailerService dummyEmailSender() {
		return new DummyEmailerSender();
	}
	@Bean
	@Profile("prod")
	public iEmailerService smtpEmailSender(JavaMailSender javaMailSender) {
		return new SMTPEmailSender(javaMailSender);
	}
}
