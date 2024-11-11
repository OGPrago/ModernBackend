package com.jg.modernBackend.services;

import com.jg.modernBackend.models.Post;

import java.util.List;

public interface PostServiceInt {
    public List<Post> retrieveAllPost();
    public Post retrievePostById(Long id);
    public Post createPost(Post post);
    public void updatePost(Long id, Post postBody);
    public void deletePost(Long id);
}
