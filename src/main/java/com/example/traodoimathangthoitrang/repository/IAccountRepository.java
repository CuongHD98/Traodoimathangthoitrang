package com.example.traodoimathangthoitrang.repository;

import com.example.traodoimathangthoitrang.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface IAccountRepository extends JpaRepository<Account, Long> {
    List<Account> findByRole_Id(long roleId);
}
