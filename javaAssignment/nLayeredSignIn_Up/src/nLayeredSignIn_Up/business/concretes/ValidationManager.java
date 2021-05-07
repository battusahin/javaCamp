package nLayeredSignIn_Up.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nLayeredSignIn_Up.business.abstracts.ValidationService;
import nLayeredSignIn_Up.entities.concretes.User;


public class ValidationManager implements ValidationService {
	
	private List<User> users = new ArrayList<User>();
	
	@Override
	public boolean passwordCheck(User user) {
		
		if(user.getPassword().length() < 6) {
			System.out.println("Warning : Parola en az 6 karakterden olusmalidir.");
			return false;
		}
		return true;
	}

	@Override
	public boolean nameSurnameCheck(User user) {
		
		if(user.getFirstName().length() < 2  ||  user.getLastName().length() < 2) {
			System.out.println("Warning : Ýsim ve soyisim 2 en az 2 karakterden olusmalidir." );
			return false;
		}
		return true;
		
	}

	@Override
	public boolean eMailCheck(User user,String eMail) {
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.geteMail());
		
		if(!matcher.matches()) {
			System.out.println("Warning : Lütfen gecerli bir mail adresi giriniz...");
			return false;
		}
			
		for(User eMailCheck : users) {
			if(eMail.equals(eMailCheck.geteMail())) {
				System.out.println("Warning : Bu Email sistemde kayitli...");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean verify(User user) {
		if(passwordCheck(user) && nameSurnameCheck(user) && eMailCheck(user, user.geteMail())) {
			users.add(user);
			return true;
		}
		return false;
	}
}
