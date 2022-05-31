/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project.controller;

import final_project.model.Account;
import final_project.service.AccountServiceImplement;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PhucNguyen
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountServiceImplement accountServiceImplement;

    @CrossOrigin
    @GetMapping("/getAll")
    public List<Account> getAll() {
        return accountServiceImplement.getAll();
    }

    @CrossOrigin
    @GetMapping("/getAccountById/{id}")
    public Account getAccountById(@PathVariable int id) {
        return accountServiceImplement.getAccountById(id);
    }

    @CrossOrigin
    @PostMapping("/addAccount")
    public Account addAccount(@RequestBody Account account) {
        return accountServiceImplement.saveAccount(account);
    }

    @CrossOrigin
    @PostMapping("/addListAccount")
    public List<Account> addListAccount(@RequestBody List<Account> listAccount) {
        return accountServiceImplement.saveListAccount(listAccount);
    }

    @CrossOrigin
    @DeleteMapping("/deleteAccount/{id}")
    public String deleteAccount(@PathVariable int id) {
        accountServiceImplement.deleteAccount(id);
        return "Đã xóa thành công !";
    }

    @CrossOrigin
    @PutMapping("/updateAccount")
    public Account updateAccount(@RequestBody Account account) {
        return accountServiceImplement.saveAccount(account);
    }

}
