package com.example.traodoimathangthoitrang.service;

import com.example.traodoimathangthoitrang.model.Account;

import java.util.List;

public interface IAccountService {
    List<Account> findAll();
    public List<Account> findAll_User();
    Account findById(long id);
    void saveAccount(Account account);
    void deleteAccount(long id);
}
