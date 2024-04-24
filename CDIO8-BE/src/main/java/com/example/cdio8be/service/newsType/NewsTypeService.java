package com.example.cdio8be.service.newsType;

import com.example.cdio8be.repository.newsType.INewsTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsTypeService implements INewsTypeService {
    @Autowired
    INewsTypeRepository iNewsTypeRepository;
}
