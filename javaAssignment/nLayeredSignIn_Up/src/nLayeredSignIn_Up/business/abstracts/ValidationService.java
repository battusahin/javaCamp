package nLayeredSignIn_Up.business.abstracts;

import nLayeredSignIn_Up.entities.concretes.User;

public interface ValidationService {
	
	boolean passwordCheck(User user);
	boolean nameSurnameCheck(User user);
	boolean eMailCheck(User user, String eMail);
	boolean verify(User user);
	
	
	
	
}
