package com.example.cdio8be.repository.role;

import com.example.cdio8be.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role,Long> {
}
