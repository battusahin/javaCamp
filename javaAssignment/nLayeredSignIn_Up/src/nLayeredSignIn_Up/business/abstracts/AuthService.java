package nLayeredSignIn_Up.business.abstracts;

import nLayeredSignIn_Up.entities.concretes.User;

public interface AuthService {

	void login(User user);
	
}
