package com.example.traodoimathangthoitrang.service.impl;

import com.example.traodoimathangthoitrang.model.Account;
import com.example.traodoimathangthoitrang.repository.IAccountRepository;
import com.example.traodoimathangthoitrang.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    IAccountRepository iAccountRepository;

    @Override
    public List<Account> findAll() {
        return iAccountRepository.findAll();
    }

    @Override
    public List<Account> findAll_User() {
        return iAccountRepository.findByRole_Id(2);
    }

    @Override
    public Account findById(long id) {
        return iAccountRepository.findById(id).get();
    }

    @Override
    public void saveAccount(Account account) {
        iAccountRepository.save(account);
    }

    @Override
    public void deleteAccount(long id) {
        iAccountRepository.deleteById(id);
    }
}
