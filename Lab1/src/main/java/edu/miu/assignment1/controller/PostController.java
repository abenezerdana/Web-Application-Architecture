package edu.miu.assignment1.controller;

import edu.miu.assignment1.domain.Post;
import edu.miu.assignment1.domain.dto.response.NewPostDto;
import edu.miu.assignment1.domain.dto.response.PostDto;
import edu.miu.assignment1.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("api/v1/posts")
@RestController
public class PostController {
    @Autowired
    PostService postService;
    @GetMapping()
    public List<Post> getPosts() {
        return postService.findAll();
    }
    @GetMapping("/{id}")
    public PostDto getPost(@PathVariable("id") Long id) {
        return postService.findById(id);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public void savePost(@RequestBody NewPostDto p) {
        postService.savePost(p);
    }
}
