package nLayeredSignUp_In.business.concretes;

import java.util.Scanner;

import nLayeredSignUp_In.business.abstracts.EmailService;
import nLayeredSignUp_In.entities.concretes.User;

public class EmailManager implements EmailService{

	@Override
	public void send() {
		System.out.println("Dogrulama kodu gonderildi.");
		
		verifyMailController();
		
	}

	@Override
	public void verifyMailController() {
		
		System.out.println("Doðrulama linkine týklandý...");
		
	}

}
