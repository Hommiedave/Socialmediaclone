package com.example.facebookjpa.services;

import com.example.facebookjpa.entities.Comment;

public interface CommentInterface {
    Comment createComment(Comment comment);
    Comment updateComment(Long commentId, Comment updatecomment);
    void deleteComment(Long commentId);
}
