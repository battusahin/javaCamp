package nLayeredSignUp_In.business.abstracts;

import nLayeredSignUp_In.entities.concretes.User;

public interface ValidationService {

	boolean nameLastNameCheck(User user);
	boolean passwordCheck(User user);
	boolean eMailCheck(User user,String eMail);
	boolean verify(User user);
}