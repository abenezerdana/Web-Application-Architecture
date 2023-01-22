package edu.miu.web.Controler;
import edu.miu.web.Service.commentservice;

import edu.miu.web.Domain.Comment;
import edu.miu.web.Domain.Post;
import edu.miu.web.Domain.User;
import edu.miu.web.Service.commentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")

public class CommentControler {

    private final commentservice commentservice;
    @Autowired
    public CommentControler(commentservice commentservice)
    {
        this.commentservice = commentservice;
    }


    @GetMapping

    public List<User> findAll(){
        return commentservice.findAll();
    }

    @GetMapping("/{id}")

    public Comment findById(@PathVariable Long id){
        return  commentservice.findById(id);
    }

    @PostMapping

    public void save(@RequestBody Comment comment){
        commentservice.save(comment);
    }

    @GetMapping("/posts")
    public List<Post> findAllPost(@PathVariable Long id){
        return  commentservice.findAllById(id);
    }

    @GetMapping("/filter")
    public List<User> getAllUsersWithPostGreater(@RequestParam(value = "n") Integer n){
        return commentservice.findAllByPostsGreaterThan(n);
    }

    @GetMapping("/sameTitle")
    public List<User> findAllByPostsByTitleEquals(@RequestParam(value = "text") String name) {
        return commentservice.findAllByPostsByTitleEquals(name);
    }

    @GetMapping("/{a}/posts/{b}/comments/{c}")
    public Comment getComment(@PathVariable Long a, @PathVariable Long b, @PathVariable Long c){
        return commentservice.findCommentByUserPost(a,b,c);
    }

}
