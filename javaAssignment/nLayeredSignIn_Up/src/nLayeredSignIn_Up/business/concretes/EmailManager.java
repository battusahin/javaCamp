package nLayeredSignIn_Up.business.concretes;

import nLayeredSignIn_Up.business.abstracts.EmailService;
import nLayeredSignIn_Up.entities.concretes.User;

public class EmailManager implements EmailService {

	@Override
	public void sendEmail(User user) {
		System.out.println("Dogrulama linki g�nderildi...");
		activaitonMail(user);
	}

	@Override
	public void activaitonMail(User user) {
		
		System.out.println("Do�rulama linkine t�kland�...");
		
	}

}
