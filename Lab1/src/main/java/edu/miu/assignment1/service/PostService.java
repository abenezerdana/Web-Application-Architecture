package edu.miu.assignment1.service;

import edu.miu.assignment1.domain.Post;
import edu.miu.assignment1.domain.dto.response.NewPostDto;
import edu.miu.assignment1.domain.dto.response.PostDto;

import java.util.List;

public interface PostService {
    public List<Post> findAll();
    public PostDto findById(Long id);

    void savePost(NewPostDto p);
}
