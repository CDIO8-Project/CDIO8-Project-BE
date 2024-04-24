package com.example.cdio8be.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "news")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "news_id")
    private Long newsId;
    private String newsName;
    @Column(columnDefinition = "TEXT")
    private String content;
    private String author;
    @Column(columnDefinition = "TEXT")
    private String image;
    @Column(columnDefinition = "DATE")
    private LocalDate dateSubmitted;
    private Long numberAccess;
    @OneToMany(mappedBy = "news")
    @JsonBackReference
    private List<NewsType> newsTypeList;
    @OneToMany(mappedBy = "news")
    @JsonBackReference
    private List<Comment> commentList;
    @ManyToMany(mappedBy = "newsList")
    @JsonBackReference
    private List<Manager> managerList;
}
