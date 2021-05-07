package nLayeredSignIn_Up.dataAccess.concretes;

import java.util.List;

import nLayeredSignIn_Up.dataAccess.abstracts.UserDao;
import nLayeredSignIn_Up.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		
		System.out.println("Added to system : " + user.geteMail());
		
	}

	@Override
	public void update(User user) {
		
		System.out.println("Updated to system : " + user.geteMail());
		
	}

	@Override
	public void delete(User user) {
		
		System.out.println("Deleted to system : " + user.geteMail());
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
