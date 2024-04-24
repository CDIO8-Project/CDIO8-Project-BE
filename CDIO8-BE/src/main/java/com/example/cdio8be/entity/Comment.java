package com.example.cdio8be.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long commentId;
    @Column(name = "write_comment", columnDefinition = "TEXT")
    private String writeComment;
    @Column(columnDefinition = "DATE")
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "account_id")
    private Account account;
    @ManyToOne
    @JoinColumn(name = "news_id", referencedColumnName = "news_id")
    private News news;
}
