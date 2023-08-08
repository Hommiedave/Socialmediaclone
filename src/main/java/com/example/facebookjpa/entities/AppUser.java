package com.example.facebookjpa.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "AppUsers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 200)
    private String firstName;

    @Column(nullable = false,length = 200)
    private String lastName;

    @Column(nullable = false,length = 200)
    private String email;

    @Column(nullable = false,length = 200)
    private String password;

    @Column(nullable = false,length = 200)
    private String confirmPassword;


}
