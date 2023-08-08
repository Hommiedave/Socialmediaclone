package com.example.facebookjpa.services.implementations;

import com.example.facebookjpa.entities.Comment;
import lombok.RequiredArgsConstructor;
import com.example.facebookjpa.repository.CommentRepository;
import com.example.facebookjpa.services.CommentInterface;

@RequiredArgsConstructor
public class CommentImpl implements CommentInterface {
    CommentRepository commentRepository;
    @Override
    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public Comment updateComment(Long commentId, Comment updatecomment) {
        return null;
    }

    @Override
    public void deleteComment(Long commentId) {

    }
}
