package edu.miu.assignment1.repo;

import edu.miu.assignment1.domain.Post;
import edu.miu.assignment1.domain.dto.response.NewPostDto;

import java.util.List;

public interface PostRepo {
    public List<Post> findAll();
    public Post findById(Long id);

    void savePost(NewPostDto p);
}
