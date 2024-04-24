package com.example.cdio8be.repository.news;

import com.example.cdio8be.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INewsRepository extends JpaRepository<News,Long> {
}
