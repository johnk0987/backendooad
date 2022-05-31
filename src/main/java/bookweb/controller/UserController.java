package bookweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bookweb.model.User;
import bookweb.service.UserServiceImplement;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServiceImplement userServiceImplement;
	
	@GetMapping("/getAll")
	public List<User> getAll(){
		return userServiceImplement.getAll();
	}
	
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return userServiceImplement.saveUser(user);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable int id) {
		return userServiceImplement.deleteUser(id);
	}
	
}
