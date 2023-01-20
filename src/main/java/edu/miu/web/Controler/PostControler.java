package edu.miu.web.Controler;

import edu.miu.web.Domain.Post;
import edu.miu.web.Service.postservice;
import edu.miu.web.Service.postserviceImpl.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/")
public class PostControler {
    @Autowired

    private postservice postservice;


    @GetMapping("posts")
    public List<Post> findAll() {
        return (List<Post>) postservice.findAll();
    }

    @GetMapping("posts/{id}/")

    public Optional<Post> findById(@PathVariable("id") Long id) {
        return postservice.findById(id);
    }

    @DeleteMapping("posts/{id}/")
    public void deleteById(@PathVariable("id") Long id) {
        postservice.deleteById(id);
    }

    @DeleteMapping("posts")
    public void deleteAll() {
        postservice.deleteAll();
    }


}
