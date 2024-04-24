package com.example.cdio8be.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Long accountId;
    private String username;
    private String password;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id", referencedColumnName = "role_id")
    @JsonManagedReference
    private Role role;
    @OneToOne(mappedBy = "account")
    @JsonBackReference
    private User user;
    @OneToOne(mappedBy = "account")
    @JsonBackReference
    private Manager manager;
    @OneToMany(mappedBy = "account")
    @JsonBackReference
    private List<Comment> commentList;
}
