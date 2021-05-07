package nLayeredSignUp_In.dataAccess.abstracts;

import java.util.List;

import nLayeredSignUp_In.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	void delete(User user);
	void update(User user);
	List<User> getAll();
	
}
