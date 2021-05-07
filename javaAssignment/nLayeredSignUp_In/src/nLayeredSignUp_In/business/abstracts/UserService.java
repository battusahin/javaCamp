package nLayeredSignUp_In.business.abstracts;

import java.util.List;

import nLayeredSignUp_In.entities.concretes.User;

public interface UserService {

	void add(User user);
	void delete(User user);
	void update(User user);
	List<User> getAll();
	
}
