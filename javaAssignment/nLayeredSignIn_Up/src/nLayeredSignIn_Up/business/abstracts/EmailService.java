package nLayeredSignIn_Up.business.abstracts;

import nLayeredSignIn_Up.entities.concretes.User;

public interface EmailService {
	
	void sendEmail(User user);
	void activaitonMail(User user);
	
}
