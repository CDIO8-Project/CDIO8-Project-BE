package com.example.cdio8be.repository.account;

import com.example.cdio8be.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountRepository extends JpaRepository<Account,Long> {
}
