/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookweb.service;

import bookweb.model.Account;
import bookweb.repository.AccountRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author PhucNguyen
 */
@Repository
public class AccountServiceImplement implements AccountService{

    @Autowired
    private AccountRepository accountRepository;
    
    
    @Override
    public List<Account> getAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account getAccountById(int id) {
       return accountRepository.findById(id).orElse(null);
    }

    @Override
    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public String deleteAccount(int id) {
        accountRepository.deleteById(id);
        return "Đã xóa thành công !";
    }

    @Override
    public Account updateAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public List<Account> saveListAccount(List<Account> listAccount) {
        return accountRepository.saveAllAndFlush(listAccount);
    }

    
}
