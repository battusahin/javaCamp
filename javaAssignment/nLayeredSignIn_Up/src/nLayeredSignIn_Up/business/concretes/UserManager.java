package nLayeredSignIn_Up.business.concretes;

import java.util.List;

import nLayeredSignIn_Up.business.abstracts.AuthService;
import nLayeredSignIn_Up.business.abstracts.EmailService;
import nLayeredSignIn_Up.business.abstracts.UserService;
import nLayeredSignIn_Up.business.abstracts.ValidationService;
import nLayeredSignIn_Up.dataAccess.abstracts.UserDao;
import nLayeredSignIn_Up.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private AuthService authService;
	private EmailService emailService;
	private ValidationService validationService;
	
	public UserManager(UserDao userDao, AuthService authService, EmailService emailService,
			ValidationService validationService) {
		super();
		this.userDao = userDao;
		this.authService = authService;
		this.emailService = emailService;
		this.validationService = validationService;
	}

	@Override
	public void add(User user) {
		
		if(validationService.verify(user)) {
			userDao.add(user);
			emailService.sendEmail(user);
			authService.login(user);
		}
		
	}

	@Override
	public void update(User user) {
		
		userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		
		userDao.delete(user);
		
	}

	@Override
	public List<User> getAll() {
		
		return userDao.getAll();
	}

}
