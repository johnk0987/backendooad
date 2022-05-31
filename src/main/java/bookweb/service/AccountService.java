package bookweb.service;


import java.util.List;

import bookweb.model.Account;

public interface AccountService {
	
	public List<Account> getAll();
	public Account getAccountByID(int id);
	public Account saveAccount(Account account);
	public String deleteAccount(int id);
	public Account updateAccount(Account account);

}
