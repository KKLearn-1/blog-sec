package com.example.blog_sec.services;


import com.example.blog_sec.domain.CreatePostRequest;
import com.example.blog_sec.domain.UpdatePostRequest;
import com.example.blog_sec.domain.entities.Post;
import com.example.blog_sec.domain.entities.User;

import java.util.List;
import java.util.UUID;

public interface PostService {
    Post getPost(UUID id);
    List<Post> getAllPosts(UUID categoryId, UUID tagId);
    List<Post> getDraftPosts(User user);
    Post createPost(User user, CreatePostRequest createPostRequest);
    Post updatePost(UUID id, UpdatePostRequest updatePostRequest);
    void deletePost(UUID id);
}
