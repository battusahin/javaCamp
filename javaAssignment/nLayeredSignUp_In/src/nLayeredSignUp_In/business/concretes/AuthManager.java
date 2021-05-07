package nLayeredSignUp_In.business.concretes;

import nLayeredSignUp_In.business.abstracts.AuthService;
import nLayeredSignUp_In.entities.concretes.User;

public class AuthManager implements AuthService {

	@Override
	public void login(User user) {
		
		if(user.isVerification()) {
			System.out.println("Giris yapildi...");
		}
		
	}

}

