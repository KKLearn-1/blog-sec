package com.example.blog_sec.repositories;

import com.example.blog_sec.domain.PostStatus;
import com.example.blog_sec.domain.entities.Category;
import com.example.blog_sec.domain.entities.Post;
import com.example.blog_sec.domain.entities.Tag;
import com.example.blog_sec.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {

    List<Post> findAllByStatusAndCategoryAndTagsContaining(PostStatus status, Category category, Tag tag);
    List<Post> findAllByStatusAndCategory(PostStatus status,Category category);
    List<Post> findAllByStatusAndTagsContaining(PostStatus postStatus,Tag tag);
    List<Post> findAllByStatus(PostStatus postStatus);
    List<Post> findAllByAuthorAndStatus(User author, PostStatus status);
}
