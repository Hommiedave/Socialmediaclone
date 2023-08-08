package com.example.facebookjpa.services;

import com.example.facebookjpa.entities.Post;

public interface PostInterface {
    Post createPost(Post post);
    Post updatePost(Long postId, Post updatedPost);
    void deletePost(Long postId);
}
