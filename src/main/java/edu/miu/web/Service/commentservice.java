package edu.miu.web.Service;

import edu.miu.web.Domain.Comment;
import edu.miu.web.Domain.Post;
import edu.miu.web.Domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface commentservice {
    public List<User> findAll();
    public Comment findById(Long id);
    public void save(Comment comment );
    public void delete(Long id);
    public List<Post> findAllById(Long id);

    public List<User> findAllByPostsGreaterThan(Integer n);

    public List<User> findAllByPostsByTitleEquals(String name);

    //public Comment findById(Long id);
    public Comment findCommentByUserPost(Long a, Long b, Long c);
}
