package nLayeredSignIn_Up.core.abstracts;

public interface GoogleAuthService {

	void googleRegister();
	boolean googleLogIn(String eMail,String password);
	
}
