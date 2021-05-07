package nLayeredSignIn_Up;

import nLayeredSignIn_Up.business.abstracts.UserService;
import nLayeredSignIn_Up.business.concretes.AuthManager;
import nLayeredSignIn_Up.business.concretes.EmailManager;
import nLayeredSignIn_Up.business.concretes.UserManager;
import nLayeredSignIn_Up.business.concretes.ValidationManager;
import nLayeredSignIn_Up.core.abstracts.GoogleAuthService;
import nLayeredSignIn_Up.core.concretes.GoogleAuthManagerAdapter;
import nLayeredSignIn_Up.dataAccess.concretes.HibernateUserDao;
import nLayeredSignIn_Up.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		
		User user = new User(1,"Batuhan","Þahin","battusahin97@gmail.com","123456789");
		
		UserService userService = new UserManager(new HibernateUserDao(), new AuthManager(), 
				new EmailManager(), new ValidationManager());
		
		System.out.println("---------------------------------------------------------------------------");
		userService.add(user);
		System.out.println("---------------------------------------------------------------------------");
		userService.update(user);
		System.out.println("---------------------------------------------------------------------------");
		userService.delete(user);
		
		System.out.println("---------------------------------------------------------------------------");

		GoogleAuthService googleAuthService = new GoogleAuthManagerAdapter();
		
		googleAuthService.googleRegister();
		googleAuthService.googleLogIn(null, "123456987");
	}

}
