package com.example.cdio8be.repository.comment;

import com.example.cdio8be.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICommentRepository extends JpaRepository<Comment,Long> {
}
