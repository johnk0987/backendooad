package bookweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bookweb.model.Account;
import bookweb.repository.AccountRepository;

@Service
public class AccountServiceImplement implements AccountService{

	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public List<Account> getAll() {
		return accountRepository.findAll();
	}

	@Override
	public Account getAccountByID(int id) {
		return accountRepository.findById(id).orElse(null);
	}

	@Override
	public Account saveAccount(Account account) {
		return accountRepository.save(account);
	}

	@Override
	public String deleteAccount(int id) {
		accountRepository.deleteById(id);
		return  "Đã xóa thành công !";
	}

	@Override
	public Account updateAccount(Account account) {
		return accountRepository.save(account);
	}

}
