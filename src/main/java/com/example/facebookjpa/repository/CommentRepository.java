package com.example.facebookjpa.repository;

import com.example.facebookjpa.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {

}
