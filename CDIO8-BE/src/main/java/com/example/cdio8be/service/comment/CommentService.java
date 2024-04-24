package com.example.cdio8be.service.comment;

import com.example.cdio8be.repository.comment.ICommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService implements ICommentService {
    @Autowired
    ICommentRepository iCommentRepository;
}
