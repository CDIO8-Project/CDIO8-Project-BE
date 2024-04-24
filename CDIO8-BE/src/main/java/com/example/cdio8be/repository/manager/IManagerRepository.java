package com.example.cdio8be.repository.manager;

import com.example.cdio8be.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IManagerRepository extends JpaRepository<Manager,Long> {
}
