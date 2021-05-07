package nLayeredSignIn_Up.business.abstracts;

import java.util.List;

import nLayeredSignIn_Up.entities.concretes.User;

public interface UserService {

	void add(User user);
	void update(User user);
	void delete(User user);
	List<User> getAll();
	
}
