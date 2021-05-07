package nLayeredSignUp_In.core.abstracts;

import nLayeredSignUp_In.entities.concretes.User;

public interface GoogleAuthService {

	void registerGoogle(User user);
	void logInGoogle(User user);
	
}
