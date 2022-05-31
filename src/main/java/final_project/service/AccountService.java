/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project.service;

import final_project.model.Account;
import java.util.List;

/**
 *
 * @author PhucNguyen
 */
public interface AccountService {
    public List<Account> getAll();
    public Account getAccountById(int id);
    public Account saveAccount(Account account);
    public List<Account> saveListAccount(List<Account> listAccount);
    public String deleteAccount(int id);
    public Account updateAccount(Account account);
}
