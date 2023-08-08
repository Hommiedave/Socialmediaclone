package com.example.facebookjpa.entities;

import jakarta.persistence.*;
import lombok.*;
@Table(name = "Posts")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;


    @Column(name = "content", nullable = false, length = 1000)
    private String content;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false, insertable = false,updatable = false,referencedColumnName = "id")
    private AppUser user;

    @Column(name = "timestamp", nullable = false, length = 100)
    private String timeStamp;


}
