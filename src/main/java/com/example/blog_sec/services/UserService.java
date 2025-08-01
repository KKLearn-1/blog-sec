package com.example.blog_sec.services;

import com.example.blog_sec.domain.entities.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}
