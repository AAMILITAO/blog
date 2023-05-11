package com.spring.service;

import java.util.List;

import com.spring.model.Post;

public interface BlogService {
    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
