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

import bookweb.model.Account;
import bookweb.service.AccountServiceImplement;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountServiceImplement accountServiceImplement;

	@GetMapping("/getAll")
	public List<Account> getAll() {
		return accountServiceImplement.getAll();
	}

	@PostMapping("/addAccount")
	public Account addAccount(@RequestBody Account account) {
		return accountServiceImplement.saveAccount(account);
	}

	@DeleteMapping("/deleteAccount/{id}")
	public String deleteAccount(@PathVariable int id) {
		return accountServiceImplement.deleteAccount(id);
	}

}
