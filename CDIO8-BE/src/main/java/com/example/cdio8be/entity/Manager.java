package com.example.cdio8be.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "manager")
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manager_id")
    private Long managerId;
    private String fullname;
    private String address;
    private String cccd;
    @Column(columnDefinition = "Date")
    private LocalDate birthday;
    @Column(name = "phone")
    private String phoneNumber;
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id", referencedColumnName = "account_id")
    @JsonManagedReference
    private Account account;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "manager_news",
            joinColumns = @JoinColumn(name = "manager_id"),
            inverseJoinColumns = @JoinColumn(name = "news_id"))
    @JsonManagedReference
    private List<News> newsList;
}
