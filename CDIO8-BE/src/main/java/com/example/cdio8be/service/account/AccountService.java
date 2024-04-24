package com.example.cdio8be.service.account;

import com.example.cdio8be.repository.account.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements IAccountService {
    @Autowired
    IAccountRepository iAccountRepository;
}
