package nLayeredSignUp_In.core.concretes;

import nLayeredSignUp_In.core.abstracts.GoogleAuthService;
import nLayeredSignUp_In.entities.concretes.User;
import nLayeredSignUp_In.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements GoogleAuthService {

	
	@Override
	public void registerGoogle(User user) {
		
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.register(user.getEmail(), user.getPassword());
		
	}

	@Override
	public void logInGoogle(User user) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.login(user.getEmail(), user.getPassword());
		
		
	}

}
