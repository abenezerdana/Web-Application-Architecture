package edu.miu.assignment1.service.impl;

import edu.miu.assignment1.domain.Post;
import edu.miu.assignment1.domain.dto.response.NewPostDto;
import edu.miu.assignment1.domain.dto.response.PostDto;
import edu.miu.assignment1.repo.PostRepo;
import edu.miu.assignment1.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepo postRepo;
    @Override
    public List<Post> findAll() {
        return postRepo.findAll();
    }

    @Override
    public PostDto findById(Long id) {
        var post = postRepo.findById(id);
        PostDto postDto = new PostDto(post.getId(), post.getTitle(), post.getAuthor());
        return postDto;
    }

    @Override
    public void savePost(NewPostDto p) {
        postRepo.savePost(p);
    }
}
