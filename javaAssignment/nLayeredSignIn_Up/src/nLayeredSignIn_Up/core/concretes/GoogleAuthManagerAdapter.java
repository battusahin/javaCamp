package nLayeredSignIn_Up.core.concretes;

import nLayeredSignIn_Up.core.abstracts.GoogleAuthService;
import nLayeredSignIn_Up.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements GoogleAuthService {

	@Override
	public void googleRegister() {
		
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.register();
		
	}

	@Override
	public boolean googleLogIn(String eMail, String password) {
		
		if(eMail == null || password == null) {
			System.out.println("Warning : mail ve sifre girmek zorunludur.");
			return false;
		}
		return true;
		
	}

		
		
		
		
	
	

}
