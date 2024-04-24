package com.example.cdio8be.service.role;

import com.example.cdio8be.repository.role.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService implements IRoleService {
    @Autowired
    IRoleRepository iRoleRepository;
}
