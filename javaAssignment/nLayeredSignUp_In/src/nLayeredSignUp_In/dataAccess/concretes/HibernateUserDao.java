package nLayeredSignUp_In.dataAccess.concretes;

import java.util.List;

import nLayeredSignUp_In.dataAccess.abstracts.UserDao;
import nLayeredSignUp_In.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		
		System.out.println("Added to system : " + user.getfirstName());
		
	}

	@Override
	public void delete(User user) {

		System.out.println("Deleted to system : " + user.getfirstName());
		
	}

	@Override
	public void update(User user) {
		
		System.out.println("Updated to system : " + user.getfirstName());
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
