package edu.miu.web.Service.commentrepoImpl;

import edu.miu.web.Domain.Comment;
import edu.miu.web.Domain.User;
import edu.miu.web.Repositery.commentrepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Service

public class CommentiImpl {
    private commentrepo commentrepo;


    public List<Comment> findAllById(Long id) {
        return commentrepo.findAllById(id);
    }

    public List<User> findAllByPostsGreaterThan(Integer n) {
        return commentrepo.findAllByPostsGreaterThan(n);
    }

    public List<User> findAllByPostsByTitleEquals(String name) {
        return commentrepo.findAllByPostsByTitleEquals(name);
    }


    public Comment findCommentByUserPost(Long a, Long b, Long c) {
        return commentrepo.findCommentByUserPost(a,b,c);
    }


}
