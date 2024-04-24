package com.example.cdio8be.repository.newsType;

import com.example.cdio8be.entity.NewsType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INewsTypeRepository extends JpaRepository<NewsType,Long> {
}
