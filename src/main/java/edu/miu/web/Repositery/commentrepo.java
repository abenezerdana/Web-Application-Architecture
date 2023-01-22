package edu.miu.web.Repositery;

import edu.miu.web.Domain.Comment;
import edu.miu.web.Domain.Post;
import edu.miu.web.Domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface commentrepo extends CrudRepository <Comment,Integer >{
    List<Comment> findAllById(Long id);

    @Query("SELECT users FROM Users users WHERE size( users.posts) >:n")
    public List<User> findAllByPostsGreaterThan(Integer n);

    @Query("SELECT users  FROM Users users join users.posts posts WHERE posts.title = :name")
    public List<User> findAllByPostsByTitleEquals(String name);


    @Query("select com from Comment c join c.posts p join p.users where p.users.id= :a and p.id=:b and c.id =:c")


    public Comment findCommentByUserPost(Long a, Long b, Long c);

}
