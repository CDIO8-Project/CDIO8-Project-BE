package com.example.cdio8be.service.news;

import com.example.cdio8be.repository.news.INewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsService implements INewsService {
    @Autowired
    INewsRepository iNewsRepository;
}
