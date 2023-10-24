package com.example.traodoimathangthoitrang.controller;

import com.example.traodoimathangthoitrang.model.Account;
import com.example.traodoimathangthoitrang.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/account")
public class AccountController {
    @Autowired
    IAccountService iAccountService;

    @GetMapping("/users")
    public List<Account> findAll_User() {
        return iAccountService.findAll_User();
    }

    @GetMapping("/{id}")
    public Account findById(@PathVariable long id) {
        return iAccountService.findById(id);
    }

    @PostMapping("/createAccount")
    public void createAccount(@RequestBody Account account) {
        iAccountService.saveAccount(account);
    }

    @PostMapping("/editAccount")
    public void editAccount(@RequestBody Account account) {
        iAccountService.saveAccount(account);
    }

    @PostMapping("/deleteAccount/{id}")
    public void deleteAccount(@PathVariable long id) {
        iAccountService.deleteAccount(id);
    }
}
