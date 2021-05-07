package nLayeredSignUp_In.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nLayeredSignUp_In.business.abstracts.ValidationService;
import nLayeredSignUp_In.entities.concretes.User;

public class ValidationManager implements ValidationService {

	private List<User> users = new ArrayList<User>();
	
	@Override
	public boolean nameLastNameCheck(User user) {
		if (user.getfirstName().length() < 2  || user.getLastName().length() < 2 ) {
			System.out.println("Warning : Ýsim ve Soyisim en az 2 karakter olmalidir...");
			return false;
		}
		return true;
	}

	@Override
	public boolean passwordCheck(User user) {
		if(user.getPassword().length() < 6) {
			System.out.println("Warning : Parola en az 6 karakterli olmalidir...");
			return false;
		}
		return true;
		
	}

	@Override
	public boolean eMailCheck(User user,String eMail) {
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		
		if(!matcher.matches()) {
			System.out.println("Warning : Lütfen gecerli bir mail adresi giriniz...");
			return false;
		}
		
		for (User userMailCheck : users) {
			if(eMail == userMailCheck.getEmail()) {
				System.out.println("Warning : Bu eMail zaten sistemimizde kayitli, yeni bir eMail giriniz...");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean verify(User user) {
		if(nameLastNameCheck(user) && passwordCheck(user) && eMailCheck(user, user.getEmail())) {
			users.add(user);
			return true;
		}
		return false;
	}

}
