package nLayeredSignIn_Up.dataAccess.abstracts;

import java.util.List;

import nLayeredSignIn_Up.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	List<User> getAll();
}
