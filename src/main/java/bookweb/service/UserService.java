package bookweb.service;

import java.util.List;

import bookweb.model.User;

public interface UserService {
	
	public List<User> getAll();
	public User getUserByID(int id);
	public User saveUser(User user);
	public String deleteUser(int id);
	public User updateUser(User user);

}
