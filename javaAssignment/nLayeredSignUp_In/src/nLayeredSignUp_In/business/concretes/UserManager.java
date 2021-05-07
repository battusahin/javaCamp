package nLayeredSignUp_In.business.concretes;

import java.util.List;

import nLayeredSignUp_In.business.abstracts.UserService;
import nLayeredSignUp_In.dataAccess.abstracts.UserDao;
import nLayeredSignUp_In.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private AuthManager authManager;
	private EmailManager eMailManager;
	private ValidationManager validationManager;
	
	

	public UserManager(UserDao userDao, AuthManager authManager, EmailManager eMailManager,
			ValidationManager validationManager) {
		super();
		this.userDao = userDao;
		this.authManager = authManager;
		this.eMailManager = eMailManager;
		this.validationManager = validationManager;
	}

	@Override
	public void add(User user) {
		
		if(validationManager.verify(user)) {
			userDao.add(user);
			eMailManager.send();
			authManager.login(user);
		}
		
	}

	@Override
	public void delete(User user) {
		
		userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		
		userDao.update(user);
		
	}

	@Override
	public List<User> getAll() {
		
		return userDao.getAll();
	}

}
