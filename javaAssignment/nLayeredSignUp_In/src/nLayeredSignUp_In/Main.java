package nLayeredSignUp_In;

import nLayeredSignUp_In.business.abstracts.UserService;
import nLayeredSignUp_In.business.concretes.AuthManager;
import nLayeredSignUp_In.business.concretes.EmailManager;
import nLayeredSignUp_In.business.concretes.UserManager;
import nLayeredSignUp_In.business.concretes.ValidationManager;
import nLayeredSignUp_In.core.abstracts.GoogleAuthService;
import nLayeredSignUp_In.core.concretes.GoogleAuthManagerAdapter;
import nLayeredSignUp_In.dataAccess.concretes.HibernateUserDao;
import nLayeredSignUp_In.entities.concretes.User;
import nLayeredSignUp_In.googleAuth.GoogleAuthManager;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(1,"Batuhan","Þahin","battusahin97@gmail.com","123456789");
		
		UserService userService = new UserManager(new HibernateUserDao(), new AuthManager(), new EmailManager(),
				new ValidationManager());
		
		userService.add(user);
		userService.update(user);
		userService.delete(user);
		
		System.out.println("----------------------------------------------------------------------");
		
		GoogleAuthService googleAuthService = new GoogleAuthManagerAdapter();
		
		googleAuthService.registerGoogle(user);
		googleAuthService.logInGoogle(user);
		
	}

}
