package com.example.facebookjpa.services.implementations;

import com.example.facebookjpa.entities.Post;
import com.example.facebookjpa.services.PostInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.facebookjpa.repository.PostRepository;


@RequiredArgsConstructor
@Service
public class PostImpl implements PostInterface {
    private final PostRepository postRepository;
    @Override
    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post updatePost(Long postId, Post updatedPost) {
        return null;
    }

    @Override
    public void deletePost(Long postId) {

    }
}
