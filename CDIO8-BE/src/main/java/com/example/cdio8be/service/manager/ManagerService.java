package com.example.cdio8be.service.manager;

import com.example.cdio8be.repository.manager.IManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService implements IManagerService {
    @Autowired
    IManagerRepository iManagerRepository;
}
