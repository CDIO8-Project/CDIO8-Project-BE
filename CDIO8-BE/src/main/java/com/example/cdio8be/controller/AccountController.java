package com.example.cdio8be.controller;

import com.example.cdio8be.service.account.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class AccountController {
    @Autowired
    IAccountService iAccountService;
}
