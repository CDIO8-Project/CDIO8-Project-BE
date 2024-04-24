package com.example.cdio8be.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "news_type")
public class NewsType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "news_type_id")
    private Long id;
    private String typeName;
    @ManyToOne
    @JoinColumn(name = "news_id", referencedColumnName = "news_id")
    private News news;
}
