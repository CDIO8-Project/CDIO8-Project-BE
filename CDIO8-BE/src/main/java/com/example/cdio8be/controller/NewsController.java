package com.example.cdio8be.controller;

import com.example.cdio8be.service.news.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class NewsController {
    @Autowired
    INewsService iNewsService;
}
