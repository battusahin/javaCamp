package nLayeredSignIn_Up.business.concretes;

import nLayeredSignIn_Up.business.abstracts.AuthService;
import nLayeredSignIn_Up.entities.concretes.User;


public class AuthManager implements AuthService {

	@Override
	public void login(User user) {
		
		if(user.geteMail() == null  || user.getPassword() == null) {
			System.out.println("Warning : Giris yapilamadi...");
			return;
		}
		System.out.println("Giris yapildi...");
		
		
	}

}
