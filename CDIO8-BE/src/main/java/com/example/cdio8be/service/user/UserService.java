package com.example.cdio8be.service.user;

import com.example.cdio8be.repository.user.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    IUserRepository iUserRepository;
}
