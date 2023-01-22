package edu.miu.web.Controler;

import edu.miu.web.Domain.Comment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/comments")
public class Usercontroler {
    @Autowired
    private CommentService commentService;


    @GetMapping

    public List<Comment> findAll(){
        return commentService.findAll();
    }

    @GetMapping("/{id}")

    public Comment findById(@PathVariable Long id){
        return  commentService.findById(id);
    }

    @PostMapping

    public void save(@RequestBody Comment comment){
        commentService.save(comment);
    }

}
