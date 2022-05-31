package bookweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bookweb.model.User;
import bookweb.repository.UserRepository;

@Service
public class UserServiceImplement implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public User getUserByID(int id) {
		return userRepository.findById(id).orElse(null);
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public String deleteUser(int id) {
		userRepository.deleteById(id);
		return "Đã xóa thành công !";
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
